package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ItemImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.joint.img response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemJointImgResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8637831854747497192L;

	/** 
	 * 商品图片信息
	 */
	@ApiField("item_img")
	private ItemImg itemImg;


	public void setItemImg(ItemImg itemImg) {
		this.itemImg = itemImg;
	}
	public ItemImg getItemImg( ) {
		return this.itemImg;
	}
	


}
