package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductGradepriceUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoProductGradepriceUpdateRequest extends BaseTaobaoRequest<FenxiaoProductGradepriceUpdateResponse> {
	
	

	/** 
	* 会员等级的id或者分销商id，例如：”1001,2001,1002”
	 */
	private String ids;

	/** 
	* 优惠价格,大小为0到100000000之间的整数或两位小数，例：优惠价格为：100元2角5分，传入的参数应写成：100.25
	 */
	private String prices;

	/** 
	* 产品Id
	 */
	private Long productId;

	/** 
	* skuId，如果产品有skuId,必须要输入skuId;没有skuId的时候不必选
	 */
	private Long skuId;

	/** 
	* 选择折扣方式：GRADE（按等级进行设置）;DISCITUTOR(按分销商进行设置）。例如"GRADE,DISTRIBUTOR"
	 */
	private String targetType;

	/** 
	* 交易类型： AGENT(代销)、DEALER(经销)，ALL(代销和经销)
	 */
	private String tradeType;

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getIds() {
		return this.ids;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public String getPrices() {
		return this.prices;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.gradeprice.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ids", this.ids);
		txtParams.put("prices", this.prices);
		txtParams.put("product_id", this.productId);
		txtParams.put("sku_id", this.skuId);
		txtParams.put("target_type", this.targetType);
		txtParams.put("trade_type", this.tradeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductGradepriceUpdateResponse> getResponseClass() {
		return FenxiaoProductGradepriceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(ids, "ids");
		RequestCheckUtils.checkMaxListSize(ids, 200, "ids");
		RequestCheckUtils.checkNotEmpty(prices, "prices");
		RequestCheckUtils.checkMaxListSize(prices, 200, "prices");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(targetType, "targetType");
	}
	

}