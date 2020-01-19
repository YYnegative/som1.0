package com.ebig.som.server.upms.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ebig.som.common.core.constant.SecurityConstants;
import com.ebig.som.common.core.constant.ServiceNameConstants;
import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.entity.SysLog;
import com.ebig.som.server.upms.api.feign.factory.RemoteLogServiceFallbackFactory;

/**
 * 类功能说明：远程调用操作日志接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:44:35 <br/>
 * 版本：V1.0 <br/>
 */
@FeignClient(contextId = "remoteLogService", value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteLogServiceFallbackFactory.class)
public interface RemoteLogService {
	/**
	 * 保存日志
	 *
	 * @param sysLog 日志实体
	 * @param from   内部调用标志
	 * @return succes、false
	 */
	@PostMapping("/log")
	R<Boolean> saveLog(@RequestBody SysLog sysLog, @RequestHeader(SecurityConstants.FROM) String from);
}
