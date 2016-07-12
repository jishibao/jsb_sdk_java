package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsOrdersGetResponse;

/**
 * TOP API: taobao.logistics.orders.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.01.19
 */
public class LogisticsOrdersGetRequest extends BaseTaobaoRequest<LogisticsOrdersGetResponse> {
	
	

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 创建时间结束
	 */
	private Date endCreated;

	/** 
	* 需返回的字段列表.可选值:Shipping 物流数据结构中的以下字段: <br>
tid,order_code,seller_nick,buyer_nick,delivery_start, delivery_end,out_sid,item_title,receiver_name, created,modified,status,type,freight_payer,seller_confirm,company_name,sub_tids,is_spilt；<br>多个字段之间用","分隔。如tid,seller_nick,buyer_nick,delivery_start。
	 */
	private String fields;

	/** 
	* 谁承担运费.可选值:buyer(买家),seller(卖家).如:buyer
	 */
	private String freightPayer;

	/** 
	* 页码.该字段没传 或 值<1 ,则默认page_no为1
	 */
	private Long pageNo;

	/** 
	* 每页条数.该字段没传 或 值<1 ,则默认page_size为40
	 */
	private Long pageSize;

	/** 
	* 收货人姓名
	 */
	private String receiverName;

	/** 
	* 卖家是否发货.可选值:yes(是),no(否).如:yes
	 */
	private String sellerConfirm;

	/** 
	* 创建时间开始
	 */
	private Date startCreated;

	/** 
	* 物流状态.查看数据结构 Shipping 中的status字段.
	 */
	private String status;

	/** 
	* 交易ID.如果加入tid参数的话,不用传其他的参数,若传入tid：非拆单场景，仅会返回一条物流订单信息；拆单场景，会返回多条物流订单信息
	 */
	private Long tid;

	/** 
	* 物流方式.可选值:post(平邮),express(快递),ems(EMS).如:post
	 */
	private String type;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public String getFreightPayer() {
		return this.freightPayer;
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

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getSellerConfirm() {
		return this.sellerConfirm;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public Date getStartCreated() {
		return this.startCreated;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.logistics.orders.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("freight_payer", this.freightPayer);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("seller_confirm", this.sellerConfirm);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("tid", this.tid);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsOrdersGetResponse> getResponseClass() {
		return LogisticsOrdersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
	}
	

}