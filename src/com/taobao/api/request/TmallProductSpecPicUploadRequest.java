package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSpecPicUploadResponse;

/**
 * TOP API: tmall.product.spec.pic.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.12
 */
public class TmallProductSpecPicUploadRequest extends BaseTaobaoRequest<TmallProductSpecPicUploadResponse> implements TaobaoUploadRequest<TmallProductSpecPicUploadResponse> {

	
	

	/** 
	* 上传的认证图片文件
	 */
	private FileItem certifyPic;

	/** 
	* 上传的认证图片的认证类型<br>
1：代表产品包装正面图<br>
2：代表完整产品资质<br>
3：代表产品包装反面图<br>
4：代表产品包装侧面图<br>
5：代表产品包装条形码特写<br>
6：代表特殊用途化妆品批准文号<br>
7：代表3C认证图标<br>
	 */
	private Long certifyType;

	public void setCertifyPic(FileItem certifyPic) {
		this.certifyPic = certifyPic;
	}

	public FileItem getCertifyPic() {
		return this.certifyPic;
	}

	public void setCertifyType(Long certifyType) {
		this.certifyType = certifyType;
	}

	public Long getCertifyType() {
		return this.certifyType;
	}

	public String getApiMethodName() {
		return "tmall.product.spec.pic.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("certify_type", this.certifyType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSpecPicUploadResponse> getResponseClass() {
		return TmallProductSpecPicUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(certifyPic, "certifyPic");
		RequestCheckUtils.checkNotEmpty(certifyType, "certifyType");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("certify_pic", this.certifyPic);
		return params;
	}
	
	

}