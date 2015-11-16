package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * зЂВс
 * 
 * @author Cedrus
 * 
 */
public class Register extends BmobObject {
	private String sno = "";
	private String deptNo = "";
	private Boolean isregistered = false;

	public String getSname() {
		return sno;
	}

	public void setSname(String sno) {
		this.sno = sno;
	}

	public Boolean isIsregistered() {
		return isregistered;
	}

	public void setIsregistered(Boolean isregistered) {
		this.isregistered = isregistered;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

}
