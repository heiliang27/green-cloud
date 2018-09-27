package com.green.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import com.green.bean.config.DruidProperties;

@Configurable
public class MybatisPlusConfig {

	@Autowired
	DruidProperties druidProperties;

	/** druid数据源配置 */
	@Bean
	private DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		System.out.println("MybatisConfig.dataSource--加载-------------------------");
		druidProperties.config(dataSource);
		return dataSource;
	}
	
}
