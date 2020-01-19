package com.ebig.som.server.upms.biz.controller;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebig.som.common.core.constant.SecurityConstants;
import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.feign.RemoteTokenService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：getTokenPage 管理<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:45:56 <br/>
 * 版本：V1.0 <br/>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/token")
public class TokenController {
	private final RemoteTokenService remoteTokenService;

	/**
	 * 函数功能说明 ： 分页token 信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param params
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/page")
	public R token(@RequestParam Map<String, Object> params) {
		return remoteTokenService.getTokenPage(params, SecurityConstants.FROM_IN);
	}

	/**
	 * 函数功能说明 ： 删除<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：R<Boolean> <br/>
	 */
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_token_del')")
	public R<Boolean> delete(@PathVariable String id) {
		return remoteTokenService.removeToken(id, SecurityConstants.FROM_IN);
	}
}
