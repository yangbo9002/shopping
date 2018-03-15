package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {//品牌信息表	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer brandId;//品牌编号
	private String brandName;//品牌名称
	private String brandImg;//品牌logo
	private	String brandInfo;//品牌介绍
	private	Date createTime;//创建时间
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandImg() {
		return brandImg;
	}
	public void setBrandImg(String brandImg) {
		this.brandImg = brandImg;
	}
	public String getBrandInfo() {
		return brandInfo;
	}
	public void setBrandInfo(String brandInfo) {
		this.brandInfo = brandInfo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", brandImg=" + brandImg + ", brandInfo="
				+ brandInfo + ", createTime=" + createTime + "]";
	}
	
	
}
