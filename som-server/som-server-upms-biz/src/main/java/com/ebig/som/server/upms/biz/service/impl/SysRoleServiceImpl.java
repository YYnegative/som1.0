package com.ebig.som.server.upms.biz.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebig.som.server.upms.api.entity.SysRole;
import com.ebig.som.server.upms.api.entity.SysRoleMenu;
import com.ebig.som.server.upms.biz.mapper.SysRoleMapper;
import com.ebig.som.server.upms.biz.mapper.SysRoleMenuMapper;
import com.ebig.som.server.upms.biz.service.SysRoleService;

import lombok.AllArgsConstructor;

/**
 * 类功能说明：角色信息服务实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:33:13 <br/>
 * 版本：V1.0 <br/>
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
	private SysRoleMenuMapper sysRoleMenuMapper;

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List listRolesByUserId(Integer userId) {
		return baseMapper.listRolesByUserId(userId);
	}

	/**
	 * 通过角色ID，删除角色,并清空角色菜单缓存
	 *
	 * @param id
	 * @return
	 */
	@Override
	@CacheEvict(value = "menu_details", allEntries = true)
	@Transactional(rollbackFor = Exception.class)
	public Boolean removeRoleById(Integer id) {
		sysRoleMenuMapper.delete(Wrappers
			.<SysRoleMenu>update().lambda()
			.eq(SysRoleMenu::getRoleId, id));
		return this.removeById(id);
	}
}
