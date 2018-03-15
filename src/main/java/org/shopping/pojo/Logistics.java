package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Logistics {//物流信息表
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer logisticsId;//编号
	private Integer logisticsOrder;//物流订单编号
	private String logisticsStatus;//物流状态
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;//收货地址
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
