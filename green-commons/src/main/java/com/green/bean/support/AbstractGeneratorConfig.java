package com.green.bean.support;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public abstract class AbstractGeneratorConfig {

	// 全局配置
	GlobalConfig gc = new GlobalConfig();
	// 数据源配置
	DataSourceConfig dsc = new DataSourceConfig();
	// 包配置
	PackageConfig pc = new PackageConfig();
	// 策略配置
	StrategyConfig strategy = new StrategyConfig();
	// 表详情
	TableInfo tableInfo = null;

	// 自定义配置
	InjectionConfig cfg = null;

	protected abstract void config();

	// 初始化配置
	public void init() {
		config();
	}

	// 构造方法
	public AbstractGeneratorConfig() {
	}

	// 执行方法
	public void doMpGeneration() {
		init();
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();
		mpg.setGlobalConfig(gc);
		mpg.setDataSource(dsc);
		mpg.setPackageInfo(pc);
		mpg.setTemplate(new TemplateConfig().setXml(null));
		mpg.setCfg(cfg);
		mpg.setStrategy(strategy);
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());
		mpg.execute();

		// 获取table信息,用于guns代码生成
		/*
		 * List<TableInfo> tableInfoList = mpg.getConfig().getTableInfoList();
		 * if (tableInfoList != null && tableInfoList.size() > 0) {
		 * this.tableInfo = tableInfoList.get(0); }
		 */
	}

}
