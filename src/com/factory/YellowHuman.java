package com.factory;

public class YellowHuman implements Human{

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("黄色人类笑");
	}

	@Override
	public void cry() {
		System.out.println("黄色人类哭");
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黄色人类说话");
	}

}
