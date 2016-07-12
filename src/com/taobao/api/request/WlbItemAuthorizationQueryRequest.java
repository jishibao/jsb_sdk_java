package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemAuthorizationQueryResponse;

/**
 * TOP API: taobao.wlb.item.authorization.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemAuthorizationQueryRequest extends BaseTaobaoRequest<WlbItemAuthorizationQueryResponse> {
	
	

	/** 
	* 授权商品ID
	 */
	private Long itemId;

	/** 
	* 授权名称
	 */
	private String name;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	private Long pageSize;

	/** 
	* 授权编码
	 */
	private String ruleCode;

	/** 
	* 状态： 只能输入如下值,范围外的默认按VALID处理;不选则查询所有; 
VALID -- 1 有效； INVALIDATION -- 2 失效
	 */
	private String status;

	/** 
	* 类型：可由不同角色来查询，默认值OWNER,
OWNER -- 授权人,
ON_COMMISSION -- 被授权人
	 */
	private String type;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.authorization.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rule_code", this.ruleCode);
		txtParams.put("status", this.status);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemAuthorizationQueryResponse> getResponseClass() {
		return WlbItemAuthorizationQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(name, 255, "name");
	}
	

}