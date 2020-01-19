package com.ebig.som.server.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ebig.som.server.upms.api.entity.SysUserRole;

/**
 * 类功能说明：用户角色表服务类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午5:34:58 <br/>
 * 版本：V1.0 <br/>
 */
public interface SysUserRoleService extends IService<SysUserRole> {

	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	Boolean removeRoleByUserId(Integer userId);
}
