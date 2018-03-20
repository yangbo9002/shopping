package org.shopping.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Classification {//��Ʒ�����
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;//������
	private String cname;//��������
	//private Integer parentId;
	@OneToOne
	@JoinColumn(name="parentId")
	@JsonIgnoreProperties("cation")
	private Classification cation;//�ϼ�����
	private Date createTime;//����ʱ��
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Classification getCation() {
		return cation;
	}
	public void setCation(Classification cation) {
		this.cation = cation;
	}
	@Override
	public String toString() {
		return "Classification [cid=" + cid + ", cname=" + cname + ", cation=" + cation + ", createTime=" + createTime
				+ "]";
	}

}
