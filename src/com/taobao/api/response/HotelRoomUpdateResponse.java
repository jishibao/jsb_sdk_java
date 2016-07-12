package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Room;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.room.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelRoomUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3135452697246868561L;

	/** 
	 * 商品结构
	 */
	@ApiField("room")
	private Room room;


	public void setRoom(Room room) {
		this.room = room;
	}
	public Room getRoom( ) {
		return this.room;
	}
	


}
