package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PicturePicturesCountResponse;

/**
 * TOP API: taobao.picture.pictures.count request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.13
 */
public class PicturePicturesCountRequest extends BaseTaobaoRequest<PicturePicturesCountResponse> {
	
	

	/** 
	* 图片使用，如果是pc宝贝detail使用，设置为client:computer，查询出来的图片是符合pc的宝贝detail显示的如果是手机宝贝detail使用，设置为client:phone，查询出来的图片是符合手机的宝贝detail显示的,默认值是全部
	 */
	private String clientType;

	/** 
	* 是否删除,undeleted代表没有删除,deleted表示删除
	 */
	private String deleted;

	/** 
	* 查询上传结束时间点,格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date endDate;

	/** 
	* 图片分类
	 */
	private Long pictureCategoryId;

	/** 
	* 图片ID
	 */
	private Long pictureId;

	/** 
	* 查询上传开始时间点,格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date startDate;

	/** 
	* 图片被修改的时间点，格式:yyyy-MM-dd HH:mm:ss。查询此修改时间点之后到目前的图片。
	 */
	private Date startModifiedDate;

	/** 
	* 文件名
	 */
	private String title;

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartModifiedDate(Date startModifiedDate) {
		this.startModifiedDate = startModifiedDate;
	}

	public Date getStartModifiedDate() {
		return this.startModifiedDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.picture.pictures.count";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("client_type", this.clientType);
		txtParams.put("deleted", this.deleted);
		txtParams.put("end_date", this.endDate);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("picture_id", this.pictureId);
		txtParams.put("start_date", this.startDate);
		txtParams.put("start_modified_date", this.startModifiedDate);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PicturePicturesCountResponse> getResponseClass() {
		return PicturePicturesCountResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}