package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.ScItem;
import com.taobao.api.domain.QueryPagination;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1477746373998978676L;

	/** 
	 * 当前所在页数
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 返回商品列表的页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页
	 */
	@ApiField("query_pagination")
	private QueryPagination queryPagination;

	/** 
	 * List<ScItemDO>
	 */
	@ApiListField("sc_item_list")
	@ApiField("sc_item")
	private List<ScItem> scItemList;

	/** 
	 * 商品条数
	 */
	@ApiField("total_page")
	private Long totalPage;


	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setQueryPagination(QueryPagination queryPagination) {
		this.queryPagination = queryPagination;
	}
	public QueryPagination getQueryPagination( ) {
		return this.queryPagination;
	}

	public void setScItemList(List<ScItem> scItemList) {
		this.scItemList = scItemList;
	}
	public List<ScItem> getScItemList( ) {
		return this.scItemList;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}
	


}
