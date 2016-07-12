package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 搭配套餐类。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Meal extends TaobaoObject {

	private static final long serialVersionUID = 6815674329339597745L;

	/**
	 * 搭配套餐商品列表。item_id为商品的id;item_show_name为商品显示名。因最多允许5个商品进行搭配，所以查询最多有5个，以json格式传出。
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 套餐id。
	 */
	@ApiField("meal_id")
	private Long mealId;

	/**
	 * 搭配套餐描述！
	 */
	@ApiField("meal_memo")
	private String mealMemo;

	/**
	 * 搭配套餐名称。
	 */
	@ApiField("meal_name")
	private String mealName;

	/**
	 * 套餐一口价(单位是：分)
	 */
	@ApiField("meal_price")
	private String mealPrice;

	/**
	 * 普通运费模板id。若这个字段为空或0时，运费是卖家负责;若这个字段不为空，说明运费模板存在，运费是买家负责。
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 套餐状态。有效：VALID;失效：INVALID(有效套餐为可使用的套餐,无效套餐为套餐中有商品下架或库存为0时)。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 运费模板类型。卖家标识'SELL';买家标识'BUY'。若为'SELL'则字段postage_id为空。若为'BUY'，则postage_id为运费模板id，必有值。
	 */
	@ApiField("type_postage")
	private String typePostage;


	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public Long getMealId() {
		return this.mealId;
	}
	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public String getMealMemo() {
		return this.mealMemo;
	}
	public void setMealMemo(String mealMemo) {
		this.mealMemo = mealMemo;
	}

	public String getMealName() {
		return this.mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealPrice() {
		return this.mealPrice;
	}
	public void setMealPrice(String mealPrice) {
		this.mealPrice = mealPrice;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTypePostage() {
		return this.typePostage;
	}
	public void setTypePostage(String typePostage) {
		this.typePostage = typePostage;
	}

}
