package org.shopping.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Classification {//商品分类表
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;//分类编号
	private String cname;//分类名称
	//private Integer parentId;
	@OneToMany
	@JoinColumn(name="parentId")
	//@JsonIgnoreProperties("cation")
	//@JsonIgnore
	private List<Classification> cation;//上级分类
	private Date createTime;//创建时间
	
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
	
	public List<Classification> getCation() {
		return cation;
	}
	public void setCation(List<Classification> cation) {
		this.cation = cation;
	}
	@Override
	public String toString() {
		return "Classification [cid=" + cid + ", cname=" + cname + ", cation=" + cation + ", createTime=" + createTime
				+ "]";
	}

}
