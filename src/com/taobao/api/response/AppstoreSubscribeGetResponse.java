package com.taobao.api.response;

import com.taobao.api.domain.UserSubscribe;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.appstore.subscribe.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AppstoreSubscribeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7326334573163698582L;

	/** 
	 * 用户订购信息
	 */
	@ApiField("user_subscribe")
	private UserSubscribe userSubscribe;


	public void setUserSubscribe(UserSubscribe userSubscribe) {
		this.userSubscribe = userSubscribe;
	}
	public UserSubscribe getUserSubscribe( ) {
		return this.userSubscribe;
	}
	


}
