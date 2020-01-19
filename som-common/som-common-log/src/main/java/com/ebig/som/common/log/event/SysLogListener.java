package com.ebig.som.common.log.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

import com.ebig.som.common.core.constant.SecurityConstants;
import com.ebig.som.server.upms.api.entity.SysLog;
import com.ebig.som.server.upms.api.feign.RemoteLogService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：异步监听日志事件<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午9:26:33 <br/>
 * 版本：V1.0 <br/>
 */
@AllArgsConstructor
public class SysLogListener {
	private final RemoteLogService remoteLogService;

	@Async
	@Order
	@EventListener(SysLogEvent.class)
	public void saveSysLog(SysLogEvent event) {
		SysLog sysLog = (SysLog) event.getSource();
		remoteLogService.saveLog(sysLog, SecurityConstants.FROM_IN);
	}
}
