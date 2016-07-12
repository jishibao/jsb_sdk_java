package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.MaQrcodeUploadResponse;

/**
 * TOP API: taobao.ma.qrcode.upload request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.18
 */
public class MaQrcodeUploadRequest extends BaseTaobaoRequest<MaQrcodeUploadResponse> implements TaobaoUploadRequest<MaQrcodeUploadResponse> {

	
	

	/** 
	* 二维码的图片后辍,目前只支持png,jpg,jpeg,gif四种
	 */
	private String ext;

	/** 
	* 图片名
	 */
	private String imageName;

	/** 
	* 0000
	 */
	private FileItem imge;

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImge(FileItem imge) {
		this.imge = imge;
	}

	public FileItem getImge() {
		return this.imge;
	}

	public String getApiMethodName() {
		return "taobao.ma.qrcode.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ext", this.ext);
		txtParams.put("image_name", this.imageName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<MaQrcodeUploadResponse> getResponseClass() {
		return MaQrcodeUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(ext, "ext");
		RequestCheckUtils.checkMaxLength(ext, 5, "ext");
		RequestCheckUtils.checkNotEmpty(imageName, "imageName");
		RequestCheckUtils.checkNotEmpty(imge, "imge");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("imge", this.imge);
		return params;
	}
	
	

}