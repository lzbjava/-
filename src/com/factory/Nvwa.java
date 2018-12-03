package com.factory;

public class Nvwa {

	public static void main(String[] args) {
		System.out.println("===造黑人==");
		Human black = HumanFactory.createHuman(BlackHuman.class);
		black.cry();
		black.laugh();
		black.talk();
	}
	
}
