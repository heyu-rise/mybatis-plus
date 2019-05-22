package com.pcbwx.mybatis.enums;
/**
 * 系统配置枚举类
 * @author 孙贺宇
 * @version 1.0
 *
 */
public enum ConfigEnum {
	
	//------------------ 配置文件配置项 -------------------------------
	
	//------------------ config表配置项 -------------------------------

	//------------------ record_utils表记录项 -------------------------
	LAST_RELOAD_TIME("last_reload_time", "上次缓存载入时间");
	
	
	private String code;
	private String descr;
	
	private ConfigEnum(String code, String descr) {
		this.code = code;
		this.descr = descr;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
