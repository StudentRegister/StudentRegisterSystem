package com.cedus.beans;
/**
 * �༶
 * @author Cedrus
 *
 */
public class SchoolClass extends BmobObject{
	
	private int classNo;//�༶��
	private String majorName;//רҵ����
	private String academyName;//ѧԺ����
	private String schoolName;//ѧУ����
	private static int number;//�༶ѧ������
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
