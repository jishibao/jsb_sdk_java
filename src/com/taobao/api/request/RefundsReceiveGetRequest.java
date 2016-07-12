package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RefundsReceiveGetResponse;

/**
 * TOP API: taobao.refunds.receive.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.22
 */
public class RefundsReceiveGetRequest extends BaseTaobaoRequest<RefundsReceiveGetResponse> {
	
	

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 查询修改时间结束。格式: yyyy-MM-dd HH:mm:ss
	 */
	private Date endModified;

	/** 
	* 需要返回的字段。目前支持有：refund_id, tid, title, buyer_nick, seller_nick, total_fee, status, created, refund_fee, oid, good_status, company_name, sid, payment, reason, desc, has_good_return, modified, order_status,refund_phase
	 */
	private String fields;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于零的整数; 默认值:40;最大值:100
	 */
	private Long pageSize;

	/** 
	* 查询修改时间开始。格式: yyyy-MM-dd HH:mm:ss
	 */
	private Date startModified;

	/** 
	* 退款状态，默认查询所有退款状态的数据，除了默认值外每次只能查询一种状态。WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
	 */
	private String status;

	/** 
	* 交易类型列表，一次查询多种类型可用半角逗号分隔，默认同时查询guarantee_trade, auto_delivery这两种类型的数据，<a href="http://open.taobao.com/doc/detail.htm?id=102855" target="_blank">查看可选值</a>
	 */
	private String type;

	/** 
	* 是否启用has_next的分页方式，如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，通过此种方式获取增量退款，接口调用成功率在原有的基础上有所提升。
	 */
	private Boolean useHasNext;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public Date getEndModified() {
		return this.endModified;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
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

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public Date getStartModified() {
		return this.startModified;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}

	public Boolean getUseHasNext() {
		return this.useHasNext;
	}

	public String getApiMethodName() {
		return "taobao.refunds.receive.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("end_modified", this.endModified);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
		txtParams.put("type", this.type);
		txtParams.put("use_has_next", this.useHasNext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundsReceiveGetResponse> getResponseClass() {
		return RefundsReceiveGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 100, "fields");
		RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
	}
	

}