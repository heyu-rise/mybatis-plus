package com.pcbwx.mybatis.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import com.pcbwx.mybatis.model.TaskClock;

public interface TaskClockMapper extends BaseMapper<TaskClock> {
	List<TaskClock> selectByTask(@Param("task") String task);
}