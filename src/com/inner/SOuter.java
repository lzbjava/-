package com.inner;

public class SOuter {
	
	private int a = 99;//外部类的私有变量
	static int b = -1;//外部类的静态变量
	//静态内部类
	public static class SInner{
		int b = 2;//内部类的变量
		public void test(){
			System.out.println("访问外部类中的b:"+SOuter.b);
			System.out.println("访问内部类中的b:"+b);
			System.out.println("访问外部类的a:"+new SOuter().a);
		}
	}
	
	public static void main(String[] args) {
		SInner si = new SInner();
		si.test();
	}
}
