package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TmcUser;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6584811132982764535L;

	/** 
	 * 开通的用户数据
	 */
	@ApiField("tmc_user")
	private TmcUser tmcUser;


	public void setTmcUser(TmcUser tmcUser) {
		this.tmcUser = tmcUser;
	}
	public TmcUser getTmcUser( ) {
		return this.tmcUser;
	}
	


}
