package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 管控的品牌类目信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class BrandCatControl extends TaobaoObject {

	private static final long serialVersionUID = 5119411888868755612L;

	/**
	 * 被管控的品牌的ID号码
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 被管控的品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 被管控的类目的ID号
	 */
	@ApiField("cat_id")
	private Long catId;

	/**
	 * 被管控的类目的ID号
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * 以;隔开多个认证资料。:隔开资料ID与内容。如？1:产品包装图片;2:完整产品资质
	 */
	@ApiField("certified_data")
	private String certifiedData;


	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getCatId() {
		return this.catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCertifiedData() {
		return this.certifiedData;
	}
	public void setCertifiedData(String certifiedData) {
		this.certifiedData = certifiedData;
	}

}
