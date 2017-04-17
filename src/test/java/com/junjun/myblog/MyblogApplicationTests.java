package com.junjun.myblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.junjun.myblog.service.BlogService;
import com.junjun.myblog.service.BlogTypeService;
import com.junjun.myblog.service.BloggerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyblogApplication.class)
@WebAppConfiguration
public class MyblogApplicationTests {

	@Autowired
	@Qualifier("bloggerService")
	private BloggerService bloggerService;

	@Autowired
	@Qualifier("blogTypeService")
	private BlogTypeService blogTypeService;	

	@Autowired
	@Qualifier("blogService")
	private BlogService blogService;
	

	

	/**
	 * 博主登录
	 */
	@Test
	public void testSelectByUsername() {
		System.out.println(bloggerService.findByUsername("yuzhijun"));
	}
	
	/**
	 * 获取博客类型资料
	 */
	@Test
	public void testGetBlogTypeData(){
		System.out.println(blogTypeService.getBlogTypeData());
	}
	
	/**
	 * 获取博客归档信息
	 */
	@Test
	public void testGetBlogArchive(){
		System.out.println(blogService.getBlogArchive());
	}
	
	/**
	 * 获取博客主体
	 */
	@Test
	public void testGetBlogArticle(){
		System.out.println(blogService.getBlogArticle());
	}
	
	/**
	 * 查询博客
	 */
	@Test
	public void testSearchBlog(){
		System.out.println(blogService.searchBlog("学习与开发"));
	}
	
	
}
