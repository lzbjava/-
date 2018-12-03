package com.daili;

public class WangPo implements KindWomen{

	private KindWomen kindWomen;
	
	
	public WangPo() {
		super();
		this.kindWomen = new PanJinLian();
		// TODO Auto-generated constructor stub
	}

	public WangPo(KindWomen kindWomen) {
		super();
		this.kindWomen = kindWomen;
	}

	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan();
		
	}

	public void happyWithMan() {
		this.kindWomen.happyWithMan();
	}

}
