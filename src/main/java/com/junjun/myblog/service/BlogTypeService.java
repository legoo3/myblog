package com.junjun.myblog.service;

import java.util.List;

import com.junjun.myblog.domain.BlogType;

public interface BlogTypeService {

	/**
	 * 获取博客类别信息的服务方法
	 * @return
	 */
	List<BlogType> getBlogTypeData();

}
