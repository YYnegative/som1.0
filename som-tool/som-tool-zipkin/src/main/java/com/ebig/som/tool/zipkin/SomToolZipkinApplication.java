package com.ebig.som.tool.zipkin;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import zipkin.storage.mysql.MySQLStorage;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 类功能说明：服务链路追踪<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午11:16:45 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@EnableZipkinServer
@SpringCloudApplication
public class SomToolZipkinApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SomToolZipkinApplication.class, args);
		log.info("=================SomToolZipkinApplication=================");
	}

	@Bean
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
	}
}
