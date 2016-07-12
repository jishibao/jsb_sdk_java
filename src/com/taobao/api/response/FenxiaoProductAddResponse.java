package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4652962486945623829L;

	/** 
	 * 产品创建时间 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 产品ID
	 */
	@ApiField("pid")
	private Long pid;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid( ) {
		return this.pid;
	}
	


}
