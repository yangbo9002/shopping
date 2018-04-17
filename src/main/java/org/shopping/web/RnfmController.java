package org.shopping.web;



import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.shopping.pojo.Goods;
import org.shopping.service.RnfmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/rnfm")
public class RnfmController {

	@Resource
	private RnfmService rs;
	
	
	
	
	/**
	 * @param mFile
	 * @param goods
	 * @param request
	 * @param map
	 * @return
	 * @throws IOException
	 * 上傳圖片 添加商品
	 */
	@RequestMapping("/Dc")	
	@ResponseBody
	public String rnfmNew(MultipartFile mFile, Goods goods,HttpServletRequest request,ModelMap map)throws IOException{	
		String fileimg = mFile.getOriginalFilename();
		String goodsImg ="${pageContext.request.contextPath }/imgege.jpg";
		if (!fileimg.equals("") && fileimg != null) {
			int last = fileimg.lastIndexOf(".");
			String sub = fileimg.substring(last);
			HttpSession session = request.getSession();
			String path = session.getServletContext().getRealPath("images");
			fileimg = System.currentTimeMillis()+sub;
			
			File file = new File("C:\\Tomcat 7.0\\webapps\\images\\",fileimg);			
			mFile.transferTo(file);			
			goodsImg="/images/"+fileimg;
			goods.setGoodsImg(goodsImg);			
		}									
		rs.rnfmNew(goods);
		return "{}";
	}
	
	
	/**
	 * @param map
	 * @return
	 * 店鋪首頁顯示
	 */
	@RequestMapping("/selectShop")	
	public String selectShop(ModelMap map,String usersId,String shopId){
		
		String sql = "select * from goods where 1=1";
		if(usersId != null && !usersId.equals("")){
			sql += " and shopId = (select shopId from shop where usersId="+usersId+")";
		}
		if(shopId != null && !shopId.equals("")){
			sql += " and shopId="+shopId;
		}
		List<Goods> selsctShop = rs.selsctShop(sql);
		map.put("selsctShop", selsctShop);
		System.out.println("數量"+selsctShop);
		return "shopdc";
		
	}
	
}
