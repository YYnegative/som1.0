package com.ebig.som.server.upms.api.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类功能说明：用户角色表<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:37:08 <br/>
 * 版本：V1.0 <br/>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserRole extends Model<SysUserRole> {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 角色ID
	 */
	private Integer roleId;

}
