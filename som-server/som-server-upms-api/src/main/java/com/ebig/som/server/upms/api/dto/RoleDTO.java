package com.ebig.som.server.upms.api.dto;

import com.ebig.som.server.upms.api.entity.SysRole;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类功能说明：角色Dto<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:38:19 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends SysRole {
	/**
	 * 角色部门Id
	 */
	private Integer roleDeptId;

	/**
	 * 部门名称
	 */
	private String deptName;
}
