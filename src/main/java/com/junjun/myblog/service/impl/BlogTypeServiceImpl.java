package com.junjun.myblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junjun.myblog.dao.BlogTypeDao;
import com.junjun.myblog.domain.BlogType;
import com.junjun.myblog.service.BlogTypeService;

@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

	@Autowired
	private BlogTypeDao blogTypeDao;

	@Override
	public List<BlogType> getBlogTypeData() {
		return blogTypeDao.getBlogTypeData();
	}

}
