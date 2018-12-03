package com.factory;

public class HumanFactory {

	
	
	public static Human createHuman(Class c){
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("必须指定人类颜色");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("人类定义错误");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到指定人类");
			e.printStackTrace();
		}
		return human;
	}
	
	
	
}
