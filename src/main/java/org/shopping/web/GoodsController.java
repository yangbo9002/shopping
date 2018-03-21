package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Goods;
import org.shopping.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Resource
	private GoodsService gs;
	
	/**
	 * 2018��3��20�� ����9:13:32 �
	 * @return List<?>
	 * ��ѯ������Ʒ
	 */
	@RequestMapping("/query")
	@ResponseBody
	public List<?> fun(){
		String sql = "select * from goods;";
		List<?> list = gs.select(sql);
		return list;
	}
	
	/**
	 * 2018��3��20�� ����9:15:27 �
	 * @param str
	 * @param key
	 * @return List<?>
	 * ���ݲ�����ѯ��Ʒ
	 */
	@RequestMapping("/queryByKey")
	@ResponseBody
	public List<?> fun2(String str,String key){
		String sql = "select * from goods where 1=1";
		List<Goods> list = gs.selectByKey(sql, str, key);
		return list;
		
	}
	
	/**
	 * 2018��3��20�� ����3:11:39 �
	 * @return List<?>
	 * ��ѯ��Ʒ����
	 */
	@RequestMapping("/queryAtt")
	@ResponseBody
	public List<?> fun3(){
		String sql = "select  * from attribures";
		List<?> list = gs.selectAttr(sql);
		return list;
	}
	
	@RequestMapping("/queryCation")
	@ResponseBody
	public List<?> fun4(){
		String sql = "select  * from classification";
		List<?> list = gs.selectCation(sql);
		return list;
	}
}
