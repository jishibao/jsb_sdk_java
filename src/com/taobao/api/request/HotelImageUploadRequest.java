package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.HotelImageUploadResponse;

/**
 * TOP API: taobao.hotel.image.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class HotelImageUploadRequest extends BaseTaobaoRequest<HotelImageUploadResponse> implements TaobaoUploadRequest<HotelImageUploadResponse> {

	
	

	/** 
	* 酒店id
	 */
	private Long hid;

	/** 
	* 上传的图片
	 */
	private FileItem pic;

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}

	public FileItem getPic() {
		return this.pic;
	}

	public String getApiMethodName() {
		return "taobao.hotel.image.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("hid", this.hid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<HotelImageUploadResponse> getResponseClass() {
		return HotelImageUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(hid, "hid");
		RequestCheckUtils.checkNotEmpty(pic, "pic");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", this.pic);
		return params;
	}
	
	

}