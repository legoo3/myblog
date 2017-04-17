package com.junjun.myblog.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


/**
 * 判断字符串的工具类
 * @author jun
 *
 */
@Component
public class StringUtil {


	/**
	 * 判空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
	

	/**
	 * 判非空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if((str != null) && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
	

	/**
	 * 添加格式
	 * @param str
	 * @return
	 */
	public static String formatLike(String str) {
		if(isNotEmpty(str)) {
			return "%" + str + "%";
		} else {
			return null;
		}
	}
	

	/**
	 * 过滤空白字符串
	 * @param list
	 * @return
	 */
	public static List<String> filterWhite(List<String> list) {
		List<String> resultList = new ArrayList<String>();
		for(String l : list) {
			if(isNotEmpty(l)) {
				resultList.add(l);
			}
		}
		return resultList;
	}

}
