package com.green.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.alibaba.druid.pool.DruidDataSource;
import com.green.bean.config.DruidProperties;

@Configurable
@SuppressWarnings("unused")
@MapperScan(basePackages = { "com.green.**.mapper" }) // @MapperScan可以指定要扫描的Mapper类的包的路径
public class MybatisPlusConfig {
	@Autowired
	DruidProperties druidProperties;

	/**
	 * 另一个数据源
	 */
	private DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		System.out.println("MybatisConfig.dataSource--加载-------------------------");
		druidProperties.config(dataSource);
		return dataSource;
	}
}
