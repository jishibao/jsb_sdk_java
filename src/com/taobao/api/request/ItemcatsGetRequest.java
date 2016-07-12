package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemcatsGetResponse;

/**
 * TOP API: taobao.itemcats.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.05
 */
public class ItemcatsGetRequest extends BaseTaobaoRequest<ItemcatsGetResponse> {
	
	

	/** 
	* 商品所属类目ID列表，用半角逗号(,)分隔 例如:(18957,19562,) (cids、parent_cid至少传一个)
	 */
	private String cids;

	/** 
	* 无效字段，暂无法使用。时间戳（格式:yyyy-MM-dd HH:mm:ss）如果该字段没有传，则取当前所有的类目信息,如果传了parent_cid或者cids，则忽略datetime，如果该字段传了，那么可以查询到该时间到现在为止的增量变化
	 */
	private Date datetime;

	/** 
	* 需要返回的字段列表，见ItemCat，默认返回：cid,parent_cid,name,is_parent；增量类目信息,根据fields传入的参数返回相应的结果。 features字段： 1、如果存在attr_key=freeze表示该类目被冻结了，attr_value=0,5，value可能存在2个值（也可能只有1个），用逗号分割，0表示禁编辑，5表示禁止发布
	 */
	private String fields;

	/** 
	* 父商品类目 id，0表示根节点, 传输该参数返回所有子类目。 (cids、parent_cid至少传一个)
	 */
	private Long parentCid;

	public void setCids(String cids) {
		this.cids = cids;
	}

	public String getCids() {
		return this.cids;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Date getDatetime() {
		return this.datetime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Long getParentCid() {
		return this.parentCid;
	}

	public String getApiMethodName() {
		return "taobao.itemcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cids", this.cids);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("parent_cid", this.parentCid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemcatsGetResponse> getResponseClass() {
		return ItemcatsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(cids, 1000, "cids");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
	}
	

}