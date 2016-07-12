package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jms.group.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJmsGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2491999349497115388L;

	/** 
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}
	


}
