package com.cedus.beans;

import java.util.Date;

/**
 * Bmob�洢������
 * @author Cedrus
 *
 */
public class BmobObject {
	
	private int objectId;//���ݵ�Ψһ��ʾ���൱�ڱ������
	private Date createdAt;//�����ݵĴ���ʱ��
	private Date updatedAt;//���ݵ�����޸�ʱ��
	private int ACL;//���ݵĲ���Ȩ��

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getACL() {
		return ACL;
	}

	public void setACL(int aCL) {
		ACL = aCL;
	}
	

}
