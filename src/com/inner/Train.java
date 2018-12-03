package com.inner;

public class Train {
	
	public static void main(String[] args) {
	
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("eat something");
			}
		};
		p.eat();
	}
}
