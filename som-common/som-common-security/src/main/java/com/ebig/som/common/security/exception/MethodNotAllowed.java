package com.ebig.som.common.security.exception;

import org.springframework.http.HttpStatus;

import com.ebig.som.common.security.component.SomAuth2ExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 类功能说明：方法不允许的异常处理<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午10:02:18 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
@JsonSerialize(using = SomAuth2ExceptionSerializer.class)
public class MethodNotAllowed extends SomAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
