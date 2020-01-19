package com.ebig.som.common.security.component;

import com.ebig.som.common.core.constant.CommonConstants;
import com.ebig.som.common.security.exception.SomAuth2Exception;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import lombok.SneakyThrows;

/**
 * 类功能说明：OAuth2 异常格式化<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 上午9:56:38 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
public class SomAuth2ExceptionSerializer extends StdSerializer<SomAuth2Exception> {
	public SomAuth2ExceptionSerializer() {
		super(SomAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(SomAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
