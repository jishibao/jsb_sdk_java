package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 查询分页结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class QueryPagination extends TaobaoObject {

	private static final long serialVersionUID = 4646538145391727572L;

	/**
	 * 当前页码数
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	@ApiField("page_size")
	private Long pageSize;


	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
