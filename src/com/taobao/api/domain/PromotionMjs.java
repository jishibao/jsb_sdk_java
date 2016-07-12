package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 营销工具满就送
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionMjs extends TaobaoObject {

	private static final long serialVersionUID = 4455226725452453337L;

	/**
	 * 不免邮省份的area_id列表。用';'间隔。最多10个。[110000:"北京";
120000:"天津";
130000:"河北";
140000:"山西";
150000:"内蒙古";
210000:"辽宁";
220000:"吉林";
230000:"黑龙江";
310000:"上海";
320000:"江苏";
330000:"浙江";
340000:"安徽";
350000:"福建";
360000:"江西";
370000:"山东";
410000:"河南";
420000:"湖北";
430000:"湖南";
440000:"广东";
450000:"广西";
460000:"海南";
500000:"重庆";
510000:"四川";
520000:"贵州";
530000:"云南";
540000:"西藏";
610000:"陕西";
620000:"甘肃";
630000:"青海";
640000:"宁夏";
650000:"新疆";
710000:"台湾";
810000:"香港";
820000:"澳门";
990000:"海外"]
	 */
	@ApiField("area_ids")
	private String areaIds;

	/**
	 * 送优惠卷。优惠卷的有效期时间。
	 */
	@ApiField("coupon_time")
	private Date couponTime;

	/**
	 * 送优惠卷面额。分为[3,5,10,20,50,100]面值。
	 */
	@ApiField("coupon_value")
	private Long couponValue;

	/**
	 * 是否免邮！
	 */
	@ApiField("free_post")
	private Boolean freePost;

	/**
	 * 满就送的满多少钱。正整数。
	 */
	@ApiField("full_money")
	private Long fullMoney;

	/**
	 * 最长15个汉字。
	 */
	@ApiField("gift_name")
	private String giftName;

	/**
	 * 礼品的url地址。礼品链接必须是以http://或https://开头的淘宝站内链接。正则表达式:"^http[s]{0,1}://([a-z0-9\\-_]+\\.)*(mall\\.)?(taobao|taobaocdn)\\.(com|net|cn|com\\.cn)(/.*)*$"
	 */
	@ApiField("gift_url")
	private String giftUrl;

	/**
	 * 满就送积分。
	 */
	@ApiField("points")
	private Long points;

	/**
	 * true时，减后满full_money才免邮费。false时，减前满full_money就免邮。
	 */
	@ApiField("reduce_after")
	private Boolean reduceAfter;

	/**
	 * 满就送减掉的钱数。当满足full_money时，就减掉的钱数。这个钱数是小于full_money的正整数。
	 */
	@ApiField("reduce_money")
	private Long reduceMoney;


	public String getAreaIds() {
		return this.areaIds;
	}
	public void setAreaIds(String areaIds) {
		this.areaIds = areaIds;
	}

	public Date getCouponTime() {
		return this.couponTime;
	}
	public void setCouponTime(Date couponTime) {
		this.couponTime = couponTime;
	}

	public Long getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(Long couponValue) {
		this.couponValue = couponValue;
	}

	public Boolean getFreePost() {
		return this.freePost;
	}
	public void setFreePost(Boolean freePost) {
		this.freePost = freePost;
	}

	public Long getFullMoney() {
		return this.fullMoney;
	}
	public void setFullMoney(Long fullMoney) {
		this.fullMoney = fullMoney;
	}

	public String getGiftName() {
		return this.giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getGiftUrl() {
		return this.giftUrl;
	}
	public void setGiftUrl(String giftUrl) {
		this.giftUrl = giftUrl;
	}

	public Long getPoints() {
		return this.points;
	}
	public void setPoints(Long points) {
		this.points = points;
	}

	public Boolean getReduceAfter() {
		return this.reduceAfter;
	}
	public void setReduceAfter(Boolean reduceAfter) {
		this.reduceAfter = reduceAfter;
	}

	public Long getReduceMoney() {
		return this.reduceMoney;
	}
	public void setReduceMoney(Long reduceMoney) {
		this.reduceMoney = reduceMoney;
	}

}
