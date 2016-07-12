package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.VasSubscSearchResponse;

/**
 * TOP API: taobao.vas.subsc.search request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.01
 */
public class VasSubscSearchRequest extends BaseTaobaoRequest<VasSubscSearchResponse> {
	
	

	/** 
	* 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码
	 */
	private String articleCode;

	/** 
	* 是否自动续费，true=自动续费 false=非自动续费 空=全部
	 */
	private Boolean autosub;

	/** 
	* 到期时间结束值
	 */
	private Date endDeadline;

	/** 
	* 是否到期提醒，true=到期提醒 false=非到期提醒 空=全部
	 */
	private Boolean expireNotice;

	/** 
	* 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码
	 */
	private String itemCode;

	/** 
	* 淘宝会员名
	 */
	private String nick;

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 一页包含的记录数
	 */
	private Long pageSize;

	/** 
	* 到期时间起始值（当start_deadline和end_deadline都不填写时，默认返回最近90天的数据）
	 */
	private Date startDeadline;

	/** 
	* 订购记录状态，1=有效 2=过期 空=全部
	 */
	private Long status;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleCode() {
		return this.articleCode;
	}

	public void setAutosub(Boolean autosub) {
		this.autosub = autosub;
	}

	public Boolean getAutosub() {
		return this.autosub;
	}

	public void setEndDeadline(Date endDeadline) {
		this.endDeadline = endDeadline;
	}

	public Date getEndDeadline() {
		return this.endDeadline;
	}

	public void setExpireNotice(Boolean expireNotice) {
		this.expireNotice = expireNotice;
	}

	public Boolean getExpireNotice() {
		return this.expireNotice;
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

	public void setStartDeadline(Date startDeadline) {
		this.startDeadline = startDeadline;
	}

	public Date getStartDeadline() {
		return this.startDeadline;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.vas.subsc.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
		txtParams.put("autosub", this.autosub);
		txtParams.put("end_deadline", this.endDeadline);
		txtParams.put("expire_notice", this.expireNotice);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_deadline", this.startDeadline);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<VasSubscSearchResponse> getResponseClass() {
		return VasSubscSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(articleCode, "articleCode");
		RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
	}
	

}