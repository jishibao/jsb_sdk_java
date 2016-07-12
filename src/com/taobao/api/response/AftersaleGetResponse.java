package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AfterSale;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.aftersale.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AftersaleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3297143277958139728L;

	/** 
	 * 售后服务返回对象
	 */
	@ApiListField("after_sales")
	@ApiField("after_sale")
	private List<AfterSale> afterSales;


	public void setAfterSales(List<AfterSale> afterSales) {
		this.afterSales = afterSales;
	}
	public List<AfterSale> getAfterSales( ) {
		return this.afterSales;
	}
	


}
