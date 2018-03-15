package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttriburesVal {//属性值表
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer valId;//编号
	private String attrVal;//属性值
	public Integer getValId() {
		return valId;
	}
	public void setValId(Integer valId) {
		this.valId = valId;
	}
	public String getAttrVal() {
		return attrVal;
	}
	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}
	@Override
	public String toString() {
		return "AttriburesVal [valId=" + valId + ", attrVal=" + attrVal + "]";
	}
	
	

}
