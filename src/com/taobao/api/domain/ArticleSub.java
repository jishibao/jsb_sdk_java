package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 应用订购信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ArticleSub extends TaobaoObject {

	private static final long serialVersionUID = 2419671493348478724L;

	/**
	 * 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * 应用名称
	 */
	@ApiField("article_name")
	private String articleName;

	/**
	 * 是否自动续费
	 */
	@ApiField("autosub")
	private Boolean autosub;

	/**
	 * 订购关系到期时间
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * 是否到期提醒
	 */
	@ApiField("expire_notice")
	private Boolean expireNotice;

	/**
	 * 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 收费项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 淘宝会员名
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 状态，1=有效 2=过期
	 */
	@ApiField("status")
	private Long status;


	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleName() {
		return this.articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Boolean getAutosub() {
		return this.autosub;
	}
	public void setAutosub(Boolean autosub) {
		this.autosub = autosub;
	}

	public Date getDeadline() {
		return this.deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Boolean getExpireNotice() {
		return this.expireNotice;
	}
	public void setExpireNotice(Boolean expireNotice) {
		this.expireNotice = expireNotice;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
