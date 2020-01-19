package com.ebig.som.server.upms.biz.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebig.som.server.upms.api.entity.SysRoleMenu;
import com.ebig.som.server.upms.biz.mapper.SysRoleMenuMapper;
import com.ebig.som.server.upms.biz.service.SysRoleMenuService;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;

/**
 * 类功能说明：角色菜单表 服务实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:32:06 <br/>
 * 版本：V1.0 <br/>
 */
@Service
@AllArgsConstructor
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {
	private final CacheManager cacheManager;

	/**
	 * @param role
	 * @param roleId  角色
	 * @param menuIds 菜单ID拼成的字符串，每个id之间根据逗号分隔
	 * @return
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	@CacheEvict(value = "menu_details", key = "#roleId + '_menu'")
	public Boolean saveRoleMenus(String role, Integer roleId, String menuIds) {
		this.remove(Wrappers.<SysRoleMenu>query().lambda()
			.eq(SysRoleMenu::getRoleId, roleId));

		if (StrUtil.isBlank(menuIds)) {
			return Boolean.TRUE;
		}
		List<SysRoleMenu> roleMenuList = Arrays
			.stream(menuIds.split(","))
			.map(menuId -> {
				SysRoleMenu roleMenu = new SysRoleMenu();
				roleMenu.setRoleId(roleId);
				roleMenu.setMenuId(Integer.valueOf(menuId));
				return roleMenu;
			}).collect(Collectors.toList());

		//清空userinfo
		cacheManager.getCache("user_details").clear();
		return this.saveBatch(roleMenuList);
	}
}
