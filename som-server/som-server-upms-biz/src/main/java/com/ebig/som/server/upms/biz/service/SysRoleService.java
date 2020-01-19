package com.ebig.som.server.upms.biz.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.server.upms.api.entity.SysRole;

/**
 * 类功能说明：角色信息服务类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:33:40 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);

	/**
	 * 通过角色ID，删除角色
	 *
	 * @param id
	 * @return
	 */
	Boolean removeRoleById(Integer id);
}
