package com.cedus.beans;


/**
 * ѧ����
 * @author Cedrus
 *
 */
public class StudentDept extends BmobObject{
	private String deptName;// ��������
	private int deptNo;// ���ű��
	private String deptIntroduction;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptIntroduction() {
		return deptIntroduction;
	}

	public void setDeptIntroduction(String deptIntroduction) {
		this.deptIntroduction = deptIntroduction;
	}

	
}
