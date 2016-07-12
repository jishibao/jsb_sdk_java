package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.rooms.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelRoomsUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4733278288538981279L;

	/** 
	 * 成功的gid list
	 */
	@ApiListField("gids")
	@ApiField("string")
	private List<String> gids;


	public void setGids(List<String> gids) {
		this.gids = gids;
	}
	public List<String> getGids( ) {
		return this.gids;
	}
	


}
