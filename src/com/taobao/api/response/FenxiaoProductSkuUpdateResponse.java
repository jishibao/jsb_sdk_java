package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.sku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductSkuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7418192976361238367L;

	/** 
	 * 操作时间
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}
