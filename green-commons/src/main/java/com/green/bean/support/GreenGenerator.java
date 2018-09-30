package com.green.bean.support;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class GreenGenerator extends AbstractGeneratorConfig {

	@Override
	protected void config() {
		globalConfig();
		dataSourceConfig();
		packageConfig();
		injectionConfig();
		strategyConfig();
	}

	/**
	 * <p>
	 * 读取控制台内容
	 * </p>
	 */
	public static String scanner(String tip) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder help = new StringBuilder();
		help.append("请输入" + tip + "：");
		System.out.println(help.toString());
		if (scanner.hasNext()) {
			String ipt = scanner.next();
			if (StringUtils.isNotEmpty(ipt)) {
				return ipt;
			}
		}
		throw new MybatisPlusException("请输入正确的" + tip + "！");
	}
	// 系统当前跟路径
	String projectPath = System.getProperty("user.dir");

	// 全局配置
	private void globalConfig() {
		gc.setOutputDir(projectPath + "/src/main/java");
		gc.setFileOverride(true);
		gc.setEnableCache(false);
		gc.setBaseResultMap(true);
		gc.setBaseColumnList(true);
		gc.setAuthor("limingliang");
		gc.setOpen(false);
	}

	// 资源配置
	private void dataSourceConfig() {
		dsc.setUrl("jdbc:mysql://qdm170159589.my3w.com/qdm170159589_db?useUnicode=true&characterEncoding=UTF8");
		// dsc.setSchemaName("public");
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("qdm170159589");
		dsc.setPassword("12345678");
	}

	// 包配置
	private void packageConfig() {
		pc.setModuleName(scanner("模块名"));
		pc.setParent("com.green");
	}

	// 自定义配置
	private void injectionConfig() {
		cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				// TODO Auto-generated method stub

			}
		};
		List<FileOutConfig> focList = new ArrayList<>();
		focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
			@Override
			public String outputFile(TableInfo tableInfo) {
				// 自定义输入文件名称
				return projectPath + "/src/main/resources/mapper/" + pc.getModuleName() + "/"
						+ tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
			}
		});
		cfg.setFileOutConfigList(focList);
	}

	// 策略配置
	private void strategyConfig() {
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//		strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
		strategy.setEntityLombokModel(false);
		strategy.setRestControllerStyle(true);
		strategy.setSuperControllerClass("com.green.base.controller.BaseController");
		strategy.setInclude(scanner("表名").split("[,;]"));
//		strategy.setSuperEntityColumns("id");
		strategy.setControllerMappingHyphenStyle(true);
		strategy.setTablePrefix(pc.getModuleName() + "_");
	}

}
