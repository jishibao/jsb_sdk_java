package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 物流宝订单，并且包含订单详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderDetail extends TaobaoObject {

	private static final long serialVersionUID = 5414313181239528282L;

	/**
	 * 如果是交易单，则显示交易中买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 是否已全部完成
	 */
	@ApiField("is_completed")
	private Boolean isCompleted;

	/**
	 * 订单最后一次修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 出库或者入库，IN表示入库，OUT表示出库
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 物流宝订单对应的商品详情
	 */
	@ApiListField("order_item_list")
	@ApiField("wlb_order_item")
	private List<WlbOrderItem> orderItemList;

	/**
	 * 订单来源:
产生物流订单的原因，比如:

订单来源:1:TAOBAO;2:EXT;3:ERP;4:WMS
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 对应创建物流宝订单top接口中的的out_biz_code字段，主要是用来去重用
	 */
	@ApiField("order_source_code")
	private String orderSourceCode;

	/**
	 * 物流状态，
订单已创建：0
订单已取消: -1
订单关闭:-3
下发中: 10
已下发: 11
接收方拒签 :-100
已发货:100
签收成功:200
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * (1)其它:    OTHER
(2)淘宝交易: TAOBAO
(3)301:调拨: ALLOCATION
(4)401:盘点:CHECK
(5)501:销售采购:PRUCHASE
	 */
	@ApiField("order_sub_type")
	private String orderSubType;

	/**
	 * 1:正常订单: NARMAL
2:退货订单: RETURN
3:换货订单: CHANGE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 订单备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 卖家ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 卖家NICK
	 */
	@ApiField("user_nick")
	private String userNick;


	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getIsCompleted() {
		return this.isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public List<WlbOrderItem> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<WlbOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderSourceCode() {
		return this.orderSourceCode;
	}
	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderSubType() {
		return this.orderSubType;
	}
	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
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
