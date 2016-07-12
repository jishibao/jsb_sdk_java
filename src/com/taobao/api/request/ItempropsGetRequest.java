package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItempropsGetResponse;

/**
 * TOP API: taobao.itemprops.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.30
 */
public class ItempropsGetRequest extends BaseTaobaoRequest<ItempropsGetResponse> {
	
	

	/** 
	* 属性的Key，支持多条，以“,”分隔
	 */
	private String attrKeys;

	/** 
	* 类目子属性路径,由该子属性上层的类目属性和类目属性值组成,格式pid:vid;pid:vid.取类目子属性需要传child_path,cid
	 */
	private String childPath;

	/** 
	* 叶子类目ID，如果只传cid，则只返回一级属性,通过taobao.itemcats.get获得叶子类目ID
	 */
	private Long cid;

	/** 
	* 增量时间戳。格式:yyyy-MM-dd HH:mm:ss假如传2005-01-01 00:00:00，则取所有的属性和子属性ID(如果传了pid会忽略datetime)
	 */
	private Date datetime;

	/** 
	* 需要返回的字段列表，见：ItemProp，默认返回：pid, name, must, multi, prop_values
	 */
	private String fields;

	/** 
	* 是否颜色属性。可选值:true(是),false(否) (删除的属性不会匹配和返回这个条件)
	 */
	private Boolean isColorProp;

	/** 
	* 是否枚举属性。可选值:true(是),false(否) (删除的属性不会匹配和返回这个条件)。如果返回true，属性值是下拉框选择输入，如果返回false，属性值是用户自行手工输入。
	 */
	private Boolean isEnumProp;

	/** 
	* 在is_enum_prop是true的前提下，是否是卖家可以自行输入的属性（注：如果is_enum_prop返回false，该参数统一返回false）。可选值:true(是),false(否) (删除的属性不会匹配和返回这个条件)
	 */
	private Boolean isInputProp;

	/** 
	* 是否商品属性，这个属性只能放于发布商品时使用。可选值:true(是),false(否)
	 */
	private Boolean isItemProp;

	/** 
	* 是否关键属性。可选值:true(是),false(否)
	 */
	private Boolean isKeyProp;

	/** 
	* 是否销售属性。可选值:true(是),false(否)
	 */
	private Boolean isSaleProp;

	/** 
	* 父属性ID
	 */
	private Long parentPid;

	/** 
	* 属性id (取类目属性时，传pid，不用同时传PID和parent_pid)
	 */
	private Long pid;

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

	public void setChildPath(String childPath) {
		this.childPath = childPath;
	}

	public String getChildPath() {
		return this.childPath;
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

	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}

	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}

	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}

	public Boolean getIsInputProp() {
		return this.isInputProp;
	}

	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}

	public Boolean getIsItemProp() {
		return this.isItemProp;
	}

	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}

	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}

	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentPid() {
		return this.parentPid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.itemprops.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("attr_keys", this.attrKeys);
		txtParams.put("child_path", this.childPath);
		txtParams.put("cid", this.cid);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("is_color_prop", this.isColorProp);
		txtParams.put("is_enum_prop", this.isEnumProp);
		txtParams.put("is_input_prop", this.isInputProp);
		txtParams.put("is_item_prop", this.isItemProp);
		txtParams.put("is_key_prop", this.isKeyProp);
		txtParams.put("is_sale_prop", this.isSaleProp);
		txtParams.put("parent_pid", this.parentPid);
		txtParams.put("pid", this.pid);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItempropsGetResponse> getResponseClass() {
		return ItempropsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(attrKeys, 50, "attrKeys");
		RequestCheckUtils.checkNotEmpty(cid, "cid");
		RequestCheckUtils.checkMaxValue(type, 2L, "type");
		RequestCheckUtils.checkMinValue(type, 1L, "type");
	}
	

}