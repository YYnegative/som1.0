package com.ebig.som.server.upms.biz.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebig.som.server.upms.api.entity.SysDept;
import com.ebig.som.server.upms.api.entity.SysDeptRelation;
import com.ebig.som.server.upms.biz.mapper.SysDeptRelationMapper;
import com.ebig.som.server.upms.biz.service.SysDeptRelationService;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;

/**
 * 类功能说明：部门关系服务实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:16:54 <br/>
 * 版本：V1.0 <br/>
 */
@Service
@AllArgsConstructor
public class SysDeptRelationServiceImpl extends ServiceImpl<SysDeptRelationMapper, SysDeptRelation> implements SysDeptRelationService {
	private final SysDeptRelationMapper sysDeptRelationMapper;

	/**
	 * 维护部门关系
	 *
	 * @param sysDept 部门
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveDeptRelation(SysDept sysDept) {
		//增加部门关系表
		SysDeptRelation condition = new SysDeptRelation();
		condition.setDescendant(sysDept.getParentId());
		List<SysDeptRelation> relationList = sysDeptRelationMapper
			.selectList(Wrappers.<SysDeptRelation>query().lambda()
				.eq(SysDeptRelation::getDescendant, sysDept.getParentId()))
			.stream().map(relation -> {
				relation.setDescendant(sysDept.getDeptId());
				return relation;
			}).collect(Collectors.toList());
		if (CollUtil.isNotEmpty(relationList)) {
			this.saveBatch(relationList);
		}

		//自己也要维护到关系表中
		SysDeptRelation own = new SysDeptRelation();
		own.setDescendant(sysDept.getDeptId());
		own.setAncestor(sysDept.getDeptId());
		sysDeptRelationMapper.insert(own);
	}

	/**
	 * 通过ID删除部门关系
	 *
	 * @param id
	 */
	@Override
	public void removeDeptRelationById(Integer id) {
		baseMapper.deleteDeptRelationsById(id);
	}

	/**
	 * 更新部门关系
	 *
	 * @param relation
	 */
	@Override
	public void updateDeptRelation(SysDeptRelation relation) {
		baseMapper.updateDeptRelations(relation);
	}

}
