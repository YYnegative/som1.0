package com.ebig.som.server.upms.api.dto;

import java.util.List;

import com.ebig.som.server.upms.api.entity.SysUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类功能说明：用户DTO<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:39:29 <br/>
 * 版本：V1.0 <br/>
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends SysUser {
	/**
	 * 角色ID
	 */
	private List<Integer> role;

	private Integer deptId;

	/**
	 * 新密码
	 */
	private String newpassword1;
}
