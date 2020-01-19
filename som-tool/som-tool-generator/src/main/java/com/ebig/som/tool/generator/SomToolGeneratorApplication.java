package com.ebig.som.tool.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.ebig.som.common.security.annotation.EnableSomFeignClients;
import com.ebig.som.common.security.annotation.EnableSomResourceServer;

import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：代码生成模块<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午2:26:45 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@EnableSomFeignClients
@EnableSomResourceServer
@SpringCloudApplication	
public class SomToolGeneratorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SomToolGeneratorApplication.class, args);
		log.info("===============SomToolGeneratorApplication===============");
	}
}
