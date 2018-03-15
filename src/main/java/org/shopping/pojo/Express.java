package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Express {//�����Ϣ��

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer expressId;//���
	private String expressName;//�������
	public Integer getExpressId() {
		return expressId;
	}
	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}
	public String getExpressName() {
		return expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	@Override
	public String toString() {
		return "Express [expressId=" + expressId + ", expressName=" + expressName + "]";
	}
	
	
}
