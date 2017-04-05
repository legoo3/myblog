package com.junjun.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junjun.myblog.service.BloggerService;

/**
 * 博主控制器
 * @author jun
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {
	
	@Autowired
	@Qualifier("bloggerService")
	private BloggerService bloggerService;
	
	
	

}















