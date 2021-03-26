package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homecontroller {
    @RequestMapping("Home")
   // @ResponseBody
	public String home(HttpServletRequest obj)
	{
    	HttpSession sess=obj.getSession();
    	String name= obj.getParameter("name");
		System.out.println("HI" +name);
		sess.setAttribute("name",name);
		return "Home"; 
		
		
		
	}

}
