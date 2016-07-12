package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.sku.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsSkuGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5764294962422246385L;

	/** 
	 * 保质期预警天数
	 */
	@ApiField("advent_lifecycle")
	private Long adventLifecycle;

	/** 
	 * 批准文号
	 */
	@ApiField("approval_number")
	private String approvalNumber;

	/** 
	 * 条形码，多条码请用”;”分隔；
	 */
	@ApiField("bar_code")
	private String barCode;

	/** 
	 * 品牌编码
	 */
	@ApiField("brand")
	private String brand;

	/** 
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 商品类别编码（外部系统类别）
	 */
	@ApiField("category")
	private String category;

	/** 
	 * 商品类别名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/** 
	 * 颜色
	 */
	@ApiField("color")
	private String color;

	/** 
	 * 成本价，单位分
	 */
	@ApiField("cost_price")
	private Long costPrice;

	/** 
	 * 拓展属性, key-value结构，格式要求： 以英文分号“;”分隔每组key-value，以英文冒号“:”分隔key与value。如果value中带有分号，需要转成下划线“_”，如果带有冒号，需要转成中划线“-”
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/** 
	 * 毛重，单位克
	 */
	@ApiField("gross_weight")
	private Long grossWeight;

	/** 
	 * 高度，单位毫米
	 */
	@ApiField("height")
	private Long height;

	/** 
	 * 商家商品编码,与itemid必须有一个值不为空
	 */
	@ApiField("iitem_code")
	private String iitemCode;

	/** 
	 * 是否区域销售
	 */
	@ApiField("is_area_sale")
	private Boolean isAreaSale;

	/** 
	 * 是否启用批次管理
	 */
	@ApiField("is_batch_mgt")
	private Boolean isBatchMgt;

	/** 
	 * 是否危险品
	 */
	@ApiField("is_danger")
	private Boolean isDanger;

	/** 
	 * 是否易碎品
	 */
	@ApiField("is_hygroscopic")
	private Boolean isHygroscopic;

	/** 
	 * 是否启用保质期管理
	 */
	@ApiField("is_shelflife")
	private Boolean isShelflife;

	/** 
	 * 是否启用序列号管理
	 */
	@ApiField("is_sn_mgt")
	private Boolean isSnMgt;

	/** 
	 * 菜鸟商品ID,与itemcode必须有一个值不为空
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 零售价，单位分
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/** 
	 * 长度，单位毫米
	 */
	@ApiField("length")
	private Long length;

	/** 
	 * 保质期天数
	 */
	@ApiField("lifecycle")
	private Long lifecycle;

	/** 
	 * 保质期禁售天数
	 */
	@ApiField("lockup_lifecycle")
	private Long lockupLifecycle;

	/** 
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 净重，单位克
	 */
	@ApiField("net_weight")
	private Long netWeight;

	/** 
	 * 场地
	 */
	@ApiField("origin_address")
	private Long originAddress;

	/** 
	 * 箱规
	 */
	@ApiField("pcs")
	private Long pcs;

	/** 
	 * 保质期禁收天数
	 */
	@ApiField("reject_lifecycle")
	private Long rejectLifecycle;

	/** 
	 * 尺寸
	 */
	@ApiField("size")
	private String size;

	/** 
	 * 规格
	 */
	@ApiField("specification")
	private String specification;

	/** 
	 * 吊牌价，单位分
	 */
	@ApiField("tag_price")
	private Long tagPrice;

	/** 
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 商品类别 NORMAL：普通商品、 COMBINE：组合商品、 DISTRIBUTION：分销商品
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 启用标识
	 */
	@ApiField("use_yn")
	private Boolean useYn;

	/** 
	 * 体积，单位立方厘米
	 */
	@ApiField("volume")
	private Long volume;

	/** 
	 * 宽度，单位毫米
	 */
	@ApiField("width")
	private Long width;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setAdventLifecycle(Long adventLifecycle) {
		this.adventLifecycle = adventLifecycle;
	}
	public Long getAdventLifecycle( ) {
		return this.adventLifecycle;
	}

	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}
	public String getApprovalNumber( ) {
		return this.approvalNumber;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getBarCode( ) {
		return this.barCode;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand( ) {
		return this.brand;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory( ) {
		return this.category;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName( ) {
		return this.categoryName;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor( ) {
		return this.color;
	}

	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}
	public Long getCostPrice( ) {
		return this.costPrice;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}
	public String getExtendFields( ) {
		return this.extendFields;
	}

	public void setGrossWeight(Long grossWeight) {
		this.grossWeight = grossWeight;
	}
	public Long getGrossWeight( ) {
		return this.grossWeight;
	}

	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getHeight( ) {
		return this.height;
	}

	public void setIitemCode(String iitemCode) {
		this.iitemCode = iitemCode;
	}
	public String getIitemCode( ) {
		return this.iitemCode;
	}

	public void setIsAreaSale(Boolean isAreaSale) {
		this.isAreaSale = isAreaSale;
	}
	public Boolean getIsAreaSale( ) {
		return this.isAreaSale;
	}

	public void setIsBatchMgt(Boolean isBatchMgt) {
		this.isBatchMgt = isBatchMgt;
	}
	public Boolean getIsBatchMgt( ) {
		return this.isBatchMgt;
	}

	public void setIsDanger(Boolean isDanger) {
		this.isDanger = isDanger;
	}
	public Boolean getIsDanger( ) {
		return this.isDanger;
	}

	public void setIsHygroscopic(Boolean isHygroscopic) {
		this.isHygroscopic = isHygroscopic;
	}
	public Boolean getIsHygroscopic( ) {
		return this.isHygroscopic;
	}

	public void setIsShelflife(Boolean isShelflife) {
		this.isShelflife = isShelflife;
	}
	public Boolean getIsShelflife( ) {
		return this.isShelflife;
	}

	public void setIsSnMgt(Boolean isSnMgt) {
		this.isSnMgt = isSnMgt;
	}
	public Boolean getIsSnMgt( ) {
		return this.isSnMgt;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Long getItemPrice( ) {
		return this.itemPrice;
	}

	public void setLength(Long length) {
		this.length = length;
	}
	public Long getLength( ) {
		return this.length;
	}

	public void setLifecycle(Long lifecycle) {
		this.lifecycle = lifecycle;
	}
	public Long getLifecycle( ) {
		return this.lifecycle;
	}

	public void setLockupLifecycle(Long lockupLifecycle) {
		this.lockupLifecycle = lockupLifecycle;
	}
	public Long getLockupLifecycle( ) {
		return this.lockupLifecycle;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNetWeight(Long netWeight) {
		this.netWeight = netWeight;
	}
	public Long getNetWeight( ) {
		return this.netWeight;
	}

	public void setOriginAddress(Long originAddress) {
		this.originAddress = originAddress;
	}
	public Long getOriginAddress( ) {
		return this.originAddress;
	}

	public void setPcs(Long pcs) {
		this.pcs = pcs;
	}
	public Long getPcs( ) {
		return this.pcs;
	}

	public void setRejectLifecycle(Long rejectLifecycle) {
		this.rejectLifecycle = rejectLifecycle;
	}
	public Long getRejectLifecycle( ) {
		return this.rejectLifecycle;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize( ) {
		return this.size;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getSpecification( ) {
		return this.specification;
	}

	public void setTagPrice(Long tagPrice) {
		this.tagPrice = tagPrice;
	}
	public Long getTagPrice( ) {
		return this.tagPrice;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setUseYn(Boolean useYn) {
		this.useYn = useYn;
	}
	public Boolean getUseYn( ) {
		return this.useYn;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Long getVolume( ) {
		return this.volume;
	}

	public void setWidth(Long width) {
		this.width = width;
	}
	public Long getWidth( ) {
		return this.width;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	


}
