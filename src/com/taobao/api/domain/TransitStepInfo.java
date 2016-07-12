package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流跟踪信息的一条
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TransitStepInfo extends TaobaoObject {

	private static final long serialVersionUID = 5141762964422852541L;

	/**
	 * 节点说明 ，指明当前节点揽收、派送，签收。
	 */
	@ApiField("action")
	private String action;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 地址地一
	 */
	@ApiField("node_description")
	private String nodeDescription;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 状态发生的时间
	 */
	@ApiField("status_time")
	private String statusTime;

	/**
	 * 时间。。
	 */
	@ApiField("time")
	private String time;


	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getNodeDescription() {
		return this.nodeDescription;
	}
	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStatusTime() {
		return this.statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
