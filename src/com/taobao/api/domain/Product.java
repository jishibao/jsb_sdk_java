package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 产品结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Product extends TaobaoObject {

	private static final long serialVersionUID = 7151639891612214539L;

	/**
	 * 产品条码信息，仅在taobao.products.search接口且商城可用
	 */
	@ApiField("barcode_str")
	private String barcodeStr;

	/**
	 * 产品的非关键属性列表.格式:pid:vid;pid:vid.
	 */
	@ApiField("binds")
	private String binds;

	/**
	 * 产品的非关键属性字符串列表.格式同props_str(<strong>注：</strong><font color="red">属性名称中的冒号":"被转换为："#cln#";  
分号";"被转换为："#scln#"
</font>)
	 */
	@ApiField("binds_str")
	private String bindsStr;

	/**
	 * 商品类目名称
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * 商品类目ID.必须是叶子类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 产品的collect次数（不提供数据，返回0)
	 */
	@ApiField("collect_num")
	private Long collectNum;

	/**
	 * 品类ID
	 */
	@ApiField("commodity_id")
	private Long commodityId;

	/**
	 * 创建时间.格式:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 标识是否为达尔文体系下的产品 。
如果为空表示是非达尔文体系下的产品
如果cspu:0 表示是达尔文体系下的产品，有cspu正在待小二审核，但不能发布商品。
如果cspu:1 表示是达尔文体系下的产品，且有小二确认的cspu，能发布商品
	 */
	@ApiField("cspu_feature")
	private String cspuFeature;

	/**
	 * 用户自定义属性,结构：pid1:value1;pid2:value2 例如：“20000:优衣库”，表示“品牌:优衣库”
	 */
	@ApiField("customer_props")
	private String customerProps;

	/**
	 * 产品的描述.最大25000个字节
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 标识套装产品是否有效，无效的套装产品需要重新发布
	 */
	@ApiField("is_suite_effective")
	private Boolean isSuiteEffective;

	/**
	 * 产品的级别level
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 修改时间.格式:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部产品ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 产品对应的图片路径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 产品的主图片地址.(绝对地址,格式:http://host/image_path)
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 产品的市场价.单位为元.精确到2位小数;如:200.07
	 */
	@ApiField("price")
	private String price;

	/**
	 * 产品扩展信息
	 */
	@ApiListField("product_extra_infos")
	@ApiField("product_extra_info")
	private List<ProductExtraInfo> productExtraInfos;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品的子图片.目前最多支持4张。fields中设置为product_imgs.id、product_imgs.url、product_imgs.position 等形式就会返回相应的字段
	 */
	@ApiListField("product_imgs")
	@ApiField("product_img")
	private List<ProductImg> productImgs;

	/**
	 * 产品的属性图片.比如说黄色对应的产品图片,绿色对应的产品图片。fields中设置为product_prop_imgs.id、 
product_prop_imgs.props、product_prop_imgs.url、product_prop_imgs.position等形式就会返回相应的字段
	 */
	@ApiListField("product_prop_imgs")
	@ApiField("product_prop_img")
	private List<ProductPropImg> productPropImgs;

	/**
	 * 销售属性值别名。格式为pid1:vid1:alias1;pid1:vid2:alia2。
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * 产品的关键属性列表.格式：pid:vid;pid:vid
	 */
	@ApiField("props")
	private String props;

	/**
	 * 产品的关键属性字符串列表.比如:品牌:诺基亚;型号:N73(<strong>注：</strong><font color="red">属性名称中的冒号":"被转换为："#cln#";  
分号";"被转换为："#scln#"
</font>)
	 */
	@ApiField("props_str")
	private String propsStr;

	/**
	 * 产品的评分次数
	 */
	@ApiField("rate_num")
	private Long rateNum;

	/**
	 * 产品的销售量
	 */
	@ApiField("sale_num")
	private Long saleNum;

	/**
	 * 产品的销售属性列表.格式:pid:vid;pid:vid
	 */
	@ApiField("sale_props")
	private String saleProps;

	/**
	 * 产品的销售属性字符串列表.格式同props_str(<strong>注：</strong><font color="red">属性名称中的冒号":"被转换为："#cln#";  
分号";"被转换为："#scln#"
</font>)
	 */
	@ApiField("sale_props_str")
	private String salePropsStr;

	/**
	 * 产品卖点描述，长度限制20个汉字
	 */
	@ApiField("sell_pt")
	private String sellPt;

	/**
	 * 产品的店内价格
	 */
	@ApiField("shop_price")
	private String shopPrice;

	/**
	 * 产品的标准价格
	 */
	@ApiField("standard_price")
	private String standardPrice;

	/**
	 * 当前状态(0 商家确认 1 屏蔽 3 小二确认 2 未确认 -1 删除)
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 套装产品关联的子规格,同时该字段不为空标识该产品是套装产品
	 */
	@ApiField("suite_items_str")
	private String suiteItemsStr;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 淘宝标准产品编码
	 */
	@ApiField("tsc")
	private String tsc;

	/**
	 * 垂直市场,如：3（3C），4（鞋城）
	 */
	@ApiField("vertical_market")
	private Long verticalMarket;


	public String getBarcodeStr() {
		return this.barcodeStr;
	}
	public void setBarcodeStr(String barcodeStr) {
		this.barcodeStr = barcodeStr;
	}

	public String getBinds() {
		return this.binds;
	}
	public void setBinds(String binds) {
		this.binds = binds;
	}

	public String getBindsStr() {
		return this.bindsStr;
	}
	public void setBindsStr(String bindsStr) {
		this.bindsStr = bindsStr;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCollectNum() {
		return this.collectNum;
	}
	public void setCollectNum(Long collectNum) {
		this.collectNum = collectNum;
	}

	public Long getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCspuFeature() {
		return this.cspuFeature;
	}
	public void setCspuFeature(String cspuFeature) {
		this.cspuFeature = cspuFeature;
	}

	public String getCustomerProps() {
		return this.customerProps;
	}
	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getIsSuiteEffective() {
		return this.isSuiteEffective;
	}
	public void setIsSuiteEffective(Boolean isSuiteEffective) {
		this.isSuiteEffective = isSuiteEffective;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<ProductExtraInfo> getProductExtraInfos() {
		return this.productExtraInfos;
	}
	public void setProductExtraInfos(List<ProductExtraInfo> productExtraInfos) {
		this.productExtraInfos = productExtraInfos;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public List<ProductImg> getProductImgs() {
		return this.productImgs;
	}
	public void setProductImgs(List<ProductImg> productImgs) {
		this.productImgs = productImgs;
	}

	public List<ProductPropImg> getProductPropImgs() {
		return this.productPropImgs;
	}
	public void setProductPropImgs(List<ProductPropImg> productPropImgs) {
		this.productPropImgs = productPropImgs;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getPropsStr() {
		return this.propsStr;
	}
	public void setPropsStr(String propsStr) {
		this.propsStr = propsStr;
	}

	public Long getRateNum() {
		return this.rateNum;
	}
	public void setRateNum(Long rateNum) {
		this.rateNum = rateNum;
	}

	public Long getSaleNum() {
		return this.saleNum;
	}
	public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

	public String getSaleProps() {
		return this.saleProps;
	}
	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getSalePropsStr() {
		return this.salePropsStr;
	}
	public void setSalePropsStr(String salePropsStr) {
		this.salePropsStr = salePropsStr;
	}

	public String getSellPt() {
		return this.sellPt;
	}
	public void setSellPt(String sellPt) {
		this.sellPt = sellPt;
	}

	public String getShopPrice() {
		return this.shopPrice;
	}
	public void setShopPrice(String shopPrice) {
		this.shopPrice = shopPrice;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSuiteItemsStr() {
		return this.suiteItemsStr;
	}
	public void setSuiteItemsStr(String suiteItemsStr) {
		this.suiteItemsStr = suiteItemsStr;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTsc() {
		return this.tsc;
	}
	public void setTsc(String tsc) {
		this.tsc = tsc;
	}

	public Long getVerticalMarket() {
		return this.verticalMarket;
	}
	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

}
