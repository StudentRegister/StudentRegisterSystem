package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * רҵ
 * 
 * @author Cedrus
 * 
 */
public class Major extends BmobObject {
	private String majorName = "";
	private String majorNo = "";
	private String academyName = "";
	private String majorIntroduction = "";

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}

	public String getMajorIntroduction() {
		return majorIntroduction;
	}

	public void setMajorIntroduction(String majorIntroduction) {
		this.majorIntroduction = majorIntroduction;
	}

}
