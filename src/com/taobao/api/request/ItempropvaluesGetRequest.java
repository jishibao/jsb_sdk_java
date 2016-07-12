package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItempropvaluesGetResponse;

/**
 * TOP API: taobao.itempropvalues.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.30
 */
public class ItempropvaluesGetRequest extends BaseTaobaoRequest<ItempropvaluesGetResponse> {
	
	

	/** 
	* 属性的Key，支持多条，以“,”分隔
	 */
	private String attrKeys;

	/** 
	* 叶子类目ID ,通过taobao.itemcats.get获得叶子类目ID
	 */
	private Long cid;

	/** 
	* 假如传2005-01-01 00:00:00，则取所有的属性和子属性(状态为删除的属性值不返回prop_name)
	 */
	private Date datetime;

	/** 
	* 需要返回的字段。目前支持有：cid,pid,prop_name,vid,name,name_alias,status,sort_order
	 */
	private String fields;

	/** 
	* 属性和属性值 id串，格式例如(pid1;pid2)或(pid1:vid1;pid2:vid2)或(pid1;pid2:vid2)
	 */
	private String pvs;

	/** 
	* 获取类目的类型：1代表集市、2代表天猫
	 */
	private Long type;

	public void setAttrKeys(String attrKeys) {
		this.attrKeys = attrKeys;
	}

	public String getAttrKeys() {
		return this.attrKeys;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
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

	public void setPvs(String pvs) {
		this.pvs = pvs;
	}

	public String getPvs() {
		return this.pvs;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.itempropvalues.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("attr_keys", this.attrKeys);
		txtParams.put("cid", this.cid);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("pvs", this.pvs);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItempropvaluesGetResponse> getResponseClass() {
		return ItempropvaluesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(attrKeys, 20, "attrKeys");
		RequestCheckUtils.checkNotEmpty(cid, "cid");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkMaxValue(type, 2L, "type");
		RequestCheckUtils.checkMinValue(type, 1L, "type");
	}
	

}