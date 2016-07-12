package com.taobao.api.request;

import com.taobao.api.domain.WlbWmsOrderStatusUpload;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsOrderStatusUploadResponse;

/**
 * TOP API: taobao.wlb.wms.order.status.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.19
 */
public class WlbWmsOrderStatusUploadRequest extends BaseTaobaoRequest<WlbWmsOrderStatusUploadResponse> {
	
	

	/** 
	* 订单状态回传请求数据
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsOrderStatusUpload content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.order.status.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsOrderStatusUploadResponse> getResponseClass() {
		return WlbWmsOrderStatusUploadResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}