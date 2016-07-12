package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureUpdateResponse;

/**
 * TOP API: taobao.picture.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class PictureUpdateRequest extends BaseTaobaoRequest<PictureUpdateResponse> {
	
	

	/** 
	* 新的图片名，最大长度50字符，不能为空
	 */
	private String newName;

	/** 
	* 要更改名字的图片的id
	 */
	private Long pictureId;

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getNewName() {
		return this.newName;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public String getApiMethodName() {
		return "taobao.picture.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("new_name", this.newName);
		txtParams.put("picture_id", this.pictureId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureUpdateResponse> getResponseClass() {
		return PictureUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(newName, "newName");
		RequestCheckUtils.checkMaxLength(newName, 50, "newName");
		RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
	}
	

}