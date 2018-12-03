package com.menmian;

public class ModenPostOffice {

	
	private LetterProcess letterProcess = new LetterProcessImpl(); 
	public void sendLetter(String context,String address){
		
		letterProcess.writeContext(context);
		letterProcess.fileEnvelope(address);
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
		
	}
}
