package com.cedus.beans;

import java.util.Date;


/**
 * ѧ��
 * @author Cedrus
 *
 */
public class Student extends BmobObject{
	
	private String sName;//����
	private String sNo;//ѧ��
	private String nickname;//�ǳ�
	private int classNo;//�༶��
	private String sex;//true ��,false Ů
	private Date birth;//����
	private Date inday;//��ѧ����
	private String nation;//����
	private int level;//��2013��
	private String location;//��Դ��
	private String id;//���֤��
	private String password;//��¼����
	public String getSname() {
		return sName;
	}
	public void setSname(String sName) {
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
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String isSex() {
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
