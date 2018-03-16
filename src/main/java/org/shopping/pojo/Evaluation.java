package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Evaluation {//商品评价表

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	@ManyToOne
	@JoinColumn(name="shopId")
	private Shop shop;//所属店铺
	@OneToOne
	@JoinColumn(name="ordersId")
	private Orders order;//所属订单
	@OneToOne
	@JoinColumn(name="usersId")
	private Users user;//评价人
	@ManyToOne
	@JoinColumn(name="goodsId")
	private Goods good;//评价商品
	private Integer rating;//评分
	private String content;//点评内容
	private String image;//上传图片
	private String shopReply;//店铺回复
	private Date createTime;//评价时间
	private Date replyTime;//店铺回复时间
	public Integer getId() {
		return eid;
	}
	public void setId(Integer id) {
		this.eid = id;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getShopReply() {
		return shopReply;
	}
	public void setShopReply(String shopReply) {
		this.shopReply = shopReply;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	
	
}
