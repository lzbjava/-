package com.inner;

public class Outer {

	private int a = 99;
	int b = 12;
	public class Inner{
		int b = 2;
		public void test(){
			System.out.println("访问外部类的a:"+a);
			System.out.println("访问内部类的b:"+b);
			System.out.println("访问外部类的b:"+Outer.this.b);
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.test();
	}
	
}
