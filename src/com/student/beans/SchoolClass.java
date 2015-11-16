package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * �༶
 * 
 * @author Cedrus
 * 
 */
public class SchoolClass extends BmobObject {

	private String classNo = "";// �༶��
	private String majorName = "";// רҵ����
	private String academyName = "";// ѧԺ����
	private String schoolName = "";// ѧУ����
	private static int number = 0;// �༶ѧ������

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
