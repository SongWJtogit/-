package com.example.sureoa.dao.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGeneration {
    /**
     *
     * @Title: main
     * @Description: 自动生成代码
     * @param args
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();


        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("C://code");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("SWJ");// 作者


        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sAction");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.ORACLE);
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("e3new");
        dsc.setPassword("e3new.2017");
        dsc.setUrl("jdbc:oracle:thin:@10.1.1.210:1521:athenats");
        mpg.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[] { "tab_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "tab_CustomerInformation" }); // 需要生成的表
        // 自定义实体父类
        strategy.setSuperEntityClass("com.example.sureoa.dao.entity");
        // 自定义 mapper 父类
        strategy.setSuperMapperClass("com.example.sureoa.dao.mapper");
        // 自定义 service 父类
        strategy.setSuperServiceClass("com.example.sureoa.server");
        // 自定义 service 实现类父类
        strategy.setSuperServiceImplClass("com.example.sureoa.server.impl");
        // 自定义 controller 父类
        strategy.setSuperControllerClass("com.example.sureoa.web");


        mpg.setStrategy(strategy);


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setEntity("entity");
        pc.setXml("xml");
        mpg.setPackageInfo(pc);


        // 执行生成
        mpg.execute();


    }



}

