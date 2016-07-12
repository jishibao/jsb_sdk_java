package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbImportsOrderGetResponse;

/**
 * TOP API: taobao.wlb.imports.order.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.16
 */
public class WlbImportsOrderGetRequest extends BaseTaobaoRequest<WlbImportsOrderGetResponse> {
	
	

	/** 
	* 交易订单结束创建时间
	 */
	private Date gmtCreateEnd;

	/** 
	* 交易订单开始创建时间
	 */
	private Date gmtCreateStart;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于0小于等于100的整数; 默认值:40; 最小值：1；最大值:20
	 */
	private Long pageSize;

	/** 
	* 物流订单状态编码。以下依（物流订单状态编码，描述）的形式列举出来：(TIN_CONSING,发货中),(SENT_WAIT_COMPANY_MAKE_SURE,待仓库收货),(ORDER_CANCELED,订单关闭),(COMPANY_MAKE_SURE,海外仓已揽收),(REJECTED_RECEIVED_BY_COMPANY,海外仓拒收),(ORDER_REFUNDING,退货中),(ORDER_REFUND_BY_COMPANY,订单已退货),(EXCEPTION_IN_COMPANY,海外仓内异常),(FAILED_PAID_SHIPPING_FEE,支付失败),(PAID_SHIPPING_FEE,待仓库发货),(COMPANY_CONSIGN_CONFIRM,海外仓已发货),(WAIT_CUSTOMS_MAKE_SURE,清关已收货),(EXCEPTION_IN_CUSTOMS,清关异常),(CUSTOMSING,清关中),(COMPANY_DELIVERY,国内配送)。
	 */
	private String statusCode;

	/** 
	* 交易订单号
	 */
	private Long tradeId;

	public void setGmtCreateEnd(Date gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
	}

	public Date getGmtCreateEnd() {
		return this.gmtCreateEnd;
	}

	public void setGmtCreateStart(Date gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
	}

	public Date getGmtCreateStart() {
		return this.gmtCreateStart;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public Long getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.imports.order.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gmt_create_end", this.gmtCreateEnd);
		txtParams.put("gmt_create_start", this.gmtCreateStart);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("status_code", this.statusCode);
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbImportsOrderGetResponse> getResponseClass() {
		return WlbImportsOrderGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}