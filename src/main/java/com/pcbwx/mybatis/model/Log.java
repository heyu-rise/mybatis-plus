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
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日志等级
     */
    private String level;

    /**
     * 产生日志所在的文件
     */
    private String fileName;

    /**
     * 产生日志所在的类
     */
    private String className;

    /**
     * 产生日志所在的方法
     */
    private String methodName;

    /**
     * 产生日志所在的行数
     */
    private Integer lineNumber;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 日志详细内容
     */
    private String content;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "Log{" +
        ", id=" + id +
        ", level=" + level +
        ", fileName=" + fileName +
        ", className=" + className +
        ", methodName=" + methodName +
        ", lineNumber=" + lineNumber +
        ", title=" + title +
        ", content=" + content +
        ", recordTime=" + recordTime +
        "}";
    }
}
