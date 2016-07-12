package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Consignorderlist;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.order.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignOrderNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3774953518994689888L;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("consign_order_list")
	@ApiField("consignorderlist")
	private List<Consignorderlist> consignOrderList;

	/** 
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误详细
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setConsignOrderList(List<Consignorderlist> consignOrderList) {
		this.consignOrderList = consignOrderList;
	}
	public List<Consignorderlist> getConsignOrderList( ) {
		return this.consignOrderList;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	


}
