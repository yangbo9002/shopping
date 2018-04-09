package org.shopping.web.interceptor;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;  
  


public class CommonInterceptor extends HandlerInterceptorAdapter{
	
	
	 @Override    
	    public boolean preHandle(HttpServletRequest request,    
	            HttpServletResponse response, Object handler) throws Exception {    
	         
	           
	         
	        
	           
	          
	        String username =  (String)request.getSession().getAttribute("user");   
	        if(username == null){    
	            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);  
	            return false;  
	        }else  
	            return true;     
	    } 
}
