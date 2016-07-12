package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4498536355943987322L;

	/** 
	 * 更新商品数量,1表示成功更新了一条数据，0：表示未找到匹配的数据
	 */
	@ApiField("update_rows")
	private Long updateRows;


	public void setUpdateRows(Long updateRows) {
		this.updateRows = updateRows;
	}
	public Long getUpdateRows( ) {
		return this.updateRows;
	}
	


}
