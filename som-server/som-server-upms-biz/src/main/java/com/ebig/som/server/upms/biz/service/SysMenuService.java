package com.ebig.som.server.upms.biz.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.common.core.util.R;
import com.ebig.som.server.upms.api.entity.SysMenu;
import com.ebig.som.server.upms.api.vo.MenuVO;

/**
 * 类功能说明：菜单权限表 服务类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:25:33 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysMenuService extends IService<SysMenu> {
	/**
	 * 通过角色编号查询URL 权限
	 *
	 * @param roleId 角色ID
	 * @return 菜单列表
	 */
	List<MenuVO> getMenuByRoleId(Integer roleId);

	/**
	 * 级联删除菜单
	 *
	 * @param id 菜单ID
	 * @return 成功、失败
	 */
	@SuppressWarnings("rawtypes")
	R removeMenuById(Integer id);

	/**
	 * 更新菜单信息
	 *
	 * @param sysMenu 菜单信息
	 * @return 成功、失败
	 */
	Boolean updateMenuById(SysMenu sysMenu);
}
