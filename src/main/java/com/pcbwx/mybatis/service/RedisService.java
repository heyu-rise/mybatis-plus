package com.pcbwx.mybatis.service;

import java.util.List;

import com.pcbwx.mybatis.enums.DictionaryEnum;
import com.pcbwx.mybatis.model.Dictionary;

public interface RedisService {
	
	void reloadDictionary(List<Dictionary> dictionarys);
	
	Dictionary getDictionary(DictionaryEnum type, Integer innerId);
	Dictionary getDictionary(DictionaryEnum type, String innerCode);
	
	List<Dictionary> getDictionarys(DictionaryEnum type);

}
