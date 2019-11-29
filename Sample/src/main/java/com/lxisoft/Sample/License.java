package com.lxisoft.Sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class License {
@Id
private Integer licenseNo;
private String userName;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Integer getLicenseNo() {
	return licenseNo;
}

public void setLicenseNo(Integer licenseNo) {
	this.licenseNo = licenseNo;
}
}
