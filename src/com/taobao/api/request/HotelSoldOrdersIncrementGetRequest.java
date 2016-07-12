package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.HotelSoldOrdersIncrementGetResponse;

/**
 * TOP API: taobao.hotel.sold.orders.increment.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.02
 */
public class HotelSoldOrdersIncrementGetRequest extends BaseTaobaoRequest<HotelSoldOrdersIncrementGetResponse> {
	
	

	/** 
	* 查询修改结束时间，必须大于修改开始时间（修改时间跨度不能大于1天）。格式：yyyy-MM-dd HH:mm:ss。
	 */
	private Date endModified;

	/** 
	* 是否需要返回该订单的入住人列表。可选值：true，false。
	 */
	private Boolean needGuest;

	/** 
	* 是否返回买家留言，可选值true、false
	 */
	private Boolean needMessage;

	/** 
	* 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。
	 */
	private Long pageNo;

	/** 
	* 页面大小，取值范围1-100，默认大小20。
	 */
	private Long pageSize;

	/** 
	* 查询修改开始时间（修改时间跨度不能大于1天）。格式：yyyy-MM-dd HH:mm:ss
	 */
	private Date startModified;

	/** 
	* 交易状态，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。可选值：A：等待买家付款。B：买家已付款待卖家发货。C：卖家已发货待买家确认。D：交易成功。E：交易关闭
	 */
	private String status;

	/** 
	* 是否使用has_next的分页方式，如果指定true，则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的字段，效率比总记录数高
	 */
	private Boolean useHasNext;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public Date getEndModified() {
		return this.endModified;
	}

	public void setNeedGuest(Boolean needGuest) {
		this.needGuest = needGuest;
	}

	public Boolean getNeedGuest() {
		return this.needGuest;
	}

	public void setNeedMessage(Boolean needMessage) {
		this.needMessage = needMessage;
	}

	public Boolean getNeedMessage() {
		return this.needMessage;
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

	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}

	public Boolean getUseHasNext() {
		return this.useHasNext;
	}

	public String getApiMethodName() {
		return "taobao.hotel.sold.orders.increment.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("need_guest", this.needGuest);
		txtParams.put("need_message", this.needMessage);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
		txtParams.put("use_has_next", this.useHasNext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<HotelSoldOrdersIncrementGetResponse> getResponseClass() {
		return HotelSoldOrdersIncrementGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endModified, "endModified");
		RequestCheckUtils.checkNotEmpty(startModified, "startModified");
		RequestCheckUtils.checkMaxLength(status, 1, "status");
	}
	

}