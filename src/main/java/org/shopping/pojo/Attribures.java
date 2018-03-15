package org.shopping.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Attribures {//��Ʒ���Ա�
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer attrId;//����ID
	private String attrName;//��������
	@OneToMany
	@JoinColumn(name="attrId")
	private List<AttriburesVal> attrVal;//����ֵ

	@OneToMany
	@JoinColumn(name="attrId")
	private List<GoodAttr> goodAttr;//��Ʒ���Թ�ϵ��
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
