package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.schema.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSchemaAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1861947641915832935L;

	/** 
	 * 返回商品发布结果
	 */
	@ApiField("add_item_result")
	private String addItemResult;

	/** 
	 * 发布商品操作成功时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;


	public void setAddItemResult(String addItemResult) {
		this.addItemResult = addItemResult;
	}
	public String getAddItemResult( ) {
		return this.addItemResult;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}
	


}
