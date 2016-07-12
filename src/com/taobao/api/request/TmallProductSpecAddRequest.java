package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSpecAddResponse;

/**
 * TOP API: tmall.product.spec.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class TmallProductSpecAddRequest extends BaseTaobaoRequest<TmallProductSpecAddResponse> implements TaobaoUploadRequest<TmallProductSpecAddResponse> {

	
	

	/** 
	* 产品二维码
	 */
	private String barcode;

	/** 
	* 存放产品规格认证类型-认证图片url映射信息，格式为k:v;k:v;，其中key为认证类型数字id，value为调用tmall.product.spec.pic.upload返回的认证图片url文本
	 */
	private String certifiedPicStr;

	/** 
	* 存放产品规格认证类型-认证文本映射信息，格式为k:v;k:v;，其中key为认证类型数字id，value为认证文本值
	 */
	private String certifiedTxtStr;

	/** 
	* 产品基础色，数据格式为：pid:vid:rvid1,rvid2,rvid3;pid:vid:rvid1
	 */
	private String changeProp;

	/** 
	* 用户自定义销售属性，结构：pid1:value1;pid2:value2。在
	 */
	private String customerSpecProps;

	/** 
	* 产品图片
	 */
	private FileItem image;

	/** 
	* 产品规格吊牌价，以分为单位，无默认值，上限999999999
	 */
	private Long labelPrice;

	/** 
	* 产品上市时间
	 */
	private Date marketTime;

	/** 
	* 产品货号
	 */
	private String productCode;

	/** 
	* 产品ID
	 */
	private Long productId;

	/** 
	* 产品的规格属性
	 */
	private String specProps;

	/** 
	* 规格属性别名,只允许传颜色别名
	 */
	private String specPropsAlias;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setCertifiedPicStr(String certifiedPicStr) {
		this.certifiedPicStr = certifiedPicStr;
	}

	public String getCertifiedPicStr() {
		return this.certifiedPicStr;
	}

	public void setCertifiedTxtStr(String certifiedTxtStr) {
		this.certifiedTxtStr = certifiedTxtStr;
	}

	public String getCertifiedTxtStr() {
		return this.certifiedTxtStr;
	}

	public void setChangeProp(String changeProp) {
		this.changeProp = changeProp;
	}

	public String getChangeProp() {
		return this.changeProp;
	}

	public void setCustomerSpecProps(String customerSpecProps) {
		this.customerSpecProps = customerSpecProps;
	}

	public String getCustomerSpecProps() {
		return this.customerSpecProps;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setLabelPrice(Long labelPrice) {
		this.labelPrice = labelPrice;
	}

	public Long getLabelPrice() {
		return this.labelPrice;
	}

	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}

	public Date getMarketTime() {
		return this.marketTime;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setSpecProps(String specProps) {
		this.specProps = specProps;
	}

	public String getSpecProps() {
		return this.specProps;
	}

	public void setSpecPropsAlias(String specPropsAlias) {
		this.specPropsAlias = specPropsAlias;
	}

	public String getSpecPropsAlias() {
		return this.specPropsAlias;
	}

	public String getApiMethodName() {
		return "tmall.product.spec.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("barcode", this.barcode);
		txtParams.put("certified_pic_str", this.certifiedPicStr);
		txtParams.put("certified_txt_str", this.certifiedTxtStr);
		txtParams.put("change_prop", this.changeProp);
		txtParams.put("customer_spec_props", this.customerSpecProps);
		txtParams.put("label_price", this.labelPrice);
		txtParams.put("market_time", this.marketTime);
		txtParams.put("product_code", this.productCode);
		txtParams.put("product_id", this.productId);
		txtParams.put("spec_props", this.specProps);
		txtParams.put("spec_props_alias", this.specPropsAlias);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSpecAddResponse> getResponseClass() {
		return TmallProductSpecAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(image, "image");
		RequestCheckUtils.checkMaxValue(labelPrice, 999999999L, "labelPrice");
		RequestCheckUtils.checkMinValue(labelPrice, 0L, "labelPrice");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkMaxLength(specPropsAlias, 60, "specPropsAlias");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}