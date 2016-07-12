package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 产品分销商属性
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoPdu extends TaobaoObject {

	private static final long serialVersionUID = 1211872857624193135L;

	/**
	 * 分销商ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * 分销商用户名
	 */
	@ApiField("distributor_name")
	private String distributorName;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品代销配额库存
	 */
	@ApiField("quantity_agent")
	private Long quantityAgent;

	/**
	 * 产品销售属性值
	 */
	@ApiField("sku_properties")
	private String skuProperties;


	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return this.distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getQuantityAgent() {
		return this.quantityAgent;
	}
	public void setQuantityAgent(Long quantityAgent) {
		this.quantityAgent = quantityAgent;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

}
