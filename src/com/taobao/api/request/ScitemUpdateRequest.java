package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ScitemUpdateResponse;

/**
 * TOP API: taobao.scitem.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.24
 */
public class ScitemUpdateRequest extends BaseTaobaoRequest<ScitemUpdateResponse> {
	
	

	/** 
	* 条形码
	 */
	private String barCode;

	/** 
	* 品牌id
	 */
	private Long brandId;

	/** 
	* brand_Name
	 */
	private String brandName;

	/** 
	* 高 单位：mm
	 */
	private Long height;

	/** 
	* 1表示区域销售，0或是空是非区域销售
	 */
	private Long isAreaSale;

	/** 
	* 是否是贵重品 0:不是 1：是
	 */
	private Long isCostly;

	/** 
	* 是否危险 0：不是  0：是
	 */
	private Long isDangerous;

	/** 
	* 是否易碎 0：不是  1：是
	 */
	private Long isFriable;

	/** 
	* 是否保质期：0:不是 1：是
	 */
	private Long isWarranty;

	/** 
	* 后端商品ID，跟outer_code必须指定一个
	 */
	private Long itemId;

	/** 
	* 商品名称
	 */
	private String itemName;

	/** 
	* 0.普通供应链商品 1.供应链组合主商品
	 */
	private Long itemType;

	/** 
	* 长度 单位：mm
	 */
	private Long length;

	/** 
	* 0:液体，1：粉体，2：固体
	 */
	private Long matterStatus;

	/** 
	* 商家编码，跟item_id必须指定一个
	 */
	private String outerCode;

	/** 
	* price
	 */
	private Long price;

	/** 
	* remark
	 */
	private String remark;

	/** 
	* 移除商品属性P列表,P由系统分配：p1；p2
	 */
	private String removeProperties;

	/** 
	* 淘宝SKU产品级编码CSPU ID
	 */
	private Long spuId;

	/** 
	* 需要更新的商品属性格式是  p1:v1,p2:v2,p3:v3
	 */
	private String updateProperties;

	/** 
	* 体积：立方厘米
	 */
	private Long volume;

	/** 
	* weight
	 */
	private Long weight;

	/** 
	* 宽 单位：mm
	 */
	private Long width;

	/** 
	* 仓储商编码
	 */
	private String wmsCode;

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return this.brandId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getHeight() {
		return this.height;
	}

	public void setIsAreaSale(Long isAreaSale) {
		this.isAreaSale = isAreaSale;
	}

	public Long getIsAreaSale() {
		return this.isAreaSale;
	}

	public void setIsCostly(Long isCostly) {
		this.isCostly = isCostly;
	}

	public Long getIsCostly() {
		return this.isCostly;
	}

	public void setIsDangerous(Long isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Long getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsFriable(Long isFriable) {
		this.isFriable = isFriable;
	}

	public Long getIsFriable() {
		return this.isFriable;
	}

	public void setIsWarranty(Long isWarranty) {
		this.isWarranty = isWarranty;
	}

	public Long getIsWarranty() {
		return this.isWarranty;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemType(Long itemType) {
		this.itemType = itemType;
	}

	public Long getItemType() {
		return this.itemType;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getLength() {
		return this.length;
	}

	public void setMatterStatus(Long matterStatus) {
		this.matterStatus = matterStatus;
	}

	public Long getMatterStatus() {
		return this.matterStatus;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getOuterCode() {
		return this.outerCode;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemoveProperties(String removeProperties) {
		this.removeProperties = removeProperties;
	}

	public String getRemoveProperties() {
		return this.removeProperties;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Long getSpuId() {
		return this.spuId;
	}

	public void setUpdateProperties(String updateProperties) {
		this.updateProperties = updateProperties;
	}

	public String getUpdateProperties() {
		return this.updateProperties;
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

	public void setWmsCode(String wmsCode) {
		this.wmsCode = wmsCode;
	}

	public String getWmsCode() {
		return this.wmsCode;
	}

	public String getApiMethodName() {
		return "taobao.scitem.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bar_code", this.barCode);
		txtParams.put("brand_id", this.brandId);
		txtParams.put("brand_name", this.brandName);
		txtParams.put("height", this.height);
		txtParams.put("is_area_sale", this.isAreaSale);
		txtParams.put("is_costly", this.isCostly);
		txtParams.put("is_dangerous", this.isDangerous);
		txtParams.put("is_friable", this.isFriable);
		txtParams.put("is_warranty", this.isWarranty);
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_name", this.itemName);
		txtParams.put("item_type", this.itemType);
		txtParams.put("length", this.length);
		txtParams.put("matter_status", this.matterStatus);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("price", this.price);
		txtParams.put("remark", this.remark);
		txtParams.put("remove_properties", this.removeProperties);
		txtParams.put("spu_id", this.spuId);
		txtParams.put("update_properties", this.updateProperties);
		txtParams.put("volume", this.volume);
		txtParams.put("weight", this.weight);
		txtParams.put("width", this.width);
		txtParams.put("wms_code", this.wmsCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ScitemUpdateResponse> getResponseClass() {
		return ScitemUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}