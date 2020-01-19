package com.ebig.som.tool.generator.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebig.som.common.core.util.R;
import com.ebig.som.tool.generator.entity.GeneratorConfig;
import com.ebig.som.tool.generator.service.SysGeneratorService;

import cn.hutool.core.io.IoUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * 类功能说明：代码生成器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午2:33:38 <br/>
 * 版本：V1.0 <br/>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/generator")
public class SysGeneratorController {
	private final SysGeneratorService sysGeneratorService;

	/**
	 * 列表
	 *
	 * @param tableName 参数集
	 * @return 数据库表
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/page")
	public R<IPage> list(Page page, String tableName) {
		return R.ok(sysGeneratorService.queryPage(page, tableName));
	}

	/**
	 * 生成代码
	 */
	@PostMapping("/code")
	@SneakyThrows
	public void code(@RequestBody GeneratorConfig genConfig, HttpServletResponse response) {
		byte[] data = sysGeneratorService.generatorCode(genConfig);

		response.reset();
		response.setHeader("Content-Disposition", String.format("attachment; filename=%s.zip", genConfig.getTableName()));
		response.addHeader("Content-Length", "" + data.length);
		response.setContentType("application/octet-stream; charset=UTF-8");

		IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
	}
}
