
package com.pcbwx.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

/**
 * 程序启动类
 * 
 * @author 孙贺宇
 *
 */
@Slf4j
@SpringBootApplication
@EnableTransactionManagement
public class SystemStart{

	public static void main(String[] args){
		SpringApplication.run(SystemStart.class, args);
	}

}
