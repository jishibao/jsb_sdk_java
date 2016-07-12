package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItem extends TaobaoObject {

	private static final long serialVersionUID = 3614499192844679857L;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 标记，用逗号隔开的字符串。
BIT_HAS_AUTHORIZE 第1位 是否有授权规则;
BATCH  第2位 是否有批次规则；
SYNCHRONIZATION 第3位 是否有同步规则。
	 */
	@ApiField("flag")
	private String flag;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改日期
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 货类
	 */
	@ApiField("goods_cat")
	private String goodsCat;

	/**
	 * 高
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否危险品
	 */
	@ApiField("is_dangerous")
	private Boolean isDangerous;

	/**
	 * 是否易碎
	 */
	@ApiField("is_friable")
	private Boolean isFriable;

	/**
	 * 是不是sku商品
值为true或false
	 */
	@ApiField("is_sku")
	private Boolean isSku;

	/**
	 * 商家编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 最后修改人
	 */
	@ApiField("last_modifier")
	private String lastModifier;

	/**
	 * mm
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 商品的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 包装材料
	 */
	@ApiField("package_material")
	private String packageMaterial;

	/**
	 * 父item的id，当item为物流宝子商品时，parent_id必填,否则不必填
可通过父ID来得知商品的关系。
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 价格
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 计价货类
	 */
	@ApiField("pricing_cat")
	private String pricingCat;

	/**
	 * 属性key:value; key:value
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 发布版本号，用来同步商
	 */
	@ApiField("publish_version")
	private Long publishVersion;

	/**
	 * 商品备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 状态，item_status_valid -- 1 表示 有效 item_status_lock -- 2 表示锁住
	 */
	@ApiField("status")
	private String status;

	/**
	 * 前台商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品类型：
NORMAL--普通类型;
COMBINE--组合商品;
DISTRIBUTION--分销商品;
默认为NORMAL
	 */
	@ApiField("type")
	private String type;

	/**
	 * 商品所有人淘宝ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 商品所有人淘宝nick
	 */
	@ApiField("user_nick")
	private String userNick;

	/**
	 * 立方mm
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 重量
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * 宽
	 */
	@ApiField("width")
	private Long width;


	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getFlag() {
		return this.flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGoodsCat() {
		return this.goodsCat;
	}
	public void setGoodsCat(String goodsCat) {
		this.goodsCat = goodsCat;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public Boolean getIsSku() {
		return this.isSku;
	}
	public void setIsSku(Boolean isSku) {
		this.isSku = isSku;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getLastModifier() {
		return this.lastModifier;
	}
	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPackageMaterial() {
		return this.packageMaterial;
	}
	public void setPackageMaterial(String packageMaterial) {
		this.packageMaterial = packageMaterial;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPricingCat() {
		return this.pricingCat;
	}
	public void setPricingCat(String pricingCat) {
		this.pricingCat = pricingCat;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getPublishVersion() {
		return this.publishVersion;
	}
	public void setPublishVersion(Long publishVersion) {
		this.publishVersion = publishVersion;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
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

}
