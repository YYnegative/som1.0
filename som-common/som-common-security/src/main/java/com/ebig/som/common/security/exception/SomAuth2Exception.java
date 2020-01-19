package com.ebig.som.common.security.exception;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

import com.ebig.som.common.security.component.SomAuth2ExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;

/**
 * 类功能说明：自定义OAuth2Exception<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午9:59:19 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
@JsonSerialize(using = SomAuth2ExceptionSerializer.class)
public class SomAuth2Exception extends OAuth2Exception {
	@Getter
	private String errorCode;

	public SomAuth2Exception(String msg) {
		super(msg);
	}

	public SomAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
}
