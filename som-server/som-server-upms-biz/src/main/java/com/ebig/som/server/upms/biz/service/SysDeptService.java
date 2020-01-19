package com.ebig.som.server.upms.biz.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.server.upms.api.dto.DeptTree;
import com.ebig.som.server.upms.api.entity.SysDept;

/**
 * 类功能说明：部门管理 服务类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:21:39 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysDeptService extends IService<SysDept> {

	/**
	 * 查询部门树菜单
	 *
	 * @return 树
	 */
	List<DeptTree> listDeptTrees();

	/**
	 * 查询用户部门树
	 *
	 * @return
	 */
	List<DeptTree> listCurrentUserDeptTrees();

	/**
	 * 添加信息部门
	 *
	 * @param sysDept
	 * @return
	 */
	Boolean saveDept(SysDept sysDept);

	/**
	 * 删除部门
	 *
	 * @param id 部门 ID
	 * @return 成功、失败
	 */
	Boolean removeDeptById(Integer id);

	/**
	 * 更新部门
	 *
	 * @param sysDept 部门信息
	 * @return 成功、失败
	 */
	Boolean updateDeptById(SysDept sysDept);

}
