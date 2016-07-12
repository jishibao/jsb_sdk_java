package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemAuthorizationAddResponse;

/**
 * TOP API: taobao.wlb.item.authorization.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemAuthorizationAddRequest extends BaseTaobaoRequest<WlbItemAuthorizationAddResponse> {
	
	

	/** 
	* 授权类型：1=全量授权，0=部分授权
当部分授权时，需要指定授权数量quantity
	 */
	private Long authType;

	/** 
	* 授权结束时间
	 */
	private Date authorizeEndTime;

	/** 
	* 授权开始时间
	 */
	private Date authorizeStartTime;

	/** 
	* 被授权人用户id
	 */
	private String consignUserNick;

	/** 
	* 商品id列表，以英文逗号,分隔，最多可放入50个商品ID。
	 */
	private String itemIdList;

	/** 
	* 规则名称
	 */
	private String name;

	/** 
	* 授权数量
	 */
	private Long quantity;

	/** 
	* 授权规则：目前只有GRANT_FIX，按照数量授权
	 */
	private String ruleCode;

	public void setAuthType(Long authType) {
		this.authType = authType;
	}

	public Long getAuthType() {
		return this.authType;
	}

	public void setAuthorizeEndTime(Date authorizeEndTime) {
		this.authorizeEndTime = authorizeEndTime;
	}

	public Date getAuthorizeEndTime() {
		return this.authorizeEndTime;
	}

	public void setAuthorizeStartTime(Date authorizeStartTime) {
		this.authorizeStartTime = authorizeStartTime;
	}

	public Date getAuthorizeStartTime() {
		return this.authorizeStartTime;
	}

	public void setConsignUserNick(String consignUserNick) {
		this.consignUserNick = consignUserNick;
	}

	public String getConsignUserNick() {
		return this.consignUserNick;
	}

	public void setItemIdList(String itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getItemIdList() {
		return this.itemIdList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.authorization.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_type", this.authType);
		txtParams.put("authorize_end_time", this.authorizeEndTime);
		txtParams.put("authorize_start_time", this.authorizeStartTime);
		txtParams.put("consign_user_nick", this.consignUserNick);
		txtParams.put("item_id_list", this.itemIdList);
		txtParams.put("name", this.name);
		txtParams.put("quantity", this.quantity);
		txtParams.put("rule_code", this.ruleCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemAuthorizationAddResponse> getResponseClass() {
		return WlbItemAuthorizationAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(authType, "authType");
		RequestCheckUtils.checkNotEmpty(authorizeEndTime, "authorizeEndTime");
		RequestCheckUtils.checkNotEmpty(authorizeStartTime, "authorizeStartTime");
		RequestCheckUtils.checkNotEmpty(consignUserNick, "consignUserNick");
		RequestCheckUtils.checkNotEmpty(itemIdList, "itemIdList");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 255, "name");
		RequestCheckUtils.checkNotEmpty(ruleCode, "ruleCode");
	}
	

}