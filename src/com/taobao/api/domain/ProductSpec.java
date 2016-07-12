package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * ProductSpec(产品规格)结构。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ProductSpec extends TaobaoObject {

	private static final long serialVersionUID = 1512219524952249363L;

	/**
	 * 产品规格条形码，支持EAN-13格式。
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 产品品牌id
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 认证图片列表
	 */
	@ApiListField("certified_pics")
	@ApiField("cert_pic_info")
	private List<CertPicInfo> certifiedPics;

	/**
	 * 认证文本列表
	 */
	@ApiListField("certified_txts")
	@ApiField("cert_txt_info")
	private List<CertTxtInfo> certifiedTxts;

	/**
	 * 基础色数据
	 */
	@ApiField("change_prop")
	private String changeProp;

	/**
	 * 用户输入的属性值存放位置，例如可输入的销售属性，当用户获取pid vid后，应该先从spec_props_alias中获取，然后通过类目属性获取，获取不到，可以通过这个字段获取。
	 */
	@ApiField("custome_props_name")
	private String customePropsName;

	/**
	 * 产品规格吊牌价，以分为单位的整数，非负,无默认值，上限999999999
	 */
	@ApiField("label_price")
	private Long labelPrice;

	/**
	 * 上市时间
	 */
	@ApiField("market_time")
	private Date marketTime;

	/**
	 * 规格的数量，仅当通过组合产品获取时有值
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 产品的主图片地址。绝对地址，格式：http://host/image_path。
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 产品货号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品ID。
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品规格ID。
	 */
	@ApiField("spec_id")
	private Long specId;

	/**
	 * 产品规格的销售属性组合。格式为：pid:vid;pid:vid。其中：pid是销售属性id，vid是销售属性值id。如果该类目品牌下面没有销售属性，可以不用填写。销售属性通过tmall.brandcat.salespro.get接口获取。
	 */
	@ApiField("spec_props")
	private String specProps;

	/**
	 * 销售属性值别名。格式为：pid1:vid1:别名1;pid2:vid2:别名2。其中：pid是销售属性id，vid是销售属性值id。别名长度不可以超过30个字符。目前只有颜色销售属性支持别名。
	 */
	@ApiField("spec_props_alias")
	private String specPropsAlias;

	/**
	 * 1:表示可以使用的数据，也就是审核通过的。
3：表示等待小二审核的产品规格，这个数据暂时还不能使用，要等待审核通过后，才能使用。
	 */
	@ApiField("status")
	private Long status;


	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public List<CertPicInfo> getCertifiedPics() {
		return this.certifiedPics;
	}
	public void setCertifiedPics(List<CertPicInfo> certifiedPics) {
		this.certifiedPics = certifiedPics;
	}

	public List<CertTxtInfo> getCertifiedTxts() {
		return this.certifiedTxts;
	}
	public void setCertifiedTxts(List<CertTxtInfo> certifiedTxts) {
		this.certifiedTxts = certifiedTxts;
	}

	public String getChangeProp() {
		return this.changeProp;
	}
	public void setChangeProp(String changeProp) {
		this.changeProp = changeProp;
	}

	public String getCustomePropsName() {
		return this.customePropsName;
	}
	public void setCustomePropsName(String customePropsName) {
		this.customePropsName = customePropsName;
	}

	public Long getLabelPrice() {
		return this.labelPrice;
	}
	public void setLabelPrice(Long labelPrice) {
		this.labelPrice = labelPrice;
	}

	public Date getMarketTime() {
		return this.marketTime;
	}
	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getSpecId() {
		return this.specId;
	}
	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public String getSpecProps() {
		return this.specProps;
	}
	public void setSpecProps(String specProps) {
		this.specProps = specProps;
	}

	public String getSpecPropsAlias() {
		return this.specPropsAlias;
	}
	public void setSpecPropsAlias(String specPropsAlias) {
		this.specPropsAlias = specPropsAlias;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
