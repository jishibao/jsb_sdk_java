package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.HotelImage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.image.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelImageUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6243724282618359986L;

	/** 
	 * 酒店图片
	 */
	@ApiField("hotel_image")
	private HotelImage hotelImage;


	public void setHotelImage(HotelImage hotelImage) {
		this.hotelImage = hotelImage;
	}
	public HotelImage getHotelImage( ) {
		return this.hotelImage;
	}
	


}
