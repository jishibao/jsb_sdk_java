package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TraderatesGetResponse;

/**
 * TOP API: taobao.traderates.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.10
 */
public class TraderatesGetRequest extends BaseTaobaoRequest<TraderatesGetResponse> {
	
	

	/** 
	* 评价结束时间。如果只输入结束时间，那么全部返回所有评价数据。
	 */
	private Date endDate;

	/** 
	* 需返回的字段列表。可选值：TradeRate 结构中的所有字段，多个字段之间用“,”分隔
	 */
	private String fields;

	/** 
	* 商品的数字ID
	 */
	private Long numIid;

	/** 
	* 页码。取值范围:大于零的整数最大限制为200; 默认值:1
	 */
	private Long pageNo;

	/** 
	* 每页获取条数。默认值40，最小值1，最大值150。
	 */
	private Long pageSize;

	/** 
	* 评价对方昵称
	 */
	private String peerNick;

	/** 
	* 评价类型。可选值:get(得到),give(给出)
	 */
	private String rateType;

	/** 
	* 评价结果。可选值:good(好评),neutral(中评),bad(差评)
	 */
	private String result;

	/** 
	* 评价者角色即评价的发起方。可选值:seller(卖家),buyer(买家)。 当 give buyer 以买家身份给卖家的评价； 当 get seller 以买家身份得到卖家给的评价； 当 give seller 以卖家身份给买家的评价； 当 get buyer 以卖家身份得到买家给的评价。
	 */
	private String role;

	/** 
	* 评价开始时。如果只输入开始时间，那么能返回开始时间之后的评价数据。
	 */
	private Date startDate;

	/** 
	* 交易订单id，可以是父订单id号，也可以是子订单id号
	 */
	private Long tid;

	/** 
	* 是否启用has_next的分页方式，如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，通过此种方式获取评价信息，效率在原有的基础上有80%的提升。
	 */
	private Boolean useHasNext;

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

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
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

	public void setPeerNick(String peerNick) {
		this.peerNick = peerNick;
	}

	public String getPeerNick() {
		return this.peerNick;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getRateType() {
		return this.rateType;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}

	public Boolean getUseHasNext() {
		return this.useHasNext;
	}

	public String getApiMethodName() {
		return "taobao.traderates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("fields", this.fields);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("peer_nick", this.peerNick);
		txtParams.put("rate_type", this.rateType);
		txtParams.put("result", this.result);
		txtParams.put("role", this.role);
		txtParams.put("start_date", this.startDate);
		txtParams.put("tid", this.tid);
		txtParams.put("use_has_next", this.useHasNext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TraderatesGetResponse> getResponseClass() {
		return TraderatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkMaxValue(pageSize, 150L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkMaxLength(peerNick, 32, "peerNick");
		RequestCheckUtils.checkNotEmpty(rateType, "rateType");
		RequestCheckUtils.checkNotEmpty(role, "role");
	}
	

}