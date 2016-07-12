package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 后端商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ScItem extends TaobaoObject {

	private static final long serialVersionUID = 1358464426335716249L;

	/**
	 * 条形码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 高 单位：mm
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 1表示区域销售，0或是空是非区域销售
	 */
	@ApiField("is_area_sale")
	private Long isAreaSale;

	/**
	 * 贵重品:false:不是 true：是
	 */
	@ApiField("is_costly")
	private Boolean isCostly;

	/**
	 * 是否危险 false：不是  true：是
	 */
	@ApiField("is_dangerous")
	private Boolean isDangerous;

	/**
	 * 是否易碎 false ：不是  true：是
	 */
	@ApiField("is_friable")
	private Boolean isFriable;

	/**
	 * 是否保质期：false:不是 true：是
	 */
	@ApiField("is_warranty")
	private Boolean isWarranty;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 1.普通供应链商品 2.供应链组合主商品
	 */
	@ApiField("item_type")
	private Long itemType;

	/**
	 * 长度 单位：mm
	 */
	@ApiField("length")
	private Long length;

	/**
	 * LIQUID:液体，1：粉体，SOLID：固体
	 */
	@ApiField("matter_status")
	private String matterStatus;

	/**
	 * 后端商品options字段
	 */
	@ApiField("options")
	private Long options;

	/**
	 * 商家编码
	 */
	@ApiField("outer_code")
	private String outerCode;

	/**
	 * 价格：分（吊牌价）
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品属性格式是  p1:v1,p2:v2,p3:v3
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 体积：立方厘米
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 重量.单位：克
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * 宽 单位：mm
	 */
	@ApiField("width")
	private Long width;

	/**
	 * 仓储商编码，可以支持多个，格式wmsname:code
	 */
	@ApiField("wms_code")
	private String wmsCode;


	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getIsAreaSale() {
		return this.isAreaSale;
	}
	public void setIsAreaSale(Long isAreaSale) {
		this.isAreaSale = isAreaSale;
	}

	public Boolean getIsCostly() {
		return this.isCostly;
	}
	public void setIsCostly(Boolean isCostly) {
		this.isCostly = isCostly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Boolean getIsFriable() {
		return this.isFriable;
	}
	public void setIsFriable(Boolean isFriable) {
		this.isFriable = isFriable;
	}

	public Boolean getIsWarranty() {
		return this.isWarranty;
	}
	public void setIsWarranty(Boolean isWarranty) {
		this.isWarranty = isWarranty;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemType() {
		return this.itemType;
	}
	public void setItemType(Long itemType) {
		this.itemType = itemType;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public String getMatterStatus() {
		return this.matterStatus;
	}
	public void setMatterStatus(String matterStatus) {
		this.matterStatus = matterStatus;
	}

	public Long getOptions() {
		return this.options;
	}
	public void setOptions(Long options) {
		this.options = options;
	}

	public String getOuterCode() {
		return this.outerCode;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

	public String getWmsCode() {
		return this.wmsCode;
	}
	public void setWmsCode(String wmsCode) {
		this.wmsCode = wmsCode;
	}

}
