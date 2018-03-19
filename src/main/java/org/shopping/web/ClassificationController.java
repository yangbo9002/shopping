package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Classification;
import org.shopping.service.ClassificationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/classification")
public class ClassificationController {

	@Resource
	private ClassificationService cs;
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Classification> select(){
		String sql = "select * from classification;";
		List<Classification> list = cs.select(sql);
		return list;
	}
}
