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
public class Carts {//购物车表

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;//购物车编号
	@OneToOne
	@JoinColumn(name="goodsId")
	//@JsonIgnore
	private Goods good;//商品
	private Integer cartNum;//商品数量
	@OneToOne
	@JoinColumn(name="attrId")
	@JsonIgnore
	private Attribures attr;//商品属性
	@OneToOne
	@JoinColumn(name="valId")
	private AttriburesVal attrVal;//属性值
	
	@ManyToOne
	
	@JoinColumn(name="usersId")
	@JsonIgnore//註解是放棄往下查詢
	private Users user;//所属用户
	
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
