  package org.shopping.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Shop {//���̱�
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer shopId;//���̱��
		private String shopName;//��������-����
		private String shopLogo;//����logo
		//private Integer usersId;//�����û�
		private String shopText;//������Ϣ

		@OneToOne
		@JoinColumn(name="usersId")
		private Users user;//��������
		public Users getUser() {
			return user;
		}
		public void setUser(Users user) {
			this.user = user;
		}
		public Integer getShopId() {
			return shopId;
		}
		public void setShopId(Integer shopId) {
			this.shopId = shopId;
		}
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
		public String getShopLogo() {
			return shopLogo;
		}
		public void setShopLogo(String shopLogo) {
			this.shopLogo = shopLogo;
		}
		public String getShopText() {
			return shopText;
		}
		public void setShopText(String shopText) {
			this.shopText = shopText;
		}
		
		
		

}
