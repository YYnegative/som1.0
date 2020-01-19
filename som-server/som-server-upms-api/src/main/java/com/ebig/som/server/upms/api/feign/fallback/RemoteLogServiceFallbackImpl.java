package com.ebig.som.server.upms.api.feign.fallback;

import org.springframework.stereotype.Component;

import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.entity.SysLog;
import com.ebig.som.server.upms.api.feign.RemoteLogService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 类功能说明：远程调用系统日志接口实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:47:37 <br/>
 * 版本：V1.0 <br/>
 */
@Slf4j
@Component
public class RemoteLogServiceFallbackImpl implements RemoteLogService {
	@Setter
	private Throwable cause;

	/**
	 * 保存日志
	 *
	 * @param sysLog 日志实体
	 * @param from   内部调用标志
	 * @return succes、false
	 */
	@Override
	public R<Boolean> saveLog(SysLog sysLog, String from) {
		log.error("feign 插入日志失败", cause);
		return null;
	}
}
