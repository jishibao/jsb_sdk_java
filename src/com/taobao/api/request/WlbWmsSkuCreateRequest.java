package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsSkuCreateResponse;

/**
 * TOP API: taobao.wlb.wms.sku.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.25
 */
public class WlbWmsSkuCreateRequest extends BaseTaobaoRequest<WlbWmsSkuCreateResponse> {
	
	

	/** 
	* 保质期预警天数
	 */
	private Long adventLifecycle;

	/** 
	* 批准文号
	 */
	private String approvalNumber;

	/** 
	* 条形码，多条码请用”；”分隔；
	 */
	private String barCode;

	/** 
	* 品牌编码
	 */
	private String brand;

	/** 
	* 品牌名称
	 */
	private String brandName;

	/** 
	* 商品类别编码（外部系统类别）
	 */
	private String category;

	/** 
	* 商品类别名称
	 */
	private String categoryName;

	/** 
	* 颜色
	 */
	private String color;

	/** 
	* 成本价，单位分
	 */
	private Long costPrice;

	/** 
	* 拓展属性
	 */
	private String extendFields;

	/** 
	* 毛重，单位克
	 */
	private Long grossWeight;

	/** 
	* 高度，单位毫米
	 */
	private Long height;

	/** 
	* 是否区域销售
	 */
	private Boolean isAreaSale;

	/** 
	* 是否启用批次管理
	 */
	private Boolean isBatchMgt;

	/** 
	* 是否危险品
	 */
	private Boolean isDanger;

	/** 
	* 是否易碎品
	 */
	private Boolean isHygroscopic;

	/** 
	* 是否启用保质期管理
	 */
	private Boolean isShelflife;

	/** 
	* 是否启用序列号管理
	 */
	private Boolean isSnMgt;

	/** 
	* 商家商品编码
	 */
	private String itemCode;

	/** 
	* 商家商品ID
	 */
	private String itemId;

	/** 
	* 零售价，单位分
	 */
	private Long itemPrice;

	/** 
	* 长度，单位毫米
	 */
	private Long length;

	/** 
	* 商品保质期天数
	 */
	private Long lifecycle;

	/** 
	* 保质期禁售天数
	 */
	private Long lockupLifecycle;

	/** 
	* 商品名称
	 */
	private String name;

	/** 
	* 净重，单位克
	 */
	private Long netWeight;

	/** 
	* 产地
	 */
	private Long originAddress;

	/** 
	* 箱规
	 */
	private Long pcs;

	/** 
	* 保质期禁收天数
	 */
	private Long rejectLifecycle;

	/** 
	* 尺码
	 */
	private String size;

	/** 
	* 规格
	 */
	private String specification;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 吊牌价，单位分
	 */
	private Long tagPrice;

	/** 
	* 商品标题
	 */
	private String title;

	/** 
	* 商品类别NORMAL：普通商品、COMBINE：组合商品、DISTRIBUTION：分销商品、HAOCAI耗材、FUSHUPIN附属品、BAOCAI 包材、XUNI虚拟商品、QITA其他)
	 */
	private String type;

	/** 
	* 启用标识
	 */
	private Boolean useYn;

	/** 
	* 体积，单位立方厘米
	 */
	private Long volume;

	/** 
	* 宽度，单位毫米
	 */
	private Long width;

	public void setAdventLifecycle(Long adventLifecycle) {
		this.adventLifecycle = adventLifecycle;
	}

