package com.junjun.myblog.dao;

import java.util.List;

import com.junjun.myblog.domain.BlogType;

/**
 * 博客类型操作的Dao
 * @author jun
 *
 */
public interface BlogTypeDao {
	
	//获取博客类别信息
	List<BlogType> getBlogTypeData();

}
