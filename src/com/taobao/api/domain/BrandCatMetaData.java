package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 类目、品牌下的达尔文元数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class BrandCatMetaData extends TaobaoObject {

	private static final long serialVersionUID = 7866885699769719712L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 叶子类目id
	 */
	@ApiField("cat_id")
	private Long catId;

	/**
	 * 以;隔开多个认证资料。:隔开资料ID与内容。如？1:产品包装图片;2:完整产品资质
	 */
	@ApiField("certified_data")
	private String certifiedData;

	/**
	 * 类目、品牌是否切入达尔文
	 */
	@ApiField("is_darwin")
	private Boolean isDarwin;


	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getCatId() {
		return this.catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCertifiedData() {
		return this.certifiedData;
	}
	public void setCertifiedData(String certifiedData) {
		this.certifiedData = certifiedData;
	}

	public Boolean getIsDarwin() {
		return this.isDarwin;
	}
	public void setIsDarwin(Boolean isDarwin) {
		this.isDarwin = isDarwin;
	}

}
