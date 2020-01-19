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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebig.som.common.core.util.R;
import com.ebig.som.common.log.annotation.SysLog;
import com.ebig.som.server.upms.api.entity.SysRole;
import com.ebig.som.server.upms.biz.service.SysRoleMenuService;
import com.ebig.som.server.upms.biz.service.SysRoleService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：角色信息管理<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:43:33 <br/>
 * 版本：V1.0 <br/>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/role")
public class RoleController {
	private final SysRoleService sysRoleService;
	private final SysRoleMenuService sysRoleMenuService;

	/**
	 * 函数功能说明 ： 通过ID查询角色信息<br/>
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
		return R.ok(sysRoleService.getById(id));
	}

	/**
	 * 函数功能说明 ：添加角色 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param sysRole
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("添加角色")
	@PostMapping
	@PreAuthorize("@pms.hasPermission('sys_role_add')")
	public R save(@Valid @RequestBody SysRole sysRole) {
		return R.ok(sysRoleService.save(sysRole));
	}

	/**
	 * 函数功能说明 ：修改角色 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param sysRole
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("修改角色")
	@PutMapping
	@PreAuthorize("@pms.hasPermission('sys_role_edit')")
	public R update(@Valid @RequestBody SysRole sysRole) {
		return R.ok(sysRoleService.updateById(sysRole));
	}

	/**
	 * 函数功能说明 ：删除角色 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("删除角色")
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_role_del')")
	public R removeById(@PathVariable Integer id) {
		return R.ok(sysRoleService.removeRoleById(id));
	}

	/**
	 * 函数功能说明 ：获取角色列表 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/list")
	public R listRoles() {
		return R.ok(sysRoleService.list(Wrappers.emptyWrapper()));
	}

	/**
	 * 函数功能说明 ： 分页查询角色信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param page
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/page")
	public R getRolePage(Page page) {
		return R.ok(sysRoleService.page(page, Wrappers.emptyWrapper()));
	}

	/**
	 * 函数功能说明 ：更新角色菜单 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：luorx <br/>
	 * 参数：@param roleId
	 * 参数：@param menuIds
	 * 参数：@return <br/>
	 * return：R <br/>
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("更新角色菜单")
	@PutMapping("/menu")
	@PreAuthorize("@pms.hasPermission('sys_role_perm')")
	public R saveRoleMenus(Integer roleId, @RequestParam(value = "menuIds", required = false) String menuIds) {
		SysRole sysRole = sysRoleService.getById(roleId);
		return R.ok(sysRoleMenuService.saveRoleMenus(sysRole.getRoleCode(), roleId, menuIds));
	}
}
