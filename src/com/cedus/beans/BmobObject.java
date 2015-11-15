package com.cedus.beans;

import java.util.Date;

/**
 * Bmob存储的数据
 * @author Cedrus
 *
 */
public class BmobObject {
	
	private int objectId;//数据的唯一标示，相当于表的主键
	private Date createdAt;//是数据的创建时间
	private Date updatedAt;//数据的最后修改时间
	private int ACL;//数据的操作权限

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
