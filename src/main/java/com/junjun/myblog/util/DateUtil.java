package com.junjun.myblog.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 日期工具类
 * @author jun
 *
 */
@Component
public class DateUtil {


	/**
	 * 将日期类型格式化为字符串类型
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date){
		String result="";
		String formatStr = "yyyy-mm-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(formatStr);
		if(date!=null){
			result=sdf.format(date);
		}
		System.out.println(date);
		System.out.println(result);
		return result;
	}
	

	/**
	 * 字符串类型转化为日期
	 * @param str
	 * @param format
	 * @return
	 * @throws Exception
	 */
	public static Date formatString(String str) throws Exception{
		if(StringUtil.isEmpty(str)){
			return null;
		}
		String formatStr = "yyyy-mm-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(formatStr);
		return sdf.parse(str);
	}
	
	/**
	 * 获取当前日期
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentDateStr()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	
}
