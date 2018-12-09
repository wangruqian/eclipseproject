package com.niuke;

public class Demo {
	/**/
	class Super{
		int flag=1;
		public Super() {
			test();
		}
		public void test() {
			System.out.println("Super.test() flag="+flag);
		}
	}
	class Sub extends Super{
		public Sub(int i) {
			flag=i;
			System.out.println("Sub.Sub() flag="+flag);
		}
		public void test() {
			System.out.println("Sub.test() flag="+flag);
		}
	}
	public static void main(String[] args) {
		new Demo().new Sub(5);
		}

}
