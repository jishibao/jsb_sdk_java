package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 店铺信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Shop extends TaobaoObject {

	private static final long serialVersionUID = 3188725489281589132L;

	/**
	 * 总橱窗数量，对于C卖家返回总橱窗数，对于B卖家返回0（只有taobao.shop.remainshowcase.get可以返回）
	 */
	@ApiField("all_count")
	private Long allCount;

	/**
	 * 店铺公告
	 */
	@ApiField("bulletin")
	private String bulletin;

	/**
	 * 店铺所属的类目编号
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 开店时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 店铺描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 最后修改时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 店标地址。返回相对路径，可以用"http://logo.taobao.com/shop-logo"来拼接成绝对路径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 剩余橱窗数量，对于C卖家返回剩余橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 店铺动态评分信息
	 */
	@ApiField("shop_score")
	private ShopScore shopScore;

	/**
	 * 店铺编号
	 */
	@ApiField("sid")
	private Long sid;

	/**
	 * 店铺标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 已用的橱窗数量，对于C卖家返回已使用的橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
	 */
	@ApiField("used_count")
	private Long usedCount;


	public Long getAllCount() {
		return this.allCount;
	}
	public void setAllCount(Long allCount) {
		this.allCount = allCount;
	}

	public String getBulletin() {
		return this.bulletin;
	}
	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public ShopScore getShopScore() {
		return this.shopScore;
	}
	public void setShopScore(ShopScore shopScore) {
		this.shopScore = shopScore;
	}

	public Long getSid() {
		return this.sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
