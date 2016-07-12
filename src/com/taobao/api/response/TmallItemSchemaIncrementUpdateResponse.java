package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.schema.increment.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSchemaIncrementUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4845717241812663328L;

	/** 
	 * 商品更新操作成功时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 返回商品发布结果
	 */
	@ApiField("update_item_result")
	private String updateItemResult;


	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setUpdateItemResult(String updateItemResult) {
		this.updateItemResult = updateItemResult;
	}
	public String getUpdateItemResult( ) {
		return this.updateItemResult;
	}
	


}
