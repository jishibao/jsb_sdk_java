package com.taobao.api.response;

import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.order.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8151122297719296767L;

	/** 
	 * 订单结构，是否返回入住人列表根据参数决定
	 */
	@ApiField("hotel_order")
	private HotelOrder hotelOrder;


	public void setHotelOrder(HotelOrder hotelOrder) {
		this.hotelOrder = hotelOrder;
	}
	public HotelOrder getHotelOrder( ) {
		return this.hotelOrder;
	}
	


}
