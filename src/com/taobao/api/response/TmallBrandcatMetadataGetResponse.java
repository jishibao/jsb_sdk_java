package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.BrandCatMetaData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.brandcat.metadata.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallBrandcatMetadataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2885533691664244166L;

	/** 
	 * 类目、品牌下的达尔文元数据
	 */
	@ApiField("brand_cat_meta_data")
	private BrandCatMetaData brandCatMetaData;


	public void setBrandCatMetaData(BrandCatMetaData brandCatMetaData) {
		this.brandCatMetaData = brandCatMetaData;
	}
	public BrandCatMetaData getBrandCatMetaData( ) {
		return this.brandCatMetaData;
	}
	


}
