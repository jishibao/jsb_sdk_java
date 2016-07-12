package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RefundRefuseResponse;

/**
 * TOP API: taobao.refund.refuse request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.19
 */
public class RefundRefuseRequest extends BaseTaobaoRequest<RefundRefuseResponse> implements TaobaoUploadRequest<RefundRefuseResponse> {

	
	

	/** 
	* 退款记录对应的交易子订单号
	 */
	private Long oid;

	/** 
	* 退款单号
	 */
	private Long refundId;

	/** 
	* 可选值为：售中：onsale，售后：aftersale，天猫退款为必填项。
	 */
	private String refundPhase;

	/** 
	* 退款版本号，天猫退款为必填项。
	 */
	private Long refundVersion;

	/** 
	* 拒绝退款时的说明信息，长度2-200
	 */
	private String refuseMessage;

	/** 
	* 拒绝退款时的退款凭证，一般是卖家拒绝退款时使用的发货凭证，最大长度130000字节，支持的图片格式：GIF, JPG, PNG。天猫退款为必填项。
	 */
	private FileItem refuseProof;

	/** 
	* 拒绝原因编号，会提供用户拒绝原因列表供选择
	 */
	private Long refuseReasonId;

	/** 
	* 退款记录对应的交易订单号
	 */
	private Long tid;

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundPhase(String refundPhase) {
		this.refundPhase = refundPhase;
	}

	public String getRefundPhase() {
		return this.refundPhase;
	}

	public void setRefundVersion(Long refundVersion) {
		this.refundVersion = refundVersion;
	}

	public Long getRefundVersion() {
		return this.refundVersion;
	}

	public void setRefuseMessage(String refuseMessage) {
		this.refuseMessage = refuseMessage;
	}

	public String getRefuseMessage() {
		return this.refuseMessage;
	}

	public void setRefuseProof(FileItem refuseProof) {
		this.refuseProof = refuseProof;
	}

	public FileItem getRefuseProof() {
		return this.refuseProof;
	}

	public void setRefuseReasonId(Long refuseReasonId) {
		this.refuseReasonId = refuseReasonId;
	}

	public Long getRefuseReasonId() {
		return this.refuseReasonId;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.refund.refuse";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("oid", this.oid);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		txtParams.put("refund_version", this.refundVersion);
		txtParams.put("refuse_message", this.refuseMessage);
		txtParams.put("refuse_reason_id", this.refuseReasonId);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundRefuseResponse> getResponseClass() {
		return RefundRefuseResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refuseMessage, "refuseMessage");
		RequestCheckUtils.checkMaxLength(refuseMessage, 200, "refuseMessage");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("refuse_proof", this.refuseProof);
		return params;
	}
	
	

}