package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * ังทั
 * 
 * @author Cedrus
 * 
 */

public class Schooling extends BmobObject {
	private String sNo = "";
	private String deptNo = "";
	private int moneyowe = 0;

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public int getMoneyowe() {
		return moneyowe;
	}

	public void setMoneyowe(int moneyowe) {
		this.moneyowe = moneyowe;
	}

}
