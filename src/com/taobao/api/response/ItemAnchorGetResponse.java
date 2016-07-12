package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.IdsModule;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.anchor.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemAnchorGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2523718646468389327L;

	/** 
	 * 宝贝描述规范化可使用打标模块的锚点信息
	 */
	@ApiListField("anchor_modules")
	@ApiField("ids_module")
	private List<IdsModule> anchorModules;

	/** 
	 * 返回的宝贝描述模板结果数目
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setAnchorModules(List<IdsModule> anchorModules) {
		this.anchorModules = anchorModules;
	}
	public List<IdsModule> getAnchorModules( ) {
		return this.anchorModules;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
