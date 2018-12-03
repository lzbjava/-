package com.celue;

public class Context {

	private IStrategy iStrategy;
	public Context() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Context(IStrategy iStrategy) {
		super();
		this.iStrategy = iStrategy;
	}

	public void operate(){
		this.iStrategy.operate();
	}
	
	
}
