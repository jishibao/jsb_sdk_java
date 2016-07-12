package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsOnlineConfirmResponse;

/**
 * TOP API: taobao.logistics.online.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class LogisticsOnlineConfirmRequest extends BaseTaobaoRequest<LogisticsOnlineConfirmResponse> {
	
	

	/** 
	* 表明是否是拆单，默认值0，1表示拆单
	 */
	private Long isSplit;

	/** 
	* 运单号.具体一个物流公司的真实运单号码。淘宝官方物流会校验，请谨慎传入；
	 */
	private String outSid;

	/** 
	* 商家的IP地址
	 */
	private String sellerIp;

	/** 
	* 拆单子订单列表，对应的数据是：子订单号的列表。可以不传，但是如果传了则必须符合传递的规则。子订单必须是操作的物流订单的子订单的真子集
	 */
	private String subTid;

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setIsSplit(Long isSplit) {
		this.isSplit = isSplit;
	}

	public Long getIsSplit() {
		return this.isSplit;
	}

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}

	public String getOutSid() {
		return this.outSid;
	}

	public void setSellerIp(String sellerIp) {
		this.sellerIp = sellerIp;
	}

	public String getSellerIp() {
		return this.sellerIp;
	}

	public void setSubTid(String subTid) {
		this.subTid = subTid;
	}

	public String getSubTid() {
		return this.subTid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.logistics.online.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_split", this.isSplit);
		txtParams.put("out_sid", this.outSid);
		txtParams.put("seller_ip", this.sellerIp);
		txtParams.put("sub_tid", this.subTid);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsOnlineConfirmResponse> getResponseClass() {
		return LogisticsOnlineConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outSid, "outSid");
		RequestCheckUtils.checkMaxListSize(subTid, 20, "subTid");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}