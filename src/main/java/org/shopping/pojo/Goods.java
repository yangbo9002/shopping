package org.shopping.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Goods {//��Ʒ��Ϣ��
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer goodsId;//��Ʒ���
	private String goodsName;//��Ʒ���
	private String goodsImg;//��ƷͼƬ/////////////
	private Double marketPrice;//�г��۸�
	private Double shopPrice;//���̼۸�  ///////////////////
	private Integer goodsStock;//��Ʒ�ܿ��
	private String goodsTips;//������Ϣ
	private String isNew;//�Ƿ���Ʒ      Y:��Ʒ     N:������Ʒ
	private String isBoard;//�Ƿ��ϼ�	  Y:�ϼ�     N:�¼�	
	//private Integer brandId;
	@ManyToOne
	@JoinColumn(name="brandId")
	private Brand brand;//����Ʒ��
	private String goodsInfo;//��Ʒ����/////////
	private Integer saleNum;//��������
	private Integer visitNum;//������///////
	//private Integer shopId;
	@ManyToOne
	@JoinColumn(name="shopId")
	private Shop shop;//��������(��������)
	@ManyToOne
	@JoinColumn(name="cid")
	private Classification cation;//���һ���ϼ�����
	//private Integer attrId;
	@OneToMany
	@JoinColumn(name="goodsId")
	private List<GoodAttr> goodAttr;//��Ʒ���Թ�ϵ��
	@OneToMany
	@Cascade(value={CascadeType.SAVE_UPDATE}) 
	@JoinColumn(name="goodsId")
	private List<GoodImages> image;

	private Date createTime;//���ʱ��
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public List<GoodAttr> getGoodAttr() {
		return goodAttr;
	}
	public void setGoodAttr(List<GoodAttr> goodAttr) {
		this.goodAttr = goodAttr;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public Double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Double getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(Double shopPrice) {
		this.shopPrice = shopPrice;
	}
	public Integer getGoodsStock() {
		return goodsStock;
	}
	public void setGoodsStock(Integer goodsStock) {
		this.goodsStock = goodsStock;
	}
	public String getGoodsTips() {
		return goodsTips;
	}
	public void setGoodsTips(String goodsTips) {
		this.goodsTips = goodsTips;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	public Integer getSaleNum() {
		return saleNum;
	}
	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}
	public Integer getVisitNum() {
		return visitNum;
	}
	public void setVisitNum(Integer visitNum) {
		this.visitNum = visitNum;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Classification getCation() {
		return cation;
	}
	public void setCation(Classification cation) {
		this.cation = cation;
	}
	public List<GoodImages> getImage() {
		return image;
	}
	public void setImage(List<GoodImages> image) {
		this.image = image;
	}
	public String getIsNew() {
		return isNew;
	}
	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}
	public String getIsBoard() {
		return isBoard;
	}
	public void setIsBoard(String isBoard) {
		this.isBoard = isBoard;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsImg=" + goodsImg + ", marketPrice="
				+ marketPrice + ", shopPrice=" + shopPrice + ", goodsStock=" + goodsStock + ", goodsTips=" + goodsTips
				+ ", isNew=" + isNew + ", isBoard=" + isBoard + ", brand=" + brand + ", goodsInfo=" + goodsInfo
				+ ", saleNum=" + saleNum + ", visitNum=" + visitNum + ", shop=" + shop + ", cation=" + cation
				+ ", goodAttr=" + goodAttr + ", image=" + image + ", createTime=" + createTime + "]";
	}

	
}
