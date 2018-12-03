package com.shipeiqi;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Map getUserBaseINfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "混世魔王");
		baseInfoMap.put("mobileNumber", "51564415656");
		
		
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "这个人的职位是....");
		officeInfo.put("officeTelNumber", "员工的办公电话是，，，");
		
		return officeInfo;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		Map<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeTelNumner", "员工的家庭电话是....");
		homeInfo.put("homeAddress", "员工的家庭地址是。。。");
		
		return homeInfo;
	}

}
