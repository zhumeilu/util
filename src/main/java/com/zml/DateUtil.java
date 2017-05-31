package com.zml;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 日期工具类
 * @Description: 
 * @author: 朱美炉
 * @date: 2017年5月31日
 * @version: V1.0
 * @类全名：com.zml.DateUtil
 */
public class DateUtil {
	/**
	 * 获取某一天的最开始
	 * @return
	 */
	public static Date getDayOfFirst(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);	//24小时制
		cal.set(Calendar.MINUTE, 0);	//设置分钟
		cal.set(Calendar.SECOND, 0);	//设置秒数
		cal.set(Calendar.MILLISECOND, 0);	//设置毫秒
		return cal.getTime();
	}
	
	public static Date getDayOfEnd(Date date){
		Date dayOfFirst = getDayOfFirst(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayOfFirst);
		cal.add(Calendar.DATE, 1);
		cal.add(Calendar.MILLISECOND, -1);
		return cal.getTime();
	}
	
	
	@Test
	public void testName() throws Exception {
		System.out.println(getDayOfEnd(new Date()));
	}
}
