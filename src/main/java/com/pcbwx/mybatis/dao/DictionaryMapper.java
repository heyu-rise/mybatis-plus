package com.pcbwx.mybatis.dao;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pcbwx.mybatis.bean.response.ResponseList;
import org.apache.ibatis.annotations.Select;

import com.pcbwx.mybatis.model.Dictionary;

public interface DictionaryMapper extends BaseMapper<Dictionary> {
	List<Dictionary> load();
	
	@Select("select GREATEST(COALESCE(max(create_time)),COALESCE(max(update_time),0)) from dictionary")
	Date selectLastRecordTime();
	
	List<Dictionary> loadByType(String type);

	ResponseList loadId();
}