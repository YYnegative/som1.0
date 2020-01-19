package com.ebig.som.server.authorize.handler;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.ebig.som.common.security.handler.AbstractAuthenticationSuccessEventHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：授权成功处理器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月6日 下午6:53:08 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@Component
public class SomAuthenticationSuccessEventHandler extends AbstractAuthenticationSuccessEventHandler {

	/**
	 * 处理登录成功方法
	 * <p>
	 * 获取到登录的authentication 对象
	 *
	 * @param authentication 登录对象
	 */
	@Override
	public void handle(Authentication authentication) {
		log.info("用户：{} 登录成功", authentication.getPrincipal());
	}
}
