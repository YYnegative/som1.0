package com.ebig.som.server.upms.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ebig.som.common.core.constant.SecurityConstants;
import com.ebig.som.common.core.constant.ServiceNameConstants;
import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.dto.UserInfo;
import com.ebig.som.server.upms.api.feign.factory.RemoteUserServiceFallbackFactory;

/**
 * 类功能说明：远程调用用户信息接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:46:11 <br/>
 * 版本：V1.0 <br/>
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteUserServiceFallbackFactory.class)
public interface RemoteUserService {
	/**
	 * 通过用户名查询用户、角色信息
	 *
	 * @param username 用户名
	 * @param from     调用标志
	 * @return R
	 */
	@GetMapping("/user/info/{username}")
	R<UserInfo> info(@PathVariable("username") String username
		, @RequestHeader(SecurityConstants.FROM) String from);

	/**
	 * 通过社交账号查询用户、角色信息
	 *
	 * @param inStr appid@code
	 * @return
	 */
	@GetMapping("/social/info/{inStr}")
	R<UserInfo> social(@PathVariable("inStr") String inStr);
}
