package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.VasOrderSearchResponse;

/**
 * TOP API: taobao.vas.order.search request
 * 
 * @author top auto create
 * @since 1.0, 2015.06.18
 */
public class VasOrderSearchRequest extends BaseTaobaoRequest<VasOrderSearchResponse> {
	
	

	/** 
	* 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码
	 */
	private String articleCode;

	/** 
	* 订单号
	 */
	private Long bizOrderId;

	/** 
	* 订单类型，1=新订 2=续订 3=升级 4=后台赠送 5=后台自动续订 6=订单审核后生成订购关系（暂时用不到） 空=全部
	 */
	private Long bizType;

	/** 
	* 订单创建时间（订购时间）结束值
	 */
	private Date endCreated;

	/** 
	* 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码
	 */
	private String itemCode;

	/** 
	* 淘宝会员名
	 */
	private String nick;

	/** 
	* 子订单号
	 */
	private Long orderId;

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 一页包含的记录数
	 */
	private Long pageSize;

	/** 
	* 订单创建时间（订购时间）起始值（当start_created和end_created都不填写时，默认返回最近90天的数据）
	 */
	private Date startCreated;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleCode() {
		return this.articleCode;
	}

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
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

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public Date getStartCreated() {
		return this.startCreated;
	}

	public String getApiMethodName() {
		return "taobao.vas.order.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("nick", this.nick);
		txtParams.put("order_id", this.orderId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_created", this.startCreated);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<VasOrderSearchResponse> getResponseClass() {
		return VasOrderSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(articleCode, "articleCode");
		RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
	}
	

}