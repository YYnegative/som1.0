package com.ebig.som.server.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ebig.som.server.upms.api.entity.SysDeptRelation;

/**
 * 类功能说明：部门关系Mapper 接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:11:20 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysDeptRelationMapper extends BaseMapper<SysDeptRelation> {
	/**
	 * 删除部门关系表数据
	 *
	 * @param id 部门ID
	 */
	void deleteDeptRelationsById(Integer id);

	/**
	 * 更改部分关系表数据
	 *
	 * @param deptRelation
	 */
	void updateDeptRelations(SysDeptRelation deptRelation);

}
