package com.ebig.som.server.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.server.upms.api.entity.SysRoleMenu;

/**
 * 类功能说明：角色菜单表 服务类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:32:21 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

	/**
	 * 更新角色菜单
	 *
	 * @param role
	 * @param roleId  角色
	 * @param menuIds 菜单ID拼成的字符串，每个id之间根据逗号分隔
	 * @return
	 */
	Boolean saveRoleMenus(String role, Integer roleId, String menuIds);
}
