package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 一般进口服务结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ResourceResult extends TaobaoObject {

	private static final long serialVersionUID = 7738163416857687353L;

	/**
	 * 服务报价。首重（1磅) CNY￥3元 续重（1磅) CNY￥6元
	 */
	@ApiField("delivery_price")
	private DeliveryPrice deliveryPrice;

	/**
	 * 时效，单位（小时）
	 */
	@ApiField("delivery_time")
	private Long deliveryTime;

	/**
	 * 资源代码
	 */
	@ApiField("res_code")
	private String resCode;

	/**
	 * 资源ID
	 */
	@ApiField("res_id")
	private Long resId;

	/**
	 * 魔方天下美国线
	 */
	@ApiField("resource_name")
	private String resourceName;


	public DeliveryPrice getDeliveryPrice() {
		return this.deliveryPrice;
	}
	public void setDeliveryPrice(DeliveryPrice deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public Long getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getResCode() {
		return this.resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public Long getResId() {
		return this.resId;
	}
	public void setResId(Long resId) {
		this.resId = resId;
	}

	public String getResourceName() {
		return this.resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

}
