package com.pcbwx.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * @author heyu
 */
@Configuration
public class MybatisPlusConfig {

	/**
	 * mybatis分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
	}

	/**
	 * 性能分析拦截器，不建议生产使用
	 */
//	@Bean
//	public PerformanceInterceptor performanceInterceptor() {
//		return new PerformanceInterceptor();
//	}
}
