package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Carts {//购物车表

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;//购物车编号
	@OneToOne
	@JoinColumn(name="goodsId")
	private Goods good;//商品
	private Integer cartNum;//商品数量
	@OneToOne
	@JoinColumn(name="attrId")
	private Attribures attr;//商品属性
	@OneToOne
	@JoinColumn(name="valId")
	private AttriburesVal attrVal;//属性值
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
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
