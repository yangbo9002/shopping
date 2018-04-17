package org.shopping.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.shopping.pojo.Goods;
import org.shopping.service.GoodsService;
import org.shopping.service.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Resource
	private GoodsService gs;
	@Resource
	private PageService<Goods> ps;
	
	/**
	 * 2018年3月20日 上午9:13:32 杨波
	 * @return List<?>
	 * 查询所有商品
	 */
	@RequestMapping("/query")
	public String fun(ModelMap map){
		String sql = "select * from goods";
		List<Goods> list = gs.select(sql);
		List<?> cationList = gs.selectCation("SELECT * from classification where parentId is null;");
		map.put("classification", cationList);
		map.put("goods", list);
		return "index";
		
	}
	
	
	
	
	
	
	/**
	 * 2018年3月20日 上午9:15:27 杨波
	 * @param str
	 * @param key
	 * @return List<?>
	 * 根据参数查询商品
	 */
	@RequestMapping("/queryByKey")
	public String fun2(ModelMap map,String str,String key){
		try {
			key = URLDecoder.decode(key, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("    "+key);
		str = "0";
		String sql = "select * from goods where 1=1";
		List<Goods> list = gs.selectByKey(sql, str, key);
		List<?> cationList = gs.selectCation("SELECT * from classification where parentId is null;");
		map.put("classification", cationList);
		map.put("goods", list);
		return "index";
		
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
	public String  fun4(ModelMap map,String sPageNo,String status,String cid){
		if (sPageNo == null || sPageNo.trim().length() == 0) {
            sPageNo = "1";
        }
        Integer pageNo = null;
        try {
            pageNo = Integer.parseInt(sPageNo);
        } catch (NumberFormatException e) {
            System.out.println("页面异常");
        }
        

		String querySql = "select count(*) from Goods where 1=1";
		String sql = "select * from goods where 1=1";
        
		if(cid != null && !cid.equals("")){
        	sql += " and cid = "+cid ;
        	querySql += " and cid = "+cid ;
        }
        
        if(status != null && !status.equals("")){
        	if(status.equals("1")){
        		sql += " order by visitNum desc";//按人气排序
        	} else if(status.equals("2")){
        		sql += " order by saleNum desc";//按销量排序
        	} else if(status.equals("3")){
        		sql += " order by shopPrice desc";//按价格从高到低排序
        	} else if(status.equals("4")){
        		sql += " order by shopPrice asc";//按价格从低到高排序
        	}
        }
        
        
		Map<String, Object> res = ps.query(pageNo, querySql, sql);
            //往res中 添加当前的页序号
            res.put("currentPage", pageNo);
          
		List<?> cationList = gs.selectCation("SELECT * from classification where parentId is null;");
		map.put("classification", cationList);
		map.put("res", res);
		map.put("sPageNo", sPageNo);
		return "classification";
	}
}
