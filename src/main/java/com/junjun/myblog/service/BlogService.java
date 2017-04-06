package com.junjun.myblog.service;

import java.util.List;

import com.junjun.myblog.domain.Blog;

public interface BlogService {
	
	/**
	 * 获取文章归档资料
	 * @return
	 */
	List<Blog> getBlogArchive();
	
	
	/**
	 * 获取博客文章主题
	 * @return
	 */
	List<Blog> getBlogArticle();
	
	

}
