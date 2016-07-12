package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ProductsSearchResponse;

/**
 * TOP API: taobao.products.search request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.21
 */
public class ProductsSearchRequest extends BaseTaobaoRequest<ProductsSearchResponse> {
	
	

	/** 
	* 按条码搜索产品信息,多个逗号隔开，不支持条码为全零的方式
	 */
	private String barcodeStr;

	/** 
	* 商品类目ID.调用taobao.itemcats.get获取.
	 */
	private Long cid;

	/** 
	* 用户自定义关键属性,结构：pid1:value1;pid2:value2，如果有型号，系列等子属性用: 隔开 例如：“20000:优衣库:型号:001;632501:1234”，表示“品牌:优衣库:型号:001;货号:1234”
	 */
	private String customerProps;

	/** 
	* 需返回的字段列表.可选值:Product数据结构中的以下字段:product_id,name,pic_url,cid,props,price,tsc;多个字段之间用","分隔.新增字段status(product的当前状态)
	 */
	private String fields;

	/** 
	* 市场ID，1为取C2C市场的产品信息， 2为取B2C市场的产品信息。
不填写此值则默认取C2C的产品信息。
	 */
	private String marketId;

	/** 
	* 页码.传入值为1代表第一页,传入值为2代表第二页,依此类推.默认返回的数据是从第一页开始.
	 */
	private Long pageNo;

	/** 
	* 每页条数.每页返回最多返回100条,默认值为40.
	 */
	private Long pageSize;

	/** 
	* 属性,属性值的组合.格式:pid:vid;pid:vid;调用taobao.itemprops.get获取类目属性pid 
,再用taobao.itempropvalues.get取得vid.
	 */
	private String props;

	/** 
	* 搜索的关键词是用来搜索产品的title.　注:q,cid和props至少传入一个
	 */
	private String q;

	/** 
	* 想要获取的产品的状态列表，支持多个状态并列获取，多个状态之间用","分隔，最多同时指定5种状态。例如，只获取小二确认的spu传入"3",只要商家确认的传入"0"，既要小二确认又要商家确认的传入"0,3"。目前只支持者两种类型的状态搜索，输入其他状态无效。
	 */
	private String status;

	/** 
	* 按关联产品规格specs搜索套装产品
	 */
	private String suiteItemsStr;

	/** 
	* 传入值为：3表示3C表示3C垂直市场产品，4表示鞋城垂直市场产品，8表示网游垂直市场产品。一次只能指定一种垂直市场类型
	 */
	private Long verticalMarket;

	public void setBarcodeStr(String barcodeStr) {
		this.barcodeStr = barcodeStr;
	}

	public String getBarcodeStr() {
		return this.barcodeStr;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}

	public String getCustomerProps() {
		return this.customerProps;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getMarketId() {
		return this.marketId;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getProps() {
		return this.props;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getQ() {
		return this.q;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setSuiteItemsStr(String suiteItemsStr) {
		this.suiteItemsStr = suiteItemsStr;
	}

	public String getSuiteItemsStr() {
		return this.suiteItemsStr;
	}

	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

	public Long getVerticalMarket() {
		return this.verticalMarket;
	}

	public String getApiMethodName() {
		return "taobao.products.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("barcode_str", this.barcodeStr);
		txtParams.put("cid", this.cid);
		txtParams.put("customer_props", this.customerProps);
		txtParams.put("fields", this.fields);
		txtParams.put("market_id", this.marketId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("props", this.props);
		txtParams.put("q", this.q);
		txtParams.put("status", this.status);
		txtParams.put("suite_items_str", this.suiteItemsStr);
		txtParams.put("vertical_market", this.verticalMarket);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ProductsSearchResponse> getResponseClass() {
		return ProductsSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxLength(status, 20, "status");
		RequestCheckUtils.checkMinValue(verticalMarket, 0L, "verticalMarket");
	}
	

}