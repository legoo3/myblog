package com.junjun.myblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junjun.myblog.dao.BlogDao;
import com.junjun.myblog.domain.Blog;
import com.junjun.myblog.service.BlogService;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;

	@Override
	public List<Blog> getBlogArchive() {
		return blogDao.getBlogArchive();
	}

	@Override
	public List<Blog> getBlogArticle() {
		return blogDao.getBlogArticle();
	}

	@Override
	public List<Blog> searchBlog(String searchParam) {
		return blogDao.searchBlog(searchParam);
	}

}
