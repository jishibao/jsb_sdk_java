package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeOrderskuUpdateResponse;

/**
 * TOP API: taobao.trade.ordersku.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.14
 */
public class TradeOrderskuUpdateRequest extends BaseTaobaoRequest<TradeOrderskuUpdateResponse> {
	
	

	/** 
	* 子订单编号（对于单笔订单的交易可以传交易编号）。
	 */
	private Long oid;

	/** 
	* 销售属性编号，可以通过taobao.item.skus.get获取订单对应的商品的所有销售属性。
	 */
	private Long skuId;

	/** 
	* 销售属性组合串，格式：p1:v1;p2:v2，如：1627207:28329;20509:28314。可以通过taobao.item.skus.get获取订单对应的商品的所有销售属性。
	 */
	private String skuProps;

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public String getSkuProps() {
		return this.skuProps;
	}

	public String getApiMethodName() {
		return "taobao.trade.ordersku.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("oid", this.oid);
		txtParams.put("sku_id", this.skuId);
		txtParams.put("sku_props", this.skuProps);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeOrderskuUpdateResponse> getResponseClass() {
		return TradeOrderskuUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(oid, "oid");
	}
	

}