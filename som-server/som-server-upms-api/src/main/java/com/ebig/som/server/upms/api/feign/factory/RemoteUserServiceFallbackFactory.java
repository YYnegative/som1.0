package com.ebig.som.server.upms.api.feign.factory;

import org.springframework.stereotype.Component;

import com.ebig.som.server.upms.api.feign.RemoteUserService;
import com.ebig.som.server.upms.api.feign.fallback.RemoteUserServiceFallbackImpl;

import feign.hystrix.FallbackFactory;

/**
 * 类功能说明：远程调用用户信息熔断器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:54:23 <br/>
 * 版本：V1.0 <br/>
 */
@Component
public class RemoteUserServiceFallbackFactory implements FallbackFactory<RemoteUserService> {

	@Override
	public RemoteUserService create(Throwable throwable) {
		RemoteUserServiceFallbackImpl remoteUserServiceFallback = new RemoteUserServiceFallbackImpl();
		remoteUserServiceFallback.setCause(throwable);
		return remoteUserServiceFallback;
	}
}
