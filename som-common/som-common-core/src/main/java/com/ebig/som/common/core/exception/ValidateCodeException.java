package com.ebig.som.common.core.exception;

/**
 * 类功能说明：检验异常处理类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月6日 下午7:16:39 <br/>
 * 版本：V1.0 <br/>
 */
public class ValidateCodeException extends RuntimeException {
	private static final long serialVersionUID = -7285211528095468156L;

	public ValidateCodeException() {
	}

	public ValidateCodeException(String msg) {
		super(msg);
	}
}
