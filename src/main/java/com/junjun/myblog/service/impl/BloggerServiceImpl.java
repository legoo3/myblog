package com.junjun.myblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junjun.myblog.dao.BloggerDao;
import com.junjun.myblog.domain.Blogger;
import com.junjun.myblog.service.BloggerService;

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {
	
	@Autowired
	private BloggerDao bloggerDao;
	
	@Override
	public Blogger findByUsername(String username) {
		return bloggerDao.selectByUsername(username);
	}

}
