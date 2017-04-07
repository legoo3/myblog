package com.junjun.myblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.junjun.myblog.domain.Blog;
import com.junjun.myblog.domain.BlogType;
import com.junjun.myblog.domain.Blogger;
import com.junjun.myblog.service.BlogService;
import com.junjun.myblog.service.BlogTypeService;
import com.junjun.myblog.service.BloggerService;

/**
 * 首页控制器 最外层的控制器，显示index页面
 * 
 * @author jun
 *
 */
@Controller
public class IndexController {

	@Autowired
	@Qualifier("bloggerService")
	private BloggerService bloggerService;// 负责博主信息
	
	@Autowired
	@Qualifier("blogTypeService")
	private BlogTypeService blogTypeService;
	
	@Autowired
	@Qualifier("blogService")
	private BlogService blogService;
	
	

	@RequestMapping("/index")
	public String index(
			@RequestParam(required = true,defaultValue="1") Integer pageNum,
			@RequestParam(required = true,defaultValue="5") Integer pageSize,
			Model model) {

		Blogger blogger = bloggerService.findByUsername("yuzhijun");// 因为只是自已是主人，所以直接传入名字
		List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();//获取文章类型信息
		List<Blog> blogArchiveList = blogService.getBlogArchive();//获取文章归档信息
		
		PageHelper.startPage(pageNum,pageSize);// 默认从第一页开始，每页五条
		List<Blog> blogArticleList = blogService.getBlogArticle();//获取文章主题信息
		PageInfo<Blog> pageBlog = new PageInfo<Blog>(blogArticleList);//将查出来的blogArticleList绑定到pageInfo中	
		System.out.println("个人资料: "+blogger);
		System.out.println("文章类型: "+blogTypeList);
		System.out.println("文章归档: "+blogArchiveList);
		System.out.println("文章主体: "+blogArticleList);
		
		model.addAttribute("blogger", blogger);// 存入个人资料
		model.addAttribute("blogTypeList", blogTypeList);//存入文章类型
		model.addAttribute("blogArchiveList", blogArchiveList);//存入文章归档
		model.addAttribute("blogArticleList", blogArticleList);//存入文章主题
		model.addAttribute("pageBlog",pageBlog);//设置pageBlog属性
		
		return "index";
	}

}
