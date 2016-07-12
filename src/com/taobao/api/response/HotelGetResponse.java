package com.taobao.api.response;

import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1634637351361422991L;

	/** 
	 * 酒店结构
	 */
	@ApiField("hotel")
	private Hotel hotel;


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Hotel getHotel( ) {
		return this.hotel;
	}
	


}
