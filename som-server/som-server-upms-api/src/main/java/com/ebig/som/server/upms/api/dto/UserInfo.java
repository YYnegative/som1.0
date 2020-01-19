package com.ebig.som.server.upms.api.dto;

import java.io.Serializable;

import com.ebig.som.server.upms.api.entity.SysUser;

import lombok.Data;

/**
 * 类功能说明：用户信息<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:40:04 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
@Data
public class UserInfo implements Serializable {
	/**
	 * 用户基本信息
	 */
	private SysUser sysUser;
	/**
	 * 权限标识集合
	 */
	private String[] permissions;

	/**
	 * 角色集合
	 */
	private Integer[] roles;
}
