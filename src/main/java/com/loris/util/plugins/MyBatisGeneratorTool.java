package com.loris.util.plugins;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGeneratorTool {

	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		String genCfg = "generatorConfig.xml";
		InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(genCfg);

		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;

		config = cp.parseConfiguration(in);

		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = null;

		myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

		myBatisGenerator.generate(null);

		for (String warning : warnings) {
			System.out.println(warning);
		}
	}
	
}
