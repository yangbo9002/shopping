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
	 * 2018年3月20日 上午9:13:32 杨波
	 * @return List<?>
	 * 查询所有商品
	 */
	@RequestMapping("/query")
	@ResponseBody
	public List<?> fun(){
		String sql = "select * from goods;";
		List<?> list = gs.select(sql);
		return list;
	}
	
	/**
	 * 2018年3月20日 上午9:15:27 杨波
	 * @param str
	 * @param key
	 * @return List<?>
	 * 根据参数查询商品
	 */
	@RequestMapping("/queryByKey")
	@ResponseBody
	public List<?> fun2(String str,String key){
		String sql = "select * from goods where 1=1";
		List<Goods> list = gs.selectByKey(sql, str, key);
		return list;
		
	}
	
	/**
	 * 2018年3月20日 下午3:11:39 杨波
	 * @return List<?>
	 * 查询商品属性
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
