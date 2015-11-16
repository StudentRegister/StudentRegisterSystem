package com.student.beans;

import java.util.Date;

import cn.bmob.v3.BmobObject;

/**
 * ѧ��
 * 
 * @author Cedrus
 * 
 */
public class Student extends BmobObject {

	private String sName = "";// ����
	private String sNo = "";// ѧ��
	private String nickname = "";// �ǳ�
	private String classNo = "";// �༶��
	private String sex = "";// true ��,false Ů
	private Date birth = new Date();// ����
	private Date inday = new Date();// ��ѧ����
	private String nation = "��";// ����
	private Integer level = 0;// ��2013��
	private String location = "";// ��Դ��
	private String id = "";// ���֤��
	private String password = "123456";// ��¼����

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getInday() {
		return inday;
	}

	public void setInday(Date inday) {
		this.inday = inday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
