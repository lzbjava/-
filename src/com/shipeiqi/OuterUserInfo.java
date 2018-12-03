package com.shipeiqi;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map<String, String> baseInfo = super.getUserBaseINfo();
	private Map<String, String> homeInfo = super.getUserHomeInfo();
	private Map<String, String> officeInfo = super.getUserOfficeInfo();

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
