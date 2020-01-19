package com.ebig.som.server.authorize;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.ebig.som.common.security.annotation.EnableSomFeignClients;

import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：认证授权中心<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午3:59:31 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@SpringCloudApplication
@EnableSomFeignClients
public class SomAuthorizeApplication {
	
	public static void main( String[] args ){
    	SpringApplication.run(SomAuthorizeApplication.class, args);
        log.info("===============SomAuthorizeApplication===============");
    }
}
