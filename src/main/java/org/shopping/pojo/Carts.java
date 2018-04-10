package org.shopping.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Carts {//���ﳵ��

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;//���ﳵ���
	@OneToOne
	@JoinColumn(name="goodsId")
	//@JsonIgnore
	private Goods good;//��Ʒ
	private Integer cartNum;//��Ʒ����
	@OneToOne
	@JoinColumn(name="attrId")
	@JsonIgnore
	private Attribures attr;//��Ʒ����
	@OneToOne
	@JoinColumn(name="valId")
	private AttriburesVal attrVal;//����ֵ
	
	@ManyToOne
	
	@JoinColumn(name="usersId")
	@JsonIgnore//�]���Ƿŗ����²�ԃ
	private Users user;//�����û�
	
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getCartNum() {
		return cartNum;
	}
	public void setCartNum(Integer cartNum) {
		this.cartNum = cartNum;
	}
	public Attribures getAttr() {
		return attr;
	}
	public void setAttr(Attribures attr) {
		this.attr = attr;
	}
	public AttriburesVal getAttrVal() {
		return attrVal;
	}
	public void setAttrVal(AttriburesVal attrVal) {
		this.attrVal = attrVal;
	}
	
}
