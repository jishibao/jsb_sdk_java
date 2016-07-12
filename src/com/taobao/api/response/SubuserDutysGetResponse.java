package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Duty;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.subuser.dutys.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserDutysGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4419414295638377291L;

	/** 
	 * 职务信息
	 */
	@ApiListField("dutys")
	@ApiField("duty")
	private List<Duty> dutys;


	public void setDutys(List<Duty> dutys) {
		this.dutys = dutys;
	}
	public List<Duty> getDutys( ) {
		return this.dutys;
	}
	


}
