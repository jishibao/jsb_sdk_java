package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsCainiaoBillQueryResponse;

/**
 * TOP API: taobao.wlb.wms.cainiao.bill.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.03
 */
public class WlbWmsCainiaoBillQueryRequest extends BaseTaobaoRequest<WlbWmsCainiaoBillQueryResponse> {
	
	

	/** 
	* 起始时间，此字段检索订单最后修改时间， 格式 yyyy-MM-dd HH:mm:ss。
	 */
	private Date endModifiedTime;

	/** 
	* 订单类型 201 销售出库 501 退货入库 502 换货出库 503 补发出库904 普通入库 903 普通出库单 306 B2B入库单 305 B2B出库单 601 采购入库 901 退供出库单 701 盘点出库 702 盘点入库 711 库存异动单
	 */
	private String orderType;

	/** 
	* 页码。（大于0的整数。默认为1）
	 */
	private Long pageNo;

	/** 
	* 每页条数。（每页条数不超过50条。默认为50）
	 */
	private Long pageSize;

	/** 
	* 结束时间，此字段检索订单最后修改时间， 格式 yyyy-MM-dd HH:mm:ss。
	 */
	private Date startModifiedTime;

	public void setEndModifiedTime(Date endModifiedTime) {
		this.endModifiedTime = endModifiedTime;
	}

	public Date getEndModifiedTime() {
		return this.endModifiedTime;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
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

	public void setStartModifiedTime(Date startModifiedTime) {
		this.startModifiedTime = startModifiedTime;
	}

	public Date getStartModifiedTime() {
		return this.startModifiedTime;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.cainiao.bill.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified_time", this.endModifiedTime);
		txtParams.put("order_type", this.orderType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified_time", this.startModifiedTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsCainiaoBillQueryResponse> getResponseClass() {
		return WlbWmsCainiaoBillQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endModifiedTime, "endModifiedTime");
		RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkNotEmpty(startModifiedTime, "startModifiedTime");
	}
	

}