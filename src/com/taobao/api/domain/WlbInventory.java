package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 库存详情对象。其中包括货主ID，仓库编码，库存，库存类型等属性
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbInventory extends TaobaoObject {

	private static final long serialVersionUID = 1753763825226765345L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 冻结(锁定)数量，用来跟踪库存的中间状态，比如前台销售了1件商品，这时lock加1，当商品出库的时候lock再减回去
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * 库存占用数，两部分组成：
1.交易占用
买家付款后在仓库发货出库前会占用库存。
2.非交易出库占用
出库单创建仍未出库时会将库存占用
	 */
	@ApiField("occupy_quantity")
	private Long occupyQuantity;

	/**
	 * 可销库存数量(库存总数-拍下预扣数-占用数)
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 买家拍下但是没有付款的预扣数量，超过一定时间没有付款会自动释放。为防止超卖，这部分库存不可售，也暂不能出库。
	 */
	@ApiField("reserve_quantity")
	private Long reserveQuantity;

	/**
	 * 仓库编码，关联到仓库类型服务的编码非托管库存(卖家自己管理的库存，物流宝不可见又称自有库存)的所在仓库编码: STORE_SYS_PRIVATE
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * VENDIBLE--可销售库存
FREEZE--冻结库存
ONWAY--在途库存
DEFECT--残次品库存
	 */
	@ApiField("type")
	private String type;

	/**
	 * 货主ID
	 */
	@ApiField("user_id")
	private Long userId;


	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLockQuantity() {
		return this.lockQuantity;
	}
	public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
	}

	public Long getOccupyQuantity() {
		return this.occupyQuantity;
	}
	public void setOccupyQuantity(Long occupyQuantity) {
		this.occupyQuantity = occupyQuantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getReserveQuantity() {
		return this.reserveQuantity;
	}
	public void setReserveQuantity(Long reserveQuantity) {
		this.reserveQuantity = reserveQuantity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
