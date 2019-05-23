package com.pcbwx.mybatis.service;

import java.util.List;

/**
 * 日志模块业务接口
 * 
 * @author 孙贺宇
 *
 */
public interface LogService {

	int addAction(String code, String action, String user, String value);
	int addAction(String code, String action, String user, String value, String param1);
	int addAction(String code, String action, String user, String value, String param1, String param2);
	int addAction(String code, String action, String user, String value, String param1, String param2, String param3);
	int addAction(String code, String action, String user, String value, List<String> params);

}
