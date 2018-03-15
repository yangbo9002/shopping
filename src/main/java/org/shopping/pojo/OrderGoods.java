package org.shopping.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderGoods {//������Ʒ��
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ogid;//�������
	//private Integer orderId;
	@ManyToOne
	@JoinColumn(name="ordersId")
	private Orders order;//��������
	private Integer goodsNum;//��Ʒ����
	@OneToOne
	@JoinColumn(name="goodsId")
	private Goods goods;//������Ʒ
	public Integer getOgid() {
		return ogid;
	}
	public void setOgid(Integer ogid) {
		this.ogid = ogid;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	
	

}
