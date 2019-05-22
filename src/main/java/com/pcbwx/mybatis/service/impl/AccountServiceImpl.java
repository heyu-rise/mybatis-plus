package com.pcbwx.mybatis.service.impl;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.pcbwx.mybatis.service.AccountService;
import com.pcbwx.mybatis.service.CacheService;
import com.pcbwx.mybatis.service.RedisService;
import com.pcbwx.mybatis.service.SupportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

/**
 * 用户会话模块业务接口实现类
 * 
 * @author 孙贺宇
 *
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private CacheService cacheService;
	@Autowired
	private RedisService redisService;
	@Autowired
	private SupportService supportService;

	@Override
	public ByteArrayOutputStream trans(Integer height, Integer width, String format, Integer type, String text) {
		height = height == null ? 1000 : height;
		width = width == null ? 1000 : width;
		if (format == null) {
			format = "png";
		}
		BarcodeFormat barcodeFormat = getBarcodeFormat(type);
		Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = null;
		try {
			bitMatrix = new MultiFormatWriter().encode(text, barcodeFormat, width, height, hints);
		} catch (WriterException e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream bout = new ByteArrayOutputStream(4096);
		try {
			MatrixToImageWriter.writeToStream(bitMatrix, format, bout);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bout;

	}

	
	private BarcodeFormat getBarcodeFormat(Integer type){
		BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
		if (type == null) {
			return barcodeFormat;
		}
		switch (type) {
		case 1:
			barcodeFormat = BarcodeFormat.CODE_128;
			break;
		case 2:
			barcodeFormat = BarcodeFormat.CODE_39;
			break;
		case 3:
			barcodeFormat = BarcodeFormat.CODE_93;
			break;
		default:
			barcodeFormat = BarcodeFormat.QR_CODE;
			break;
		}
		return barcodeFormat;
	}

}
