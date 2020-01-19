package com.ebig.som.server.upms.api.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明：数节点<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广东以大供应链管理有限公司 <br/>
 * 作者：luorx <br/>
 * 创建时间：2020年1月7日 下午4:39:06 <br/>
 * 版本：V1.0 <br/>
 */
@Data
public class TreeNode {
	protected int id;
	protected int parentId;
	protected List<TreeNode> children = new ArrayList<TreeNode>();

	public void add(TreeNode node) {
		children.add(node);
	}
}
