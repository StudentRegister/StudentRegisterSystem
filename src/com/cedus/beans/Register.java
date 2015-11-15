package com.cedus.beans;

/**
 * зЂВс
 * @author Cedrus
 *
 */
public class Register extends BmobObject{
	private String sno;
	private int deptNo;
	private boolean isregistered;
	public String getSname() {
		return sno;
	}
	public void setSname(String sno) {
		this.sno = sno;
	}
	public boolean isIsregistered() {
		return isregistered;
	}
	public void setIsregistered(boolean isregistered) {
		this.isregistered = isregistered;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

}
