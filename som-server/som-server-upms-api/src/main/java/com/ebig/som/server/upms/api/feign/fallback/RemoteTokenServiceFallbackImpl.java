package com.ebig.som.server.upms.api.feign.fallback;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.feign.RemoteTokenService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：用户调用token信息接口实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:48:22 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@Component
public class RemoteTokenServiceFallbackImpl implements RemoteTokenService {
	@Setter
	private Throwable cause;

	/**
	 * 分页查询token 信息
	 *
	 * @param params 分页参数
	 * @param from   内部调用标志
	 * @return page
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public R getTokenPage(Map<String, Object> params, String from) {
		log.error("调用认证中心查询token 失败", cause);
		return null;
	}

	/**
	 * 删除token
	 *
	 * @param s
	 * @param id
	 * @return
	 */
	@Override
	public R<Boolean> removeToken(String s, String id) {
		log.error("删除token 失败 {}", id, cause);
		return null;
	}
}
