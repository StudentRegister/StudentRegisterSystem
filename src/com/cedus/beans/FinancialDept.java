package com.cedus.beans;

/**
 * ����
 * @author Cedrus
 *
 */
public class FinancialDept extends BmobObject{
	
	private String deptName;//��������
	private int deptNo;//���ű��
	private String deptIntroduction;
	private int moneyNeed;//Ӧ��Ǯ
	private int moneyHanded;//�ѽ�Ǯ
	private int moneyowe;//�����Ǯ

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
