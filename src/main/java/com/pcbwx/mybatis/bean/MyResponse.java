package com.pcbwx.mybatis.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author heyu
 * @date 2019/5/23
 */
@Setter
@Getter
@ToString
public class MyResponse<T>{

	/**
	 * 返回接口状态码
	 */
	private Integer code;
	/**
	 * 接口信息
	 */
	private String msg;
	/**
	 * 返回接口数据
	 */
	private T data;
	
	/**
	 * 重载response
	 */
	public void reset() {
		this.code = null;
		this.msg = null;
		this.data = null;
	}

}
