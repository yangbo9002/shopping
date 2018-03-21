package text;

import org.shopping.dao.impl.PageBeanImpl;
public class Text {

	
	
	public static void main(String[] args) {
		PageBeanImpl<Object> pa = new PageBeanImpl<>();
		long count = pa.getCount();
		System.out.println("zongshu"+count);
	}
	
}
