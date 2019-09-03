package com.sts.testmaven.controller;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

	
	private String name;
	
	@RequestMapping(value="/")
	//@ResponseBody
	ModelAndView test()
	{
		System.out.println("In /");
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="/getdata",produces="application/json")
	@ResponseBody
	Map<String,Object> getData()
	{
		Map<String,Object> d=new HashMap<String,Object>();
		d.put("id", 1);
		d.put("name","namdev");
		d.put("company", "sts");
		d.put("address","mumbai");
		d.put("mobNumber", "9999999999");
		return d;
	}
}
