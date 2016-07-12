package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsOnlineSendResponse;

/**
 * TOP API: taobao.logistics.online.send request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class LogisticsOnlineSendRequest extends BaseTaobaoRequest<LogisticsOnlineSendResponse> {
	
	

	/** 
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。 如果为空，取的卖家的默认退货地址
	 */
	private Long cancelId;

	/** 
	* 物流公司代码.如"POST"就代表中国邮政,"ZJS"就代表宅急送.调用 taobao.logistics.companies.get 获取。
	 */
	private String companyCode;

	/** 
	* feature参数格式 范例: identCode=tid1:识别码1,识别码2|tid2:识别码3;machineCode=tid3:3C机器号A,3C机器号B identCode为识别码的KEY,machineCode为3C的KEY,多个key之间用”;”分隔 “tid1:识别码1,识别码2|tid2:识别码3”为identCode对应的value。 "|"不同商品间的分隔符。 例1商品和2商品，之间就用"|"分开。 TID就是商品代表的子订单号，对应taobao.trade.fullinfo.get 接口获得的oid字段。(通过OID可以唯一定位到当前商品上) ":"TID和具体传入参数间的分隔符。冒号前表示TID,之后代表该商品的参数属性。 "," 属性间分隔符。（对应商品数量，当存在一个商品的数量超过1个时，用逗号分开）。 具体:当订单中A商品的数量为2个，其中手机串号分别为"12345","67890"。 参数格式：identCode=TIDA:12345,67890。 TIDA对应了A宝贝，冒号后用逗号分隔的"12345","67890".说明本订单A宝贝的数量为2，值分别为"12345","67890"。 当存在"|"时，就说明订单中存在多个商品，商品间用"|"分隔了开来。|"之后的内容含义同上。
	 */
	private String feature;

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
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。如果为空，取的卖家的默认取货地址
	 */
	private Long senderId;

	/** 
	* 需要拆单发货的子订单集合，针对的是一笔交易下有多个子订单需要分开发货的场景；1次可传人多个子订单号，子订单间用逗号隔开；为空表示不做拆单发货。
	 */
	private String subTid;

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setCancelId(Long cancelId) {
		this.cancelId = cancelId;
	}

	public Long getCancelId() {
		return this.cancelId;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeature() {
		return this.feature;
	}

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

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getSenderId() {
		return this.senderId;
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
		return "taobao.logistics.online.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cancel_id", this.cancelId);
		txtParams.put("company_code", this.companyCode);
		txtParams.put("feature", this.feature);
		txtParams.put("is_split", this.isSplit);
		txtParams.put("out_sid", this.outSid);
		txtParams.put("seller_ip", this.sellerIp);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("sub_tid", this.subTid);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsOnlineSendResponse> getResponseClass() {
		return LogisticsOnlineSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(companyCode, "companyCode");
		RequestCheckUtils.checkMaxListSize(subTid, 20, "subTid");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}