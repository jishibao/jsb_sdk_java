package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureIsreferencedGetResponse;

/**
 * TOP API: taobao.picture.isreferenced.get request
 * 
 * @author top auto create
 * @since 1.0, 2013.11.26
 */
public class PictureIsreferencedGetRequest extends BaseTaobaoRequest<PictureIsreferencedGetResponse> {
	
	

	/** 
	* 图片id
	 */
	private Long pictureId;

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public String getApiMethodName() {
		return "taobao.picture.isreferenced.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("picture_id", this.pictureId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureIsreferencedGetResponse> getResponseClass() {
		return PictureIsreferencedGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
	}
	

}