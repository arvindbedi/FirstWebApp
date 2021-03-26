package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeMvController {
   @RequestMapping("Room")
   public ModelAndView room(@RequestParam("roomNo") String myRoom)
   {
	
	   ModelAndView mv=new ModelAndView();
	   System.out.println("HI" +myRoom);
	   mv.addObject("roomNo",myRoom);
	   mv.setViewName("Room");
	   System.out.println("HI" +myRoom);
	   return mv;
	   
   }
   
}
