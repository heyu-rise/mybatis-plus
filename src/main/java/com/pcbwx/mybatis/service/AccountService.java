package com.pcbwx.mybatis.service;

import java.io.ByteArrayOutputStream;
import java.util.Map;


/**
 * 用户会话模块业务接口
 * @author 孙贺宇
 */

public interface AccountService {
	
	/**
	 * 获取图片流
	 * @param height
	 * @param width
	 * @param format
	 * @param type
	 * @param text
	 * @return
	 */
	ByteArrayOutputStream trans(Integer height, Integer width, String format, Integer type, String text);

}
