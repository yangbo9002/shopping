package org.shopping.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Users {//�û���Ϣ��

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer usersId;//�û�id
	private String loginName;//�˺�
	private String loginPwd;//��¼����
	private String userName;//�û�����
	private String userPhoto;//�û�ͷ��
	private Integer payPwd;//֧������
	private String pwdQuestion;//��������
	private String pwdAnswer;//�����
	@OneToMany
	@JoinColumn(name="usersId")
	private List<Address> address;//�û����ջ���ַ
	@OneToMany
	@JoinColumn(name="usersId")
	private List<Carts> cart;//���ﳵ	
	@OneToMany
	@JoinColumn(name="usersId")
	private List<Orders> orders;//�û�����
	@OneToMany
	@JoinColumn(name="usersId")
	private List<Collect> collect;//�û��ղ�
	private Date createTime;//����ʱ��
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public Integer getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(Integer payPwd) {
		this.payPwd = payPwd;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Carts> getCart() {
		return cart;
	}
	public void setCart(List<Carts> cart) {
		this.cart = cart;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public Integer getUsersId() {
		return usersId;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public String getPwdQuestion() {
		return pwdQuestion;
	}
	public void setPwdQuestion(String pwdQuestion) {
		this.pwdQuestion = pwdQuestion;
	}
	public String getPwdAnswer() {
		return pwdAnswer;
	}
	public void setPwdAnswer(String pwdAnswer) {
		this.pwdAnswer = pwdAnswer;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
