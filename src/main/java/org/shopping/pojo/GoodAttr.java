package org.shopping.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GoodAttr {//��Ʒ���Թ�ϵ��
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer gaId;

	public Integer getGaId() {
		return gaId;
	}

	public void setGaId(Integer gaId) {
		this.gaId = gaId;
	}


}
