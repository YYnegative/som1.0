package com.ebig.som.tool.generator.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebig.som.tool.generator.entity.GeneratorConfig;

/**
 * 类功能说明：代码生成器接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午2:35:24 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysGeneratorService {
	/**
	 * 生成代码
	 *
	 * @param tableNames 表名称
	 * @return
	 */
	byte[] generatorCode(GeneratorConfig tableNames);

	/**
	 * 分页查询表
	 *
	 * @param tableName 表名
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	IPage<List<Map<String, Object>>> queryPage(Page page, String tableName);
}
