package com.cedus.beans;

/**
 * ังทั
 * @author Cedrus
 *
 */

public class Schooling extends BmobObject{
	private String sNo;
	private int deptNo;
	private int moneyowe;
	
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
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
