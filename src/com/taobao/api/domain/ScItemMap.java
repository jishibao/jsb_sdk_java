package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 后端商品映射关系对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ScItemMap extends TaobaoObject {

	private static final long serialVersionUID = 2794127164174769841L;

	/**
	 * map_type=1时，item_id为IC商品id

map_type=7时，item_id为分销商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 1:前台和后台关系
7:分销和后台关系
	 */
	@ApiField("map_type")
	private Long mapType;

	/**
	 * 后端商品ID
	 */
	@ApiField("rel_item_id")
	private Long relItemId;

	/**
	 * 后端商品所有者商家编码
	 */
	@ApiField("rel_outer_code")
	private String relOuterCode;

	/**
	 * 后端商品所有者id
	 */
	@ApiField("rel_user_id")
	private Long relUserId;

	/**
	 * 后端商品所有者名称
	 */
	@ApiField("rel_user_nick")
	private String relUserNick;

	/**
	 * 当宝贝下没SKU时该字段为空
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * Ic商家id(分销商id)
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * Ic商家nick(分销商nick)
	 */
	@ApiField("user_nick")
	private String userNick;


	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getMapType() {
		return this.mapType;
	}
	public void setMapType(Long mapType) {
		this.mapType = mapType;
	}

	public Long getRelItemId() {
		return this.relItemId;
	}
	public void setRelItemId(Long relItemId) {
		this.relItemId = relItemId;
	}

	public String getRelOuterCode() {
		return this.relOuterCode;
	}
	public void setRelOuterCode(String relOuterCode) {
		this.relOuterCode = relOuterCode;
	}

	public Long getRelUserId() {
		return this.relUserId;
	}
	public void setRelUserId(Long relUserId) {
		this.relUserId = relUserId;
	}

	public String getRelUserNick() {
		return this.relUserNick;
	}
	public void setRelUserNick(String relUserNick) {
		this.relUserNick = relUserNick;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
