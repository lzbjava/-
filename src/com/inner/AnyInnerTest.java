package com.inner;

public class AnyInnerTest {

	public static void main(String[] args) {
		HuMan guo = new HuMan();
		guo.user(new Pen() {
			
			@Override
			public void write() {
				System.out.println("写字");
			}
		});
	}
}
