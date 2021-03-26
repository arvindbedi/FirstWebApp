package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ModelObjectAlien {
	@RequestMapping("Alien")
	public ModelAndView alien(Alien alien)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("Alien");
		System.out.println("HI" +alien.aid +" "+ alien.aName + alien.lang);
		return mv;
		
	}
	

}
