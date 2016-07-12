package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcMessagesConsumeResponse;

/**
 * TOP API: taobao.tmc.messages.consume request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.09
 */
public class TmcMessagesConsumeRequest extends BaseTaobaoRequest<TmcMessagesConsumeResponse> {
	
	

	/** 
	* 用户分组名称，不传表示消费默认分组，如果应用没有设置用户分组，传入分组名称将会返回错误
	 */
	private String groupName;

	/** 
	* 每次批量消费消息的条数
	 */
	private Long quantity;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public String getApiMethodName() {
		return "taobao.tmc.messages.consume";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_name", this.groupName);
		txtParams.put("quantity", this.quantity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcMessagesConsumeResponse> getResponseClass() {
		return TmcMessagesConsumeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(quantity, 200L, "quantity");
		RequestCheckUtils.checkMinValue(quantity, 10L, "quantity");
	}
	

}