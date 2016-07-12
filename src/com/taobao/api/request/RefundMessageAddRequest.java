package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RefundMessageAddResponse;

/**
 * TOP API: taobao.refund.message.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.25
 */
public class RefundMessageAddRequest extends BaseTaobaoRequest<RefundMessageAddResponse> implements TaobaoUploadRequest<RefundMessageAddResponse> {

	
	

	/** 
	* 留言内容。最大长度: 400个字节
	 */
	private String content;

	/** 
	* 图片（凭证）。类型: JPG,GIF,PNG;最大为: 500K
	 */
	private FileItem image;

	/** 
	* 退款编号。
	 */
	private Long refundId;

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public String getApiMethodName() {
		return "taobao.refund.message.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("refund_id", this.refundId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundMessageAddResponse> getResponseClass() {
		return RefundMessageAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(image, "image");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}