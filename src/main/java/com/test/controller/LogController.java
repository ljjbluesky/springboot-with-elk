package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @description: 
 * @author: kai.guo
 * @Date: 2019年9月25日 下午2:22:07
 */
@RestController
@RequestMapping("/log")
public class LogController {

	private static final Logger logger=LoggerFactory.getLogger(LogController.class);
	
	@GetMapping("/test")
	public void test(String name){
		logger.info("welcome  to   this page, name:{}",name);
	}
	
}
