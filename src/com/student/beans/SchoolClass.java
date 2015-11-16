package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * 班级
 * 
 * @author Cedrus
 * 
 */
public class SchoolClass extends BmobObject {

	private String classNo = "";// 班级号
	private String majorName = "";// 专业名称
	private String academyName = "";// 学院名称
	private String schoolName = "";// 学校名称
	private static int number = 0;// 班级学生人数

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		SchoolClass.number = number;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
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
