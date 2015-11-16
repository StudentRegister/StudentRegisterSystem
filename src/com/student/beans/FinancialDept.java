package com.student.beans;

import cn.bmob.v3.BmobObject;

/**
 * ����
 * 
 * @author Cedrus
 * 
 */
public class FinancialDept extends BmobObject {

	private String deptName = "";// ��������
	private String deptNo = "";// ���ű��
	private String deptIntroduction;
	private int moneyNeed = 0;// Ӧ��Ǯ
	private int moneyHanded = 0;// �ѽ�Ǯ
	private int moneyowe = 0;// �����Ǯ

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
