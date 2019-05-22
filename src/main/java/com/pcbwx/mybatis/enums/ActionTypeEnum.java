/**
 * 
 */
package com.pcbwx.mybatis.enums;

/**
 * 行为类型枚举类
 * 
 * @author 孙贺宇
 *
 */
public enum ActionTypeEnum {

	ORDER_EXPRESS_EXPORT("order.express.export", "导出快递单");

	/**
	 * 日志代码
	 */
	private String code;
	/**
	 * 日志描述
	 */
	private String desc;

	private ActionTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
