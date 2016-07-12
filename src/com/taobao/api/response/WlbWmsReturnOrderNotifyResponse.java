package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.return.order.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsReturnOrderNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8435358573133874988L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * LBX929829111
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}
	public String getStoreOrderCode( ) {
		return this.storeOrderCode;
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
