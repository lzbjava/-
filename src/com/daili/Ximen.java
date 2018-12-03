package com.daili;

public class Ximen {

	public static void main(String[] args) {
//		WangPo wangpo = new WangPo();
//		wangpo.makeEyesWithMan();
//		wangpo.happyWithMan();
		JiaShi jiashi = new JiaShi();
		WangPo wangpo = new WangPo(jiashi);
		wangpo.makeEyesWithMan();
		wangpo.happyWithMan();
	}
}
