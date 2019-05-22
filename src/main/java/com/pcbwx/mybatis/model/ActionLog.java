package com.pcbwx.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 孙贺宇
 * @since 2018-08-27
 */
public class ActionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String serviceCode;

    private String code;

    /**
     * eda系统会员号
     */
    private String user;

    /**
     * 操作类型
     */
    private String action;

    /**
     * 记录值
     */
    private String value;

    /**
     * 操作参数
     */
    private String param1;

    private String param2;

    private String param3;

    private String param4;

    /**
     * 记录时间
     */
    private Date recordTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "ActionLog{" +
        ", id=" + id +
        ", serviceCode=" + serviceCode +
        ", code=" + code +
        ", user=" + user +
        ", action=" + action +
        ", value=" + value +
        ", param1=" + param1 +
        ", param2=" + param2 +
        ", param3=" + param3 +
        ", param4=" + param4 +
        ", recordTime=" + recordTime +
        "}";
    }
}
