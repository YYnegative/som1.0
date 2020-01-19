package com.ebig.som.common.security.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.ebig.som.common.security.component.SomResourceServerAutoConfiguration;
import com.ebig.som.common.security.component.SomSecurityBeanDefinitionRegistrar;

/**
 * 类功能说明：开启Som资源服务注解<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午10:10:50 <br/>
 * 版本：V1.0 <br/>
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({SomResourceServerAutoConfiguration.class, SomSecurityBeanDefinitionRegistrar.class})
public @interface EnableSomResourceServer {

}
