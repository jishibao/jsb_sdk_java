package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductImageDeleteResponse;

/**
 * TOP API: taobao.fenxiao.product.image.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class FenxiaoProductImageDeleteRequest extends BaseTaobaoRequest<FenxiaoProductImageDeleteResponse> {
	
	

	/** 
	* 图片位置
	 */
	private Long position;

	/** 
	* 产品ID
	 */
	private Long productId;

	/** 
	* properties表示sku图片的属性。key:value形式，key是pid，value是vid。如果position是0的话，则properties需要是必传项
	 */
	private String properties;

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getPosition() {
		return this.position;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.image.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("position", this.position);
		txtParams.put("product_id", this.productId);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductImageDeleteResponse> getResponseClass() {
		return FenxiaoProductImageDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(position, "position");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}