package com.junjun.myblog.dao;

import com.junjun.myblog.domain.Blogger;

/**
 * BloggerDao接口
 * @author jun
 *
 */
public interface BloggerDao {
		
	/**
	 * 根据用户名查询
	 * @param username
	 * @return
	 */
	Blogger selectByUsername(String username);
	

}
