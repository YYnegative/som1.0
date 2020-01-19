package com.ebig.som.server.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.server.upms.api.entity.SysDept;
import com.ebig.som.server.upms.api.entity.SysDeptRelation;

/**
 * 类功能说明：部门关系服务接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:17:16 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysDeptRelationService extends IService<SysDeptRelation> {

	/**
	 * 新建部门关系
	 *
	 * @param sysDept 部门
	 */
	void saveDeptRelation(SysDept sysDept);

	/**
	 * 通过ID删除部门关系
	 *
	 * @param id
	 */
	void removeDeptRelationById(Integer id);

	/**
	 * 更新部门关系
	 *
	 * @param relation
	 */
	void updateDeptRelation(SysDeptRelation relation);
}
