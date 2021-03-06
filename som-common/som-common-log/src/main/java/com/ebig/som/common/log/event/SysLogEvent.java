package com.ebig.som.common.log.event;

import org.springframework.context.ApplicationEvent;

import com.ebig.som.server.upms.api.entity.SysLog;

/**
 * 类功能说明：系统日志事件<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午9:26:17 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}
}
