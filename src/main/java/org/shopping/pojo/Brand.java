package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {//Ʒ����Ϣ��	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer brandId;//Ʒ�Ʊ��
	private String brandName;//Ʒ������
	private String brandImg;//Ʒ��logo
	private	String brandInfo;//Ʒ�ƽ���
	private	Date createTime;//����ʱ��
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
