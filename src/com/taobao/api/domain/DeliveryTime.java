package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 发货时间数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryTime extends TaobaoObject {

	private static final long serialVersionUID = 1436933426236434636L;

	/**
	 * 商品级别设置的发货时间。设置了商品级别的发货时间，相对发货时间，则填写相对发货时间的天数（大于3）；绝对发货时间，则填写yyyy-mm-dd格式，如2013-11-11
	 */
	@ApiField("delivery_time")
	private String deliveryTime;

	/**
	 * 发货时间类型：绝对发货时间或者相对发货时间
	 */
	@ApiField("delivery_time_type")
	private String deliveryTimeType;

	/**
	 * 设置是否使用发货时间，商品级别，sku级别
	 */
	@ApiField("need_delivery_time")
	private String needDeliveryTime;

	/**
	 * 商品自动退款参数
	 */
	@ApiField("onsale_auto_refund_ratio")
	private Long onsaleAutoRefundRatio;

	/**
	 * 发货时间列表
	 */
	@ApiListField("skus_delivery_time_list")
	@ApiField("skus_delivery_time")
	private List<SkusDeliveryTime> skusDeliveryTimeList;


	public String getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryTimeType() {
		return this.deliveryTimeType;
	}
	public void setDeliveryTimeType(String deliveryTimeType) {
		this.deliveryTimeType = deliveryTimeType;
	}

	public String getNeedDeliveryTime() {
		return this.needDeliveryTime;
	}
	public void setNeedDeliveryTime(String needDeliveryTime) {
		this.needDeliveryTime = needDeliveryTime;
	}

	public Long getOnsaleAutoRefundRatio() {
		return this.onsaleAutoRefundRatio;
	}
	public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
		this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
	}

	public List<SkusDeliveryTime> getSkusDeliveryTimeList() {
		return this.skusDeliveryTimeList;
	}
	public void setSkusDeliveryTimeList(List<SkusDeliveryTime> skusDeliveryTimeList) {
		this.skusDeliveryTimeList = skusDeliveryTimeList;
	}

}
