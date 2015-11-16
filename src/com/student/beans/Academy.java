package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * ѧԺ
 * 
 * @author Cedrus
 * 
 */
public class Academy extends BmobObject {
	private String academyName = "";
	private String academyNo = "0000001";
	private String universityName = "";
	private String academyIntroduction = "";

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public String getAcademyNo() {
		return academyNo;
	}

	public void setAcademyNo(String academyNo) {
		this.academyNo = academyNo;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getAcademyIntroduction() {
		return academyIntroduction;
	}

	public void setAcademyIntroduction(String academyIntroduction) {
		this.academyIntroduction = academyIntroduction;
	}

}
