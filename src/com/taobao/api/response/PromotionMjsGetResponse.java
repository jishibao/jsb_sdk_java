package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PromotionMjs;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.mjs.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionMjsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1775981572239869774L;

	/** 
	 * 活动结束时间。
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 活动备注。可为空，100汉字以内。
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 满就送活动优惠列表。
	 */
	@ApiListField("mjs_list")
	@ApiField("promotion_mjs")
	private List<PromotionMjs> mjsList;

	/** 
	 * 满就送名称。
	 */
	@ApiField("mjs_name")
	private String mjsName;

	/** 
	 * 上不封顶标识！
	 */
	@ApiField("no_cap")
	private Boolean noCap;

	/** 
	 * 淘宝店铺或外店的名字。
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 活动开始时间。
	 */
	@ApiField("start_time")
	private String startTime;


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMjsList(List<PromotionMjs> mjsList) {
		this.mjsList = mjsList;
	}
	public List<PromotionMjs> getMjsList( ) {
		return this.mjsList;
	}

	public void setMjsName(String mjsName) {
		this.mjsName = mjsName;
	}
	public String getMjsName( ) {
		return this.mjsName;
	}

	public void setNoCap(Boolean noCap) {
		this.noCap = noCap;
	}
	public Boolean getNoCap( ) {
		return this.noCap;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}
	


}
