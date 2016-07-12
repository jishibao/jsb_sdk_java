package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TranStoreResult;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.resource.transferstore.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsResourceTransferstoreGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4745419416384925341L;

	/** 
	 * 符合条件的中转仓列表
	 */
	@ApiListField("stores")
	@ApiField("tran_store_result")
	private List<TranStoreResult> stores;


	public void setStores(List<TranStoreResult> stores) {
		this.stores = stores;
	}
	public List<TranStoreResult> getStores( ) {
		return this.stores;
	}
	


}
