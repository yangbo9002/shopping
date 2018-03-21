package org.shopping.pojo;

import org.shopping.dao.impl.PageBeanImpl;

public class PageBean<T> {

	
	private Integer nowPage;//当前第几页
	private Integer allPage;//总页数
	private Integer count;//总记录数
	private Integer  num;//每页显示多少条记录
	

	
	//默认每页显示10条记录
	public PageBean() {
		this.setNum(10);
		
	}
	
	
	//指定参数 自定义每页显示多少条记录
	public PageBean(Integer num){
		this.setNum(num);
	}
	
	
	


	public Integer getNowPage() {
		return nowPage;
	}


	//设置当前第几页的方法
	public void setNowPage(Integer nowPage) {
		//获取总页数
		Integer a = this.getAllPage();
		if (nowPage<1) {//如果在首页上点击上一页
			this.nowPage=1;
		}else if (nowPage>a) {// 如果在尾页点击下一页
			this.nowPage=a;
		}else {
			this.nowPage=nowPage;
		}
		
		
		this.nowPage = nowPage;
	}


	/**
	 * @return
	 * 获取总业数方法
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
	 * 获取总记录数向数据库查询
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
