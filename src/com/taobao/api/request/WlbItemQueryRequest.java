package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemQueryResponse;

/**
 * TOP API: taobao.wlb.item.query request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.04
 */
public class WlbItemQueryRequest extends BaseTaobaoRequest<WlbItemQueryResponse> {
	
	

	/** 
	* 是否是最小库存单元，只有最小库存单元的商品才可以有库存,值只能给"true","false"来表示;
若值不在范围内，则按true处理
	 */
	private String isSku;

	/** 
	* 商家编码
	 */
	private String itemCode;

	/** 
	* ITEM类型(只允许输入以下英文或空)
NORMAL  0:普通商品; 
COMBINE  1:是否是组合商品 
DISTRIBUTION  2:是否是分销商品(货主是别人)
若值不在范围内，则按NORMAL处理
	 */
	private String itemType;

	/** 
	* 商品名称
	 */
	private String name;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	private Long pageSize;

	/** 
	* 父ID,只有is_sku=1时才能有父ID，商品也可以没有付商品
	 */
	private Long parentId;

	/** 
	* 只能输入以下值或空：
ITEM_STATUS_VALID -- 1 表示 有效；
ITEM_STATUS_LOCK  -- 2 表示锁住。
若值不在范围内，按ITEM_STATUS_VALID处理
	 */
	private String status;

	/** 
	* 商品前台销售名字
	 */
	private String title;

	public void setIsSku(String isSku) {
		this.isSku = isSku;
	}

	public String getIsSku() {
		return this.isSku;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
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

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_sku", this.isSku);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("item_type", this.itemType);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("status", this.status);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemQueryResponse> getResponseClass() {
		return WlbItemQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(itemCode, 64, "itemCode");
		RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
		RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkMaxLength(title, 255, "title");
	}
	

}