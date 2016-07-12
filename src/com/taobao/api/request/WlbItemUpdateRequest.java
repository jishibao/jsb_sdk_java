package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemUpdateResponse;

/**
 * TOP API: taobao.wlb.item.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class WlbItemUpdateRequest extends BaseTaobaoRequest<WlbItemUpdateResponse> {
	
	

	/** 
	* 商品颜色
	 */
	private String color;

	/** 
	* 需要删除的商品属性key列表
	 */
	private String deletePropertyKeyList;

	/** 
	* 商品货类
	 */
	private String goodsCat;

	/** 
	* 商品高度，单位厘米
	 */
	private Long height;

	/** 
	* 要修改的商品id
	 */
	private Long id;

	/** 
	* 是否危险品
	 */
	private Boolean isDangerous;

	/** 
	* 是否易碎品
	 */
	private Boolean isFriable;

	/** 
	* 商品长度，单位厘米
	 */
	private Long length;

	/** 
	* 要修改的商品名称
	 */
	private String name;

	/** 
	* 商品包装材料类型
	 */
	private String packageMaterial;

	/** 
	* 商品计价货类
	 */
	private String pricingCat;

	/** 
	* 要修改的商品备注
	 */
	private String remark;

	/** 
	* 要修改的商品标题
	 */
	private String title;

	/** 
	* 需要修改的商品属性值的列表，如果属性不存在，则新增属性
	 */
	private String updatePropertyKeyList;

	/** 
	* 需要修改的属性值的列表
	 */
	private String updatePropertyValueList;

	/** 
	* 商品体积，单位立方厘米
	 */
	private Long volume;

	/** 
	* 商品重量，单位G
	 */
	private Long weight;

	/** 
	* 商品宽度，单位厘米
	 */
	private Long width;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setDeletePropertyKeyList(String deletePropertyKeyList) {
		this.deletePropertyKeyList = deletePropertyKeyList;
	}

	public String getDeletePropertyKeyList() {
		return this.deletePropertyKeyList;
	}

	public void setGoodsCat(String goodsCat) {
		this.goodsCat = goodsCat;
	}

	public String getGoodsCat() {
		return this.goodsCat;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getHeight() {
		return this.height;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsFriable(Boolean isFriable) {
		this.isFriable = isFriable;
	}

	public Boolean getIsFriable() {
		return this.isFriable;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getLength() {
		return this.length;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPackageMaterial(String packageMaterial) {
		this.packageMaterial = packageMaterial;
	}

	public String getPackageMaterial() {
		return this.packageMaterial;
	}

	public void setPricingCat(String pricingCat) {
		this.pricingCat = pricingCat;
	}

	public String getPricingCat() {
		return this.pricingCat;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUpdatePropertyKeyList(String updatePropertyKeyList) {
		this.updatePropertyKeyList = updatePropertyKeyList;
	}

	public String getUpdatePropertyKeyList() {
		return this.updatePropertyKeyList;
	}

	public void setUpdatePropertyValueList(String updatePropertyValueList) {
		this.updatePropertyValueList = updatePropertyValueList;
	}

	public String getUpdatePropertyValueList() {
		return this.updatePropertyValueList;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Long getWeight() {
		return this.weight;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getWidth() {
		return this.width;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("color", this.color);
		txtParams.put("delete_property_key_list", this.deletePropertyKeyList);
		txtParams.put("goods_cat", this.goodsCat);
		txtParams.put("height", this.height);
		txtParams.put("id", this.id);
		txtParams.put("is_dangerous", this.isDangerous);
		txtParams.put("is_friable", this.isFriable);
		txtParams.put("length", this.length);
		txtParams.put("name", this.name);
		txtParams.put("package_material", this.packageMaterial);
		txtParams.put("pricing_cat", this.pricingCat);
		txtParams.put("remark", this.remark);
		txtParams.put("title", this.title);
		txtParams.put("update_property_key_list", this.updatePropertyKeyList);
		txtParams.put("update_property_value_list", this.updatePropertyValueList);
		txtParams.put("volume", this.volume);
		txtParams.put("weight", this.weight);
		txtParams.put("width", this.width);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemUpdateResponse> getResponseClass() {
		return WlbItemUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
	}
	

}