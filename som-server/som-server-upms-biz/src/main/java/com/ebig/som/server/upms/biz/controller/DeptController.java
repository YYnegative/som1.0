package com.ebig.som.server.upms.biz.controller;

import java.time.LocalDateTime;

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

import com.ebig.som.common.core.util.R;
import com.ebig.som.common.log.annotation.SysLog;
import com.ebig.som.server.upms.api.entity.SysDept;
import com.ebig.som.server.upms.biz.service.SysDeptService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：部门管理 前端控制器<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:38:03 <br/>
 * 版本：V1.0 <br/>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/dept")
public class DeptController {
	private final SysDeptService sysDeptService;

	/**
	 * 通过ID查询
	 *
	 * @param id ID
	 * @return SysDept
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/{id}")
	public R getById(@PathVariable Integer id) {
		return R.ok(sysDeptService.getById(id));
	}


	/**
	 * 返回树形菜单集合
	 *
	 * @return 树形菜单
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/tree")
	public R listDeptTrees() {
		return R.ok(sysDeptService.listDeptTrees());
	}

	/**
	 * 返回当前用户树形菜单集合
	 *
	 * @return 树形菜单
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/user-tree")
	public R listCurrentUserDeptTrees() {
		return R.ok(sysDeptService.listCurrentUserDeptTrees());
	}

	/**
	 * 添加
	 *
	 * @param sysDept 实体
	 * @return success/false
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("添加部门")
	@PostMapping
	@PreAuthorize("@pms.hasPermission('sys_dept_add')")
	public R save(@Valid @RequestBody SysDept sysDept) {
		return R.ok(sysDeptService.saveDept(sysDept));
	}

	/**
	 * 删除
	 *
	 * @param id ID
	 * @return success/false
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("删除部门")
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_dept_del')")
	public R removeById(@PathVariable Integer id) {
		return R.ok(sysDeptService.removeDeptById(id));
	}

	/**
	 * 编辑
	 *
	 * @param sysDept 实体
	 * @return success/false
	 */
	@SuppressWarnings("rawtypes")
	@SysLog("编辑部门")
	@PutMapping
	@PreAuthorize("@pms.hasPermission('sys_dept_edit')")
	public R update(@Valid @RequestBody SysDept sysDept) {
		sysDept.setUpdateTime(LocalDateTime.now());
		return R.ok(sysDeptService.updateDeptById(sysDept));
	}
}
