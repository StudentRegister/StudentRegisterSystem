package com.cedus.beans;

import java.util.Date;


/**
 * 学生
 * @author Cedrus
 *
 */
public class Student extends BmobObject{
	
	private String sName;//姓名
	private String sNo;//学号
	private String nickname;//昵称
	private int classNo;//班级号
	private String sex;//true 男,false 女
	private Date birth;//生日
	private Date inday;//入学日期
	private String nation;//民族
	private int level;//如2013级
	private String location;//生源地
	private String id;//身份证号
	private String password;//登录密码
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
