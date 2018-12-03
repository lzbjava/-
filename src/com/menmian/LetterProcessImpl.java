package com.menmian;

public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("填写信的内容："+context);
	}

	@Override
	public void fileEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写收件人信息"+address);
	}

	@Override
	public void letterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("把信放到信封");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("邮寄信件");
	}

}
