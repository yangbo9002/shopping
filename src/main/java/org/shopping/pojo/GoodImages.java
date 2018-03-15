package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GoodImages {//…Ã∆∑Õº∆¨

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer imageId;
	private String imageUrl;//Õº∆¨µÿ÷∑
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "GoodImages [imageId=" + imageId + ", imageUrl=" + imageUrl + "]";
	}
	
}
