package com.celue;

public class ZhaoYun {

	public static void main(String[] args) {
		Context context;
		System.out.println("刚到吴国时拆第一个========");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println("\n");
		context = new Context(new GivenGreenLight());
		context.operate();
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
