package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcMsgSendrecordResponse;

/**
 * TOP API: taobao.tmc.msg.sendrecord request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.15
 */
public class TmcMsgSendrecordRequest extends BaseTaobaoRequest<TmcMsgSendrecordResponse> {
	
	

	/** 
	* 消息主键ID
	 */
	private String dataId;

	/** 
	* 消息分组名
	 */
	private String groupName;

	/** 
	* TOPIC名称
	 */
	private String topicName;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicName() {
		return this.topicName;
	}

	public String getApiMethodName() {
		return "taobao.tmc.msg.sendrecord";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("data_id", this.dataId);
		txtParams.put("group_name", this.groupName);
		txtParams.put("topic_name", this.topicName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcMsgSendrecordResponse> getResponseClass() {
		return TmcMsgSendrecordResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dataId, "dataId");
		RequestCheckUtils.checkNotEmpty(groupName, "groupName");
		RequestCheckUtils.checkNotEmpty(topicName, "topicName");
	}
	

}