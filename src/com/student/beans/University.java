package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * ѧУ
 * 
 * @author Cedrus
 * 
 */
public class University extends BmobObject {

	private String schoolName = "";
	private String location = "";
	private String SchoolIntroduction = "";

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSchoolIntroduction() {
		return SchoolIntroduction;
	}

	public void setSchoolIntroduction(String schoolIntroduction) {
		SchoolIntroduction = schoolIntroduction;
	}

}
