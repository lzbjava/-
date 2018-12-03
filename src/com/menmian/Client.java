package com.menmian;

public class Client {

	public static void main(String[] args) {
		
//		LetterProcess letterProcess = new LetterProcessImpl();
//		letterProcess.writeContext("hello 你好吗？");//写信
//		letterProcess.fileEnvelope("湖北省武汉市");//写信封
//		letterProcess.letterIntoEnvelope();//放入信封
//		letterProcess.sendLetter();//投递
		
		ModenPostOffice office = new ModenPostOffice();
		String context = "最近你好吗周杰伦";
		String address = "湖北省武汉市洪山区";
		office.sendLetter(context, address);
	}
}
