package org.shopping.pojo;

import org.shopping.dao.impl.PageBeanImpl;

public class PageBean<T> {

	
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
		//��ȡ��ҳ��
		Integer a = this.getAllPage();
		if (nowPage<1) {//�������ҳ�ϵ����һҳ
			this.nowPage=1;
		}else if (nowPage>a) {// �����βҳ�����һҳ
			this.nowPage=a;
		}else {
			this.nowPage=nowPage;
		}
		
		
		this.nowPage = nowPage;
	}


	/**
	 * @return
	 * ��ȡ��ҵ������
	 * 
	 */
	public Integer getAllPage() {
		Integer a = this.getCount();
		Integer b = this.getNum();		
		this.allPage = a%b == 0 ? a/b :a/b+1;
		return this.allPage;
	}


	/*public void setAllPage(Integer allPage) {
		this.allPage = allPage;
	}*/


	/**
	 * @param sql
	 * @return
	 * 
	 * ��ȡ�ܼ�¼�������ݿ��ѯ
	 */
	public Integer getCount() {
		PageBeanImpl<T> pa = new PageBeanImpl<T>();
		this.count = (int) pa.getCount();
	    return this.count;
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
