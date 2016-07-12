package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureDeleteResponse;

/**
 * TOP API: taobao.picture.delete request
 * 
 * @author top auto create
 * @since 1.0, 2014.06.04
 */
public class PictureDeleteRequest extends BaseTaobaoRequest<PictureDeleteResponse> {
	
	

	/** 
	* 图片ID字符串,可以一个也可以一组,用英文逗号间隔,如450,120,155.限制数量是100
	 */
	private String pictureIds;

	public void setPictureIds(String pictureIds) {
		this.pictureIds = pictureIds;
	}

	public String getPictureIds() {
		return this.pictureIds;
	}

	public String getApiMethodName() {
		return "taobao.picture.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("picture_ids", this.pictureIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureDeleteResponse> getResponseClass() {
		return PictureDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pictureIds, "pictureIds");
		RequestCheckUtils.checkMaxListSize(pictureIds, 100, "pictureIds");
	}
	

}