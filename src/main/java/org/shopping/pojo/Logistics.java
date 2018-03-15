package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Logistics {//������Ϣ��
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer logisticsId;//���
	private Integer logisticsOrder;//�����������
	private String logisticsStatus;//����״̬
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;//�ջ���ַ
	public Integer getLogisticsId() {
		return logisticsId;
	}
	public void setLogisticsId(Integer logisticsId) {
		this.logisticsId = logisticsId;
	}
	public Integer getLogisticsOrder() {
		return logisticsOrder;
	}
	public void setLogisticsOrder(Integer logisticsOrder) {
		this.logisticsOrder = logisticsOrder;
	}
	public String getLogisticsStatus() {
		return logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Logistics [logisticsId=" + logisticsId + ", logisticsOrder=" + logisticsOrder + ", logisticsStatus="
				+ logisticsStatus + ", address=" + address + "]";
	}

}
