package org.shopping.pojo;

import java.util.Date;



public class ShopCarts {

	private Integer shopId;//����ID  
	private String shopName;//��������
	private String goodsImg;//��ƷͼƬ 
	private String goodsName;//��Ʒ����
	private Double shopPrice;//��Ʒ�۸�
	private Double shopPriceNum;//��Ʒ�ܼ۸�
	private Integer cartNum;//��Ʒ����
	private Integer goodsId;//��ƷID
	private Date createTime;//���ʱ��
	private String attrName;//��Ʒ��������
	private String attrVal;//��Ʒ����ֵ
	private Integer cartId;//���ﳵID
	
	
	
	
	
	
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
