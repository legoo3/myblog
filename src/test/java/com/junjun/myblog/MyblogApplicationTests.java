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
	

	@Test
	public void testSelectByUsername() {
		System.out.println(bloggerService.findByUsername("yuzhijun"));
	}
	
	@Test
	public void testGetBlogTypeData(){
		System.out.println(blogTypeService.getBlogTypeData());
	}
	
	@Test
	public void testGetBlogArchive(){
		System.out.println(blogService.getBlogArchive());
	}
	
	@Test
	public void testGetBlogArticle(){
		System.out.println(blogService.getBlogArticle());
	}
	

}
