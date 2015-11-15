package com.cedus.beans;

/**
 * רҵ
 * @author Cedrus
 *
 */
public class Major extends BmobObject{
	private String majorName;
	private int majorNo;
	private String academyName;
	private String majorIntroduction;
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
	public int getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}
	public String getMajorIntroduction() {
		return majorIntroduction;
	}
	public void setMajorIntroduction(String majorIntroduction) {
		this.majorIntroduction = majorIntroduction;
	}
	
	

}
