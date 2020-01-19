package com.ebig.som.server.upms.api.feign.fallback;

import org.springframework.stereotype.Component;

import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.dto.UserInfo;
import com.ebig.som.server.upms.api.feign.RemoteUserService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：远程调用用户信息接口实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:49:14 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@Component
public class RemoteUserServiceFallbackImpl implements RemoteUserService {
	@Setter
	private Throwable cause;

	/**
	 * 通过用户名查询用户、角色信息
	 *
	 * @param username 用户名
	 * @param from     内外标志
	 * @return R
	 */
	@Override
	public R<UserInfo> info(String username, String from) {
		log.error("feign 查询用户信息失败:{}", username, cause);
		return null;
	}

	/**
	 * 通过社交账号查询用户、角色信息
	 *
	 * @param inStr appid@code
	 * @return
	 */
	@Override
	public R<UserInfo> social(String inStr) {
		log.error("feign 查询用户信息失败:{}", inStr, cause);
		return null;
	}
}
