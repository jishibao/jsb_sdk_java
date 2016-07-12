package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.FenxiaoSku;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.skus.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductSkusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8374366822974491635L;

	/** 
	 * sku信息
	 */
	@ApiListField("skus")
	@ApiField("fenxiao_sku")
	private List<FenxiaoSku> skus;

	/** 
	 * 记录数量
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setSkus(List<FenxiaoSku> skus) {
		this.skus = skus;
	}
	public List<FenxiaoSku> getSkus( ) {
		return this.skus;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
