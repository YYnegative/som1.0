package com.ebig.som.tool.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：监控中心<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午10:51:52 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@EnableAdminServer
@SpringBootApplication
public class SomToolMonitorApplication {
	
    public static void main( String[] args ){
    	SpringApplication.run(SomToolMonitorApplication.class, args);
		log.info("=================SomToolMonitorApplication=================");
    }
}
