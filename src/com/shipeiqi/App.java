package com.shipeiqi;

public class App {

	public static void main(String[] args) {
		//没有与外系统连接的时候，是这样写的
//		IUserInfo youngGirl = new UserInfo();
		IUserInfo youngGirl = new OuterUserInfo();
		for(int i=0;i<101;i++){
			youngGirl.getHomeAddress();
		}
	}
}
