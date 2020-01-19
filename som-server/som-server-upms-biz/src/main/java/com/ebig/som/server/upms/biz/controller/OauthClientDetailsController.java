package com.ebig.som.server.upms.biz.controller;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebig.som.common.core.util.R;
import com.ebig.som.common.log.annotation.SysLog;
import com.ebig.som.server.upms.api.entity.SysOauthClientDetails;
import com.ebig.som.server.upms.biz.service.SysOauthClientDetailsService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：前端控制器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:41:56 <br/>
 * 版本：V1.0 <br/>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class OauthClientDetailsController {
	private final SysOauthClientDetailsService sysOauthClientDetailsService;

	/**
	 * 函数功能说明 ：通过ID查询 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/{id}")
	public R getById(@PathVariable Integer id) {
		return R.ok(sysOauthClientDetailsService.getById(id));
	}


	/**
	 * 函数功能说明 ：简单分页查询 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param page
	 * 参数：@param sysOauthClientDetails
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/page")
	public R getOauthClientDetailsPage(Page page, SysOauthClientDetails sysOauthClientDetails) {
		return R.ok(sysOauthClientDetailsService.page(page, Wrappers.query(sysOauthClientDetails)));
	}

	/**
	 * 函数功能说明 ：添加 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param sysOauthClientDetails
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("添加终端")
	@PostMapping
	@PreAuthorize("@pms.hasPermission('sys_client_add')")
	public R add(@Valid @RequestBody SysOauthClientDetails sysOauthClientDetails) {
		return R.ok(sysOauthClientDetailsService.save(sysOauthClientDetails));
	}

	/**
	 * 函数功能说明 ：删除 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("删除终端")
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_client_del')")
	public R removeById(@PathVariable String id) {
		return R.ok(sysOauthClientDetailsService.removeClientDetailsById(id));
	}

	/**
	 * 函数功能说明 ： 编辑<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param sysOauthClientDetails
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("编辑终端")
	@PutMapping
	@PreAuthorize("@pms.hasPermission('sys_client_edit')")
	public R update(@Valid @RequestBody SysOauthClientDetails sysOauthClientDetails) {
		return R.ok(sysOauthClientDetailsService.updateClientDetailsById(sysOauthClientDetails));
	}
}
