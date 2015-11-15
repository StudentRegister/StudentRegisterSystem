package com.cedus.beans;
/**
 * 班级
 * @author Cedrus
 *
 */
public class SchoolClass extends BmobObject{
	
	private int classNo;//班级号
	private String majorName;//专业名称
	private String academyName;//学院名称
	private String schoolName;//学校名称
	private static int number;//班级学生人数
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		SchoolClass.number = number;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getAcademyName() {
		return academyName;
	}
	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	

}
