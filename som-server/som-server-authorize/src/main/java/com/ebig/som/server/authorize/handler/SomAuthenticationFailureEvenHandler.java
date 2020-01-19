package com.ebig.som.server.authorize.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.ebig.som.common.security.handler.AbstractAuthenticationFailureEvenHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：授权失败处理器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月6日 下午6:52:02 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@Component
public class SomAuthenticationFailureEvenHandler extends AbstractAuthenticationFailureEvenHandler {

	/**
	 * 处理登录失败方法
	 * <p>
	 *
	 * @param authenticationException 登录的authenticationException 对象
	 * @param authentication          登录的authentication对象
	 */
	@Override
	public void handle(AuthenticationException authenticationException, Authentication authentication) {
		log.info("用户：{} 登录失败，异常：{}", authentication.getPrincipal(), authenticationException.getLocalizedMessage());
	}
}
