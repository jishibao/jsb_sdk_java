package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ArticleUserSubscribe;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.subscribe.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasSubscribeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6313451353382885986L;

	/** 
	 * 用户订购信息
	 */
	@ApiListField("article_user_subscribes")
	@ApiField("article_user_subscribe")
	private List<ArticleUserSubscribe> articleUserSubscribes;


	public void setArticleUserSubscribes(List<ArticleUserSubscribe> articleUserSubscribes) {
		this.articleUserSubscribes = articleUserSubscribes;
	}
	public List<ArticleUserSubscribe> getArticleUserSubscribes( ) {
		return this.articleUserSubscribes;
	}
	


}
