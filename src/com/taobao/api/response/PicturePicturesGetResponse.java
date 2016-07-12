package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.pictures.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PicturePicturesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7887735342676994392L;

	/** 
	 * 图片空间图片数据对象
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;


	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<Picture> getPictures( ) {
		return this.pictures;
	}
	


}
