package org.shopping.pojo;

import java.util.Date;



public class ShopCarts {

	private Integer shopId;//店铺ID  
	private String shopName;//店铺名称
	private String goodsImg;//商品图片 
	private String goodsName;//商品名称
	private Double shopPrice;//商品价格
	private Double shopPriceNum;//商品总价格
	private Integer cartNum;//商品数量
	private Integer goodsId;//商品ID
	private Date createTime;//添加时间
	private String attrName;//商品属性名称
	private String attrVal;//商品属性值
	private Integer cartId;//购物车ID
	
	
	
	
	
	
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Double getShopPriceNum() {
		return cartNum*shopPrice;
	}
	public void setShopPriceNum(Double shopPriceNum) {
		this.shopPriceNum = shopPriceNum;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getCartNum() {
		return cartNum;
	}
	public void setCartNum(Integer cartNum) {
		this.cartNum = cartNum;
	}
	
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrVal() {
		return attrVal;
	}
	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}
	
	
	
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(Double shopPrice) {
		this.shopPrice = shopPrice;
	}
	
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
	
	
	
}
