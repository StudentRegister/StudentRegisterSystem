package com.cedus.beans;

/**
 * 财务处
 * @author Cedrus
 *
 */
public class FinancialDept extends BmobObject{
	
	private String deptName;//部门名称
	private int deptNo;//部门编号
	private String deptIntroduction;
	private int moneyNeed;//应交钱
	private int moneyHanded;//已交钱
	private int moneyowe;//还差的钱

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

	public int getMoneyNeed() {
		return moneyNeed;
	}

	public void setMoneyNeed(int moneyNeed) {
		this.moneyNeed = moneyNeed;
	}

	public int getMoneyHanded() {
		return moneyHanded;
	}

	public void setMoneyHanded(int moneyHanded) {
		this.moneyHanded = moneyHanded;
	}

	public int getMoneyowe() {
		return moneyowe;
	}

	public void setMoneyowe(int moneyowe) {
		this.moneyowe = moneyowe;
	}



}
