package com.pcbwx.mybatis.service.impl;

import com.pcbwx.mybatis.enums.DictionaryEnum;
import com.pcbwx.mybatis.model.Dictionary;
import com.pcbwx.mybatis.service.CacheService;
import com.pcbwx.mybatis.util.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("cacheService")
public class CacheServiceImpl implements CacheService {
	
	private static Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);
	
	// type#id,Dictionary / type|code,Dictionary
	private Map<String, Dictionary> dictionaryCache = new HashMap<String, Dictionary>();
	private Map<String, List<Dictionary>> dictionaryByTypeCache = new HashMap<String, List<Dictionary>>();
		
	@Override
	public void reloadDictionary(List<Dictionary> dictionarys) {
//		logger.info("载入字典表相关信息");
		Map<String, Dictionary> newDictionaryCache = new HashMap<String, Dictionary>();
		if (dictionarys != null && !dictionarys.isEmpty()) {
			for (Dictionary record : dictionarys) {
				if (record.getInnerId() != null) {
					String key = record.getType() + "#" + record.getInnerId();
					newDictionaryCache.put(key, record);
				}
				if (record.getInnerCode() != null) {
					String key = record.getType() + "|" + record.getInnerCode();
					newDictionaryCache.put(key, record);
				}
			}
			dictionaryCache = newDictionaryCache;
			logger.info("字典缓存条数:" + dictionarys.size());
			
			try {
				dictionaryByTypeCache = DataUtil.list2mapList(dictionarys, Dictionary.class, "type");
				logger.info("字典类别缓存条数:" + dictionaryByTypeCache.size());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//----------------------------------------------------------------------
	private String getDictionaryKey(DictionaryEnum type, Integer innerId) {
		String dictionaryKey = type.getCode() + "#" + innerId;
		return dictionaryKey;
	}

	private String getDictionaryKey(DictionaryEnum type, String innerCode) {
		String dictionaryKey = type.getCode() + "|" + innerCode;
		return dictionaryKey;
	}

	@SuppressWarnings("unused")
	private String getDictionaryKeyOfValue(DictionaryEnum type, String value) {
		String dictionaryKey = type.getCode() + "?" + value;
		return dictionaryKey;
	}

	@Override
	public Dictionary getDictionary(DictionaryEnum type, Integer innerId) {
		String key = this.getDictionaryKey(type, innerId);
		return dictionaryCache.get(key);
	}

	@Override
	public Dictionary getDictionary(DictionaryEnum type, String innerCode) {
		String key = this.getDictionaryKey(type, innerCode);
		return dictionaryCache.get(key);
	}

	@Override
	public List<Dictionary> getDictionarys(DictionaryEnum type) {
		return dictionaryByTypeCache.get(type.getCode());
	}
	

}
