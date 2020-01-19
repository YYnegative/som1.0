package com.ebig.som.server.upms.api.vo;

import java.io.Serializable;

import com.ebig.som.server.upms.api.entity.SysLog;

import lombok.Data;

/**
 * 类功能说明：操作日志<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:41:49 <br/>
 * 版本：V1.0 <br/>
 */
@Data
public class LogVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private SysLog sysLog;
	private String username;
}
