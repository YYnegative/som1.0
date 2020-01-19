package com.ebig.som.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * 类功能说明：授权拒绝<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月6日 下午7:16:02 <br/>
 * 版本：V1.0 <br/>
 */
@NoArgsConstructor
public class SomDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SomDeniedException(String message) {
		super(message);
	}

	public SomDeniedException(Throwable cause) {
		super(cause);
	}

	public SomDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SomDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
