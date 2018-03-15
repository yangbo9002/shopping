package org.shopping.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Attribures {//商品属性表
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer attrId;//属性ID
	private String attrName;//属性名称
	@OneToMany
	@JoinColumn(name="attrId")
	private List<AttriburesVal> attrVal;//属性值

	@OneToMany
	@JoinColumn(name="attrId")
	private List<GoodAttr> goodAttr;//商品属性关系表
	public Integer getAttrId() {
		return attrId;
	}
	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public List<AttriburesVal> getAttrVal() {
		return attrVal;
	}
	public void setAttrVal(List<AttriburesVal> attrVal) {
		this.attrVal = attrVal;
	}
	public List<GoodAttr> getGoodAttr() {
		return goodAttr;
	}
	public void setGoodAttr(List<GoodAttr> goodAttr) {
		this.goodAttr = goodAttr;
	}

}
