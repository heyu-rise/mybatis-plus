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
 * @author K神带你飞
 * @since 2018-08-27
 */
public class Dictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 内部系统id
     */
    private Integer innerId;

    /**
     * 内部系统code
     */
    private String innerCode;

    /**
     * 字符串值
     */
    private String valueStr;

    /**
     * 数字值
     */
    private Integer valueInt;

    /**
     * 时间值
     */
    private Date valueTime;

    private String paramStr1;

    private String paramStr2;

    private Integer paramInt1;

    private Integer paramInt2;

    /**
     * 是否可用 1-可用 0-不可用
     */
    private Integer enable;

    /**
     * 描述
     */
    private String description;

    /**
     * 内部创建时间
     */
    private Date innerCreateTime;

    /**
     * 内部更新时间
     */
    private Date innerUpdateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getInnerCode() {
        return innerCode;
    }

    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

    public Integer getValueInt() {
        return valueInt;
    }

    public void setValueInt(Integer valueInt) {
        this.valueInt = valueInt;
    }

    public Date getValueTime() {
        return valueTime;
    }

    public void setValueTime(Date valueTime) {
        this.valueTime = valueTime;
    }

    public String getParamStr1() {
        return paramStr1;
    }

    public void setParamStr1(String paramStr1) {
        this.paramStr1 = paramStr1;
    }

    public String getParamStr2() {
        return paramStr2;
    }

    public void setParamStr2(String paramStr2) {
        this.paramStr2 = paramStr2;
    }

    public Integer getParamInt1() {
        return paramInt1;
    }

    public void setParamInt1(Integer paramInt1) {
        this.paramInt1 = paramInt1;
    }

    public Integer getParamInt2() {
        return paramInt2;
    }

    public void setParamInt2(Integer paramInt2) {
        this.paramInt2 = paramInt2;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInnerCreateTime() {
        return innerCreateTime;
    }

    public void setInnerCreateTime(Date innerCreateTime) {
        this.innerCreateTime = innerCreateTime;
    }

    public Date getInnerUpdateTime() {
        return innerUpdateTime;
    }

    public void setInnerUpdateTime(Date innerUpdateTime) {
        this.innerUpdateTime = innerUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
        ", id=" + id +
        ", type=" + type +
        ", innerId=" + innerId +
        ", innerCode=" + innerCode +
        ", valueStr=" + valueStr +
        ", valueInt=" + valueInt +
        ", valueTime=" + valueTime +
        ", paramStr1=" + paramStr1 +
        ", paramStr2=" + paramStr2 +
        ", paramInt1=" + paramInt1 +
        ", paramInt2=" + paramInt2 +
        ", enable=" + enable +
        ", description=" + description +
        ", innerCreateTime=" + innerCreateTime +
        ", innerUpdateTime=" + innerUpdateTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
