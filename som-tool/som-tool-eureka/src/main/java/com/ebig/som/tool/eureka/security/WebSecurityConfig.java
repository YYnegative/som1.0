package com.ebig.som.tool.eureka.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.SneakyThrows;


/**
 * 类功能说明：eureka配置安全认证策略和认证信息<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2019年12月19日 上午9:35:31 <br/>
 * 版本：V1.0 <br/>
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @SneakyThrows
	protected void configure(HttpSecurity http) {
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/actuator/**").permitAll()
			.anyRequest()
			.authenticated().and().httpBasic();
	}

}
