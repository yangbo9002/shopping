package org.shopping.pojo;

public class PageBean {

	
	private Integer nowPage;//��ǰ�ڼ�ҳ
	private Integer allPage;//��ҳ��
	private Integer count;//�ܼ�¼��
	private Integer  num;//ÿҳ��ʾ��������¼
	
	//Ĭ��ÿҳ��ʾ10����¼
	public PageBean() {
		this.setNum(10);
		
	}
	
	
	//ָ������ �Զ���ÿҳ��ʾ��������¼
	public PageBean(Integer num){
		this.setNum(num);
	}
	
	
	


	public Integer getNowPage() {
		return nowPage;
	}


	//���õ�ǰ�ڼ�ҳ�ķ���
	public void setNowPage(Integer nowPage) {
		
		
		
		this.nowPage = nowPage;
	}


	public Integer getAllPage() {
		return allPage;
	}


	public void setAllPage(Integer allPage) {
		this.allPage = allPage;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(Integer count) {
		this.count = count;
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	
	
}
