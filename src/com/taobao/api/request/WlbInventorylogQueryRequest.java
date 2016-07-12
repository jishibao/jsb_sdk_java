package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbInventorylogQueryResponse;

/**
 * TOP API: taobao.wlb.inventorylog.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.19
 */
public class WlbInventorylogQueryRequest extends BaseTaobaoRequest<WlbInventorylogQueryResponse> {
	
	

	/** 
	* 结束修改时间,小于等于该时间
	 */
	private Date gmtEnd;

	/** 
	* 起始修改时间,大于等于该时间
	 */
	private Date gmtStart;

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 库存操作作类型(可以为空) CHU_KU 1-出库 RU_KU 2-入库 FREEZE 3-冻结 THAW 4-解冻 CHECK_FREEZE 5-冻结确认 CHANGE_KU 6-库存类型变更 若值不在范围内，则按CHU_KU处理
	 */
	private String opType;

	/** 
	* 可指定授权的用户来查询
	 */
	private Long opUserId;

	/** 
	* 单号
	 */
	private String orderCode;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数
	 */
	private Long pageSize;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}

	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOpType() {
		return this.opType;
	}

	public void setOpUserId(Long opUserId) {
		this.opUserId = opUserId;
	}

	public Long getOpUserId() {
		return this.opUserId;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
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

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.inventorylog.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gmt_end", this.gmtEnd);
		txtParams.put("gmt_start", this.gmtStart);
		txtParams.put("item_id", this.itemId);
		txtParams.put("op_type", this.opType);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbInventorylogQueryResponse> getResponseClass() {
		return WlbInventorylogQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}