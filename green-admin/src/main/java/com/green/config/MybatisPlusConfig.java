package com.green.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.alibaba.druid.pool.DruidDataSource;
import com.green.bean.properties.DruidProperties;

@Configuration
@MapperScan(basePackages = {"com.green.modular.**.mapper"})
@Import(value = DruidProperties.class)
public class MybatisPlusConfig {

	@Autowired
	private DruidProperties druidProperties;

	/** druid数据源配置 */
	@Bean
	public DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		System.out.println("MybatisConfig.dataSource--加载-------------------------");
		druidProperties.config(dataSource);
		return dataSource;
	}
	
}
