package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * 学生处
 * 
 * @author Cedrus
 * 
 */
public class StudentDept extends BmobObject {
	private String deptName = "";// 部门名称
	private String deptNo = "";// 部门编号
	private String deptIntroduction = "";

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptIntroduction() {
		return deptIntroduction;
	}

	public void setDeptIntroduction(String deptIntroduction) {
		this.deptIntroduction = deptIntroduction;
	}

}
