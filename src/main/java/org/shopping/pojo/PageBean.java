package org.shopping.pojo;

public class PageBean {

	
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
