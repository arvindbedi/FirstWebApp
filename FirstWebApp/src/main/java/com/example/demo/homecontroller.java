package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homecontroller {
    @RequestMapping("Home")
   // @ResponseBody
	public String home()
	{
		System.out.println("HI everyone");
		return "Home"; 
		
		
		
	}

}
