package com.pcbwx.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pcbwx.mybatis.model.RecordUtils;

public interface RecordUtilsMapper extends BaseMapper<RecordUtils> {
	int updateByName(RecordUtils record);
	
	RecordUtils selectByName(String recordName);
}