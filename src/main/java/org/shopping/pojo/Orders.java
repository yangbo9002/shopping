package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {//������
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;//�������      �Զ������ı���������ݿ��Ĳ���
	private Integer	orderNo;//������         �ֶ����ɵĶ�����  
	private Double goodsMoney;//��Ʒ�ܽ��
	private Double deliverMoney;//�˷�
	private Integer orderStatus;//����״̬		0:������	1:������	2:�û�ȷ���ջ�	3:�û�����
	private Integer payType;//֧����ʽ			0:����֧��     1:��������
	private Integer isPay;//�Ƿ�֧��			0:δ֧��	 1:��֧��
	private String userName;//�ջ�������
	private String address;//�ջ���ַ
	private String userPhone;//�ջ����ֻ�����
	private Integer isClosed;//�����Ƿ����		0:δ���	1:�����
	private Date createTime;//�µ�ʱ��
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
