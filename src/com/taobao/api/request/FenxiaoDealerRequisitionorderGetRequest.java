package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDealerRequisitionorderGetResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.15
 */
public class FenxiaoDealerRequisitionorderGetRequest extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderGetResponse> {
	
	

	/** 
	* 采购申请/经销采购单最迟修改时间。与start_date字段的最大时间间隔不能超过30天
	 */
	private Date endDate;

	/** 
	* 多个字段用","分隔。 fields 如果为空：返回所有采购申请/经销采购单对象(dealer_orders)字段。 如果不为空：返回指定采购单对象(dealer_orders)字段。 例1： dealer_order_details.product_id 表示只返回product_id 例2： dealer_order_details 表示只返回明细列表
	 */
	private String fields;

	/** 
	* 查询者自己在所要查询的采购申请/经销采购单中的身份。
1：供应商。
2：分销商。
注：填写其他值当做错误处理。
	 */
	private Long identity;

	/** 
	* 采购申请/经销采购单状态。
0：全部状态。
1：分销商提交申请，待供应商审核。
2：供应商驳回申请，待分销商确认。
3：供应商修改后，待分销商确认。
4：分销商拒绝修改，待供应商再审核。
5：审核通过下单成功，待分销商付款。
7：付款成功，待供应商发货。
8：供应商发货，待分销商收货。
9：分销商收货，交易成功。
10：采购申请/经销采购单关闭。

注：无值按默认值0计，超出状态范围返回错误信息。
	 */
	private Long orderStatus;

	/** 
	* 页码（大于0的整数。无值或小于1的值按默认值1计）
	 */
	private Long pageNo;

	/** 
	* 每页条数（大于0但小于等于50的整数。无值或大于50或小于1的值按默认值50计）
	 */
	private Long pageSize;

	/** 
	* 采购申请/经销采购单最早修改时间
	 */
	private Date startDate;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setIdentity(Long identity) {
		this.identity = identity;
	}

	public Long getIdentity() {
		return this.identity;
	}

	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
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

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.dealer.requisitionorder.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("fields", this.fields);
		txtParams.put("identity", this.identity);
		txtParams.put("order_status", this.orderStatus);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDealerRequisitionorderGetResponse> getResponseClass() {
		return FenxiaoDealerRequisitionorderGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(identity, "identity");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}