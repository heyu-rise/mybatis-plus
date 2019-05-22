package heyu;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class Generator {

	@Test
	public void start(){
		String packageName = "com.pcbwx.mybatis";
		generateByTables(packageName, "action_log", "config", "dictionary", "log", "record_utils", "task_clock");
	}

	private static void generateByTables(String packageName, String... tableNames){
		GlobalConfig config = new GlobalConfig();
		String dbUrl = "jdbc:mysql://localhost:3306/jsp?useSSL=false";
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL)
				.setUrl(dbUrl)
				.setUsername("root")
				.setPassword("123456")
				.setDriverName("com.mysql.jdbc.Driver");
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig
				.setCapitalMode(false)
				.setEntityLombokModel(false) // 支持lombok插件
				.setDbColumnUnderline(true)
				.setNaming(NamingStrategy.underline_to_camel)
				.setInclude(tableNames);// 表名数组
		config.setActiveRecord(false)
				.setBaseResultMap(true)// 是否生成BaseResultMap
				.setDateType(DateType.ONLY_DATE)// 生成时间类型，ONLY_DATE为Date
				.setBaseColumnList(true)// 是否生成BaseColumnList
				.setAuthor("贺宇")
				.setOutputDir("d:/mybatis-plus/mybatis")
				.setFileOverride(true);
		new AutoGenerator().setGlobalConfig(config)
				.setDataSource(dataSourceConfig)
				.setStrategy(strategyConfig)
				.setPackageInfo(
						// 自定义包名
						new PackageConfig()
								.setParent(packageName)
								.setEntity("model")
								.setMapper("dao")
				).execute();
	}

}
