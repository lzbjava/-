package com.singleton;

public class Emperor {

	private static Emperor emperor = null;
	private Emperor(){
		
	}
	
	public static Emperor getInstance(){
		if(emperor==null){
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void emperorInfo(){
		System.out.println("我是皇帝刘备。。。。。");
	}
	
	
}
