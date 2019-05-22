package com.pcbwx.mybatis.service;

import com.pcbwx.mybatis.enums.DictionaryEnum;
import com.pcbwx.mybatis.model.Dictionary;

import java.util.List;


public interface CacheService {
	void reloadDictionary(List<Dictionary> dictionarys);
	//--------------------------------------------------
	Dictionary getDictionary(DictionaryEnum type, Integer innerId);
	Dictionary getDictionary(DictionaryEnum type, String innerCode);
	
	List<Dictionary> getDictionarys(DictionaryEnum type);
} 
