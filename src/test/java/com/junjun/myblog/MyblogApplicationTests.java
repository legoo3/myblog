package com.junjun.myblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.junjun.myblog.service.BloggerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyblogApplication.class)
@WebAppConfiguration
public class MyblogApplicationTests {

	@Autowired
	@Qualifier("bloggerService")
	BloggerService bloggerService;

	@Test
	public void testSelectByUsername() {
		System.out.println(bloggerService.findByUsername("yuzhijun"));
	}

}
