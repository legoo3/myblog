package com.junjun.myblog.dao;

import java.util.List;

import com.junjun.myblog.domain.Blog;

/**
 * BlogDao
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
	 * 获取博客文章主体
	 * @return
	 */
	List<Blog> getBlogArticle();
	
	/**
	 * 按查询参数查询博客
	 * @param queryParam
	 * @return
	 */
	List<Blog> searchBlog(String searchParam);
	
	
}














