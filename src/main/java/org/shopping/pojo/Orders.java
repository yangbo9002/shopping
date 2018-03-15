package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {//订单表
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;//订单编号      自动增长的编号用来数据库间的操作
	private Integer	orderNo;//订单号         手动生成的订单号  
	private Double goodsMoney;//商品总金额
	private Double deliverMoney;//运费
	private Integer orderStatus;//订单状态		0:待发货	1:配送中	2:用户确认收货	3:用户拒收
	private Integer payType;//支付方式			0:在线支付     1:货到付款
	private Integer isPay;//是否支付			0:未支付	 1:已支付
	private String userName;//收货人名称
	private String address;//收货地址
	private String userPhone;//收货人手机号码
	private Integer isClosed;//订单是否完结		0:未完结	1:已完结
	private Date createTime;//下单时间
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Double getGoodsMoney() {
		return goodsMoney;
	}
	public void setGoodsMoney(Double goodsMoney) {
		this.goodsMoney = goodsMoney;
	}
	public Double getDeliverMoney() {
		return deliverMoney;
	}
	public void setDeliverMoney(Double deliverMoney) {
		this.deliverMoney = deliverMoney;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Integer getIsPay() {
		return isPay;
	}
	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(Integer isClosed) {
		this.isClosed = isClosed;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
