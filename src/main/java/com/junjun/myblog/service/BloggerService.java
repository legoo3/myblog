package com.junjun.myblog.service;

import com.junjun.myblog.domain.Blogger;

/**
 * BloggerService
 * @author jun
 *
 */
public interface BloggerService {
	
	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	Blogger findByUsername(String username);

}
