package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureCategoryUpdateResponse;

/**
 * TOP API: taobao.picture.category.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class PictureCategoryUpdateRequest extends BaseTaobaoRequest<PictureCategoryUpdateResponse> {
	
	

	/** 
	* 要更新的图片分类的id
	 */
	private Long categoryId;

	/** 
	* 图片分类的新名字，最大长度20字符，不能为空
	 */
	private String categoryName;

	/** 
	* 图片分类的新父分类id
	 */
	private Long parentId;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public String getApiMethodName() {
		return "taobao.picture.category.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("category_name", this.categoryName);
		txtParams.put("parent_id", this.parentId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureCategoryUpdateResponse> getResponseClass() {
		return PictureCategoryUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkMaxLength(categoryName, 20, "categoryName");
	}
	

}