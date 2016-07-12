package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradesSoldIncrementvGetResponse;

/**
 * TOP API: taobao.trades.sold.incrementv.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.08
 */
public class TradesSoldIncrementvGetRequest extends BaseTaobaoRequest<TradesSoldIncrementvGetResponse> {
	
	

	/** 
	* 查询入库结束时间，必须大于入库开始时间(修改时间跨度不能大于一天)，格式:yyyy-MM-dd HH:mm:ss。<span style="color:red;font-weight: bold;">建议使用30分钟以内的时间跨度，能大大提高响应速度和成功率</span>。
	 */
	private Date endCreate;

	/** 
	* 可选值有ershou(二手市场的订单）,service（商城服务子订单）mark（双十一大促活动异常订单）作为扩展类型筛选只能做单个ext_type查询，不能全部查询所有的ext_type类型
	 */
	private String extType;

	/** 
	* 需要返回的字段列表，多个字段用半角逗号分隔，可选值为返回示例中能看到的所有字段。
	 */
	private String fields;

	/** 
	* 页码。取值范围:大于零的整数;默认值:1。<span style="color:red;font-weight: bold;">注：必须采用倒序的分页方式（从最后一页往回取）才能避免漏单问题。</span>
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围：1~100，默认值：40。<span style="color:red;font-weight: bold;">建议使用40~50，可以提高成功率，减少超时数量</span>。
	 */
	private Long pageSize;

	/** 
	* 查询入库开始时间(修改时间跨度不能大于一天)。格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date startCreate;

	/** 
	* 交易状态（<a href="http://open.taobao.com/doc/detail.htm?id=102856" target="_blank">查看可选值</a>），默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。
	 */
	private String status;

	/** 
	* 卖家对交易的自定义分组标签，目前可选值为：time_card（点卡软件代充），fee_card（话费软件代充）
	 */
	private String tag;

	/** 
	* 交易类型列表（<a href="http://open.taobao.com/doc/detail.htm?id=102855" target="_blank">查看可选值</a>），一次查询多种类型可用半角逗号分隔，默认同时查询guarantee_trade,auto_delivery,ec,cod,step这5种类型的数据。
	 */
	private String type;

	/** 
	* 是否启用has_next的分页方式，如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，<span style="color:red;font-weight: bold;">通过此种方式获取增量交易，效率在原有的基础上有80%的提升</span>。
	 */
	private Boolean useHasNext;

	public void setEndCreate(Date endCreate) {
		this.endCreate = endCreate;
	}

	public Date getEndCreate() {
		return this.endCreate;
	}

	public void setExtType(String extType) {
		this.extType = extType;
	}

	public String getExtType() {
		return this.extType;
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

	public void setStartCreate(Date startCreate) {
		this.startCreate = startCreate;
	}

	public Date getStartCreate() {
		return this.startCreate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
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
		return "taobao.trades.sold.incrementv.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_create", this.endCreate);
		txtParams.put("ext_type", this.extType);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_create", this.startCreate);
		txtParams.put("status", this.status);
		txtParams.put("tag", this.tag);
		txtParams.put("type", this.type);
		txtParams.put("use_has_next", this.useHasNext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradesSoldIncrementvGetResponse> getResponseClass() {
		return TradesSoldIncrementvGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endCreate, "endCreate");
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkNotEmpty(startCreate, "startCreate");
	}
	

}