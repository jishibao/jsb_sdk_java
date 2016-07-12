package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6485219541157155742L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 物流宝订单创建成功后，返回物流宝的订单编号；如果订单创建失败，该字段为空。
	 */
	@ApiField("order_code")
	private String orderCode;


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}
	


}
