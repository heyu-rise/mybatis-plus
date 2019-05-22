package com.pcbwx.mybatis.service.impl;

import com.pcbwx.mybatis.dao.ConfigMapper;
import com.pcbwx.mybatis.dao.DictionaryMapper;
import com.pcbwx.mybatis.enums.ConfigEnum;
import com.pcbwx.mybatis.model.Dictionary;
import com.pcbwx.mybatis.service.ConfigService;
import com.pcbwx.mybatis.service.RedisService;
import com.pcbwx.mybatis.service.SupportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

/**
 * 日志接口实现类
 * 
 * @author 孙贺宇
 *
 */
@Service("supportService")
public class SupportServiceImpl implements SupportService {

	private static Logger logger = LoggerFactory.getLogger(SupportServiceImpl.class);

	@Autowired
	private ConfigService configService;
	@Autowired
	private RedisService redisService;

	@Autowired
	private DictionaryMapper dictionaryMapper;
	@Autowired
	private ConfigMapper configMapper;
	
	@PostConstruct
	public void reloadCacheInfo() {
		logger.info("启动载入缓存...");
		
		configService.setUtilRecord(ConfigEnum.LAST_RELOAD_TIME, new Date(), "");
		// 配置缓存
		reloadDictionary();
	}

	private void reloadDictionary() {
		List<Dictionary> dictionarys = dictionaryMapper.load();
		redisService.reloadDictionary(dictionarys);
	}

	@Override
	public synchronized boolean doReloadCache() {
		logger.info("载入...");
		Date lastDate = configService.getUtilDate(ConfigEnum.LAST_RELOAD_TIME);
		Date now = new Date();
		
		Date lastRecordTime = null;
		boolean haveReload = false;
		lastRecordTime = dictionaryMapper.selectLastRecordTime();
		if (lastDate == null || (lastRecordTime != null && lastDate.before(lastRecordTime))) {
			reloadDictionary();
			haveReload = true;
		}

		//--------------config----------------
		lastRecordTime = configMapper.selectLastRecordTime();
		if (lastDate == null || (lastRecordTime != null && lastDate.before(lastRecordTime))) {
			configService.reloadConfig();
			haveReload = true;
		}
		//-------------记录时间
		if (haveReload) {
			configService.setUtilRecord(ConfigEnum.LAST_RELOAD_TIME, now, "");			
		}
		
		return haveReload;
	}

}