	public Long getAdventLifecycle() {
		return this.adventLifecycle;
	}

	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	public String getApprovalNumber() {
		return this.approvalNumber;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public Long getCostPrice() {
		return this.costPrice;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getExtendFields() {
		return this.extendFields;
	}

	public void setGrossWeight(Long grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Long getGrossWeight() {
		return this.grossWeight;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getHeight() {
		return this.height;
	}

	public void setIsAreaSale(Boolean isAreaSale) {
		this.isAreaSale = isAreaSale;
	}

	public Boolean getIsAreaSale() {
		return this.isAreaSale;
	}

	public void setIsBatchMgt(Boolean isBatchMgt) {
		this.isBatchMgt = isBatchMgt;
	}

	public Boolean getIsBatchMgt() {
		return this.isBatchMgt;
	}

	public void setIsDanger(Boolean isDanger) {
		this.isDanger = isDanger;
	}

	public Boolean getIsDanger() {
		return this.isDanger;
	}

	public void setIsHygroscopic(Boolean isHygroscopic) {
		this.isHygroscopic = isHygroscopic;
	}

	public Boolean getIsHygroscopic() {
		return this.isHygroscopic;
	}

	public void setIsShelflife(Boolean isShelflife) {
		this.isShelflife = isShelflife;
	}

	public Boolean getIsShelflife() {
		return this.isShelflife;
	}

	public void setIsSnMgt(Boolean isSnMgt) {
		this.isSnMgt = isSnMgt;
	}

	public Boolean getIsSnMgt() {
		return this.isSnMgt;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getItemPrice() {
		return this.itemPrice;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getLength() {
		return this.length;
	}

	public void setLifecycle(Long lifecycle) {
		this.lifecycle = lifecycle;
	}

	public Long getLifecycle() {
		return this.lifecycle;
	}

	public void setLockupLifecycle(Long lockupLifecycle) {
		this.lockupLifecycle = lockupLifecycle;
	}

	public Long getLockupLifecycle() {
		return this.lockupLifecycle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNetWeight(Long netWeight) {
		this.netWeight = netWeight;
	}

	public Long getNetWeight() {
		return this.netWeight;
	}

	public void setOriginAddress(Long originAddress) {
		this.originAddress = originAddress;
	}

	public Long getOriginAddress() {
		return this.originAddress;
	}

	public void setPcs(Long pcs) {
		this.pcs = pcs;
	}

	public Long getPcs() {
		return this.pcs;
	}

	public void setRejectLifecycle(Long rejectLifecycle) {
		this.rejectLifecycle = rejectLifecycle;
	}

	public Long getRejectLifecycle() {
		return this.rejectLifecycle;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTagPrice(Long tagPrice) {
		this.tagPrice = tagPrice;
	}

	public Long getTagPrice() {
		return this.tagPrice;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUseYn(Boolean useYn) {
		this.useYn = useYn;
	}

	public Boolean getUseYn() {
		return this.useYn;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getWidth() {
		return this.width;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.sku.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("advent_lifecycle", this.adventLifecycle);
		txtParams.put("approval_number", this.approvalNumber);
		txtParams.put("bar_code", this.barCode);
		txtParams.put("brand", this.brand);
		txtParams.put("brand_name", this.brandName);
		txtParams.put("category", this.category);
		txtParams.put("category_name", this.categoryName);
		txtParams.put("color", this.color);
		txtParams.put("cost_price", this.costPrice);
		txtParams.put("extend_fields", this.extendFields);
		txtParams.put("gross_weight", this.grossWeight);
		txtParams.put("height", this.height);
		txtParams.put("is_area_sale", this.isAreaSale);
		txtParams.put("is_batch_mgt", this.isBatchMgt);
		txtParams.put("is_danger", this.isDanger);
		txtParams.put("is_hygroscopic", this.isHygroscopic);
		txtParams.put("is_shelflife", this.isShelflife);
		txtParams.put("is_sn_mgt", this.isSnMgt);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("length", this.length);
		txtParams.put("lifecycle", this.lifecycle);
		txtParams.put("lockup_lifecycle", this.lockupLifecycle);
		txtParams.put("name", this.name);
		txtParams.put("net_weight", this.netWeight);
		txtParams.put("origin_address", this.originAddress);
		txtParams.put("pcs", this.pcs);
		txtParams.put("reject_lifecycle", this.rejectLifecycle);
		txtParams.put("size", this.size);
		txtParams.put("specification", this.specification);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("tag_price", this.tagPrice);
		txtParams.put("title", this.title);
		txtParams.put("type", this.type);
		txtParams.put("use_yn", this.useYn);
		txtParams.put("volume", this.volume);
		txtParams.put("width", this.width);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsSkuCreateResponse> getResponseClass() {
		return WlbWmsSkuCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemCode, "itemCode");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkNotEmpty(useYn, "useYn");
	}
	

}