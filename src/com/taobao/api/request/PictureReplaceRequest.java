package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureReplaceResponse;

/**
 * TOP API: taobao.picture.replace request
 * 
 * @author top auto create
 * @since 1.0, 2014.02.08
 */
public class PictureReplaceRequest extends BaseTaobaoRequest<PictureReplaceResponse> implements TaobaoUploadRequest<PictureReplaceResponse> {

	
	

	/** 
	* 图片二进制文件流,不能为空,允许png、jpg、gif图片格式
	 */
	private FileItem imageData;

	/** 
	* 要替换的图片的id，必须大于0
	 */
	private Long pictureId;

	public void setImageData(FileItem imageData) {
		this.imageData = imageData;
	}

	public FileItem getImageData() {
		return this.imageData;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public String getApiMethodName() {
		return "taobao.picture.replace";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("picture_id", this.pictureId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureReplaceResponse> getResponseClass() {
		return PictureReplaceResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(imageData, "imageData");
		RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image_data", this.imageData);
		return params;
	}
	
	

}