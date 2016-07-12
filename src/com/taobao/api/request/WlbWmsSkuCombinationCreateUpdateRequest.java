package com.taobao.api.request;

import java.util.List;
import com.taobao.api.domain.Destitemlistwlbwmsskucombinationcreateupdate;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsSkuCombinationCreateUpdateResponse;

/**
 * TOP API: taobao.wlb.wms.sku.combination.create.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.17
 */
public class WlbWmsSkuCombinationCreateUpdateRequest extends BaseTaobaoRequest<WlbWmsSkuCombinationCreateUpdateResponse> {
	
	

	/** 
	* 组合子商品列表
	 */
	private String destItem;

	/** 
	* 需要创建组合关系的商品外部系统ID
	 */
	private String itemId;

	/** 
	* 货主编码
	 */
	private String ownerUserId;

	/** 
	* 组成组合商品比例
	 */
	private String proportion;

	public void setDestItem(String destItem) {
		this.destItem = destItem;
	}

	public void setDestItem(List<Destitemlistwlbwmsskucombinationcreateupdate> destItem) {
		this.destItem = new JSONWriter(false,true).write(destItem);
	}

	public String getDestItem() {
		return this.destItem;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

	public String getProportion() {
		return this.proportion;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.sku.combination.create.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dest_item", this.destItem);
		txtParams.put("item_id", this.itemId);
		txtParams.put("owner_user_id", this.ownerUserId);
		txtParams.put("proportion", this.proportion);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsSkuCombinationCreateUpdateResponse> getResponseClass() {
		return WlbWmsSkuCombinationCreateUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(destItem, 20, "destItem");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(ownerUserId, "ownerUserId");
		RequestCheckUtils.checkNotEmpty(proportion, "proportion");
		RequestCheckUtils.checkMaxListSize(proportion, 20, "proportion");
	}
	

}