package com.taobao.api.request;

import com.taobao.api.domain.WlbWmsInventoryStatusUpload;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsInventoryStatusUploadResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.status.upload request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.12
 */
public class WlbWmsInventoryStatusUploadRequest extends BaseTaobaoRequest<WlbWmsInventoryStatusUploadResponse> {
	
	

	/** 
	* 库存状态调整
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsInventoryStatusUpload content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.inventory.status.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsInventoryStatusUploadResponse> getResponseClass() {
		return WlbWmsInventoryStatusUploadResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}