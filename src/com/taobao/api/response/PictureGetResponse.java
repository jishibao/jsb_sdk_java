package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3161999492395599112L;

	/** 
	 * 图片信息列表
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/** 
	 * 总的结果数
	 */
	@ApiField("totalResults")
	private Long totalResults;


	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<Picture> getPictures( ) {
		return this.pictures;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
