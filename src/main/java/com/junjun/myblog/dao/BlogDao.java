package com.junjun.myblog.dao;

import java.util.List;

import com.junjun.myblog.domain.Blog;

/**
 * BlopDao
 * @author jun
 *
 */
public interface BlogDao {
	
	/**
	 * 获取文章存档信息
	 * @return
	 */
	List<Blog> getBlogArchive();
	
	Blog getBlogTypeById(Integer id);
	
	
	/**
	 * 获取博客文章主题
	 * @return
	 */
	List<Blog> getBlogArticle();

}
