package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8218785991321275465L;

	/** 
	 * 更新时间，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/** 
	 * 产品ID
	 */
	@ApiField("pid")
	private Long pid;


	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getModified( ) {
		return this.modified;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid( ) {
		return this.pid;
	}
	


}
