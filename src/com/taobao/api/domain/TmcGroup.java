package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 消息通道的分组结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TmcGroup extends TaobaoObject {

	private static final long serialVersionUID = 5169838197963196255L;

	/**
	 * 分组名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户列表
	 */
	@ApiListField("users")
	@ApiField("string")
	private List<String> users;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getUsers() {
		return this.users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}

}
