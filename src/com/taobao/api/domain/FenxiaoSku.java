package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 分销产品SKU
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoSku extends TaobaoObject {

	private static final long serialVersionUID = 8112316166222852576L;

	/**
	 * 代销采购价，单位：元
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * 经销采购价
	 */
	@ApiField("dealer_cost_price")
	private String dealerCostPrice;

	/**
	 * SkuID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * sku的销售属性组合字符串。格式:pid:vid;pid:vid,如:1627207:3232483;1630696:3284570,表示:机身颜色:军绿色;手机套餐:一电一充。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 库存
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 配额可用库存
	 */
	@ApiField("quota_quantity")
	private Long quotaQuantity;

	/**
	 * 预扣库存
	 */
	@ApiField("reserved_quantity")
	private Long reservedQuantity;

	/**
	 * 关联的后端商品id
	 */
	@ApiField("scitem_id")
	private Long scitemId;

	/**
	 * 市场价
	 */
	@ApiField("standard_price")
	private String standardPrice;


	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getDealerCostPrice() {
		return this.dealerCostPrice;
	}
	public void setDealerCostPrice(String dealerCostPrice) {
		this.dealerCostPrice = dealerCostPrice;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuotaQuantity() {
		return this.quotaQuantity;
	}
	public void setQuotaQuantity(Long quotaQuantity) {
		this.quotaQuantity = quotaQuantity;
	}

	public Long getReservedQuantity() {
		return this.reservedQuantity;
	}
	public void setReservedQuantity(Long reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}

	public Long getScitemId() {
		return this.scitemId;
	}
	public void setScitemId(Long scitemId) {
		this.scitemId = scitemId;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

}
