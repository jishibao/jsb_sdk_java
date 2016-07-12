package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RoomType;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.type.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelTypeAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1863155198837774727L;

	/** 
	 * 房型结构
	 */
	@ApiField("room_type")
	private RoomType roomType;


	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public RoomType getRoomType( ) {
		return this.roomType;
	}
	


}
