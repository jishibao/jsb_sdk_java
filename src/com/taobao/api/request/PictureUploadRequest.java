package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureUploadResponse;

/**
 * TOP API: taobao.picture.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.30
 */
public class PictureUploadRequest extends BaseTaobaoRequest<PictureUploadResponse> implements TaobaoUploadRequest<PictureUploadResponse> {

	
	

	/** 
	* 图片上传的来源，有电脑版本宝贝发布，手机版本宝贝发布client:computer电脑版本宝贝使用，client:phone手机版本宝贝使用。注意：当client:phone时，图片限制为宽度在480-620之间，长度不能超过960，否则会报错。
	 */
	private String clientType;

	/** 
	* 包括后缀名的图片标题,不能为空，如Bule.jpg,有些卖家希望图片上传后取图片文件的默认名
	 */
	private String imageInputTitle;

	/** 
	* 图片二进制文件流,不能为空,允许png、jpg、gif图片格式,3M以内。
	 */
	private FileItem img;

	/** 
	* 是否获取https连接
	 */
	private Boolean isHttps;

	/** 
	* 图片分类ID，设置具体某个分类ID或设置0上传到默认分类，只能传入一个分类
	 */
	private Long pictureCategoryId;

	/** 
	* 如果此参数大于0，而且在后台能查到对应的图片，则此次上传为原图替换
	 */
	private Long pictureId;

	/** 
	* 图片标题,如果为空,传的图片标题就取去掉后缀名的image_input_title,超过50字符长度会截取50字符,重名会在标题末尾加"(1)";标题末尾已经有"(数字)"了，则数字加1
	 */
	private String title;

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setImageInputTitle(String imageInputTitle) {
		this.imageInputTitle = imageInputTitle;
	}

	public String getImageInputTitle() {
		return this.imageInputTitle;
	}

	public void setImg(FileItem img) {
		this.img = img;
	}

	public FileItem getImg() {
		return this.img;
	}

	public void setIsHttps(Boolean isHttps) {
		this.isHttps = isHttps;
	}

	public Boolean getIsHttps() {
		return this.isHttps;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.picture.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("client_type", this.clientType);
		txtParams.put("image_input_title", this.imageInputTitle);
		txtParams.put("is_https", this.isHttps);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("picture_id", this.pictureId);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureUploadResponse> getResponseClass() {
		return PictureUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(imageInputTitle, "imageInputTitle");
		RequestCheckUtils.checkNotEmpty(img, "img");
		RequestCheckUtils.checkNotEmpty(pictureCategoryId, "pictureCategoryId");
		RequestCheckUtils.checkMaxValue(pictureCategoryId, 9223372036854775807L, "pictureCategoryId");
		RequestCheckUtils.checkMinValue(pictureCategoryId, 0L, "pictureCategoryId");
		RequestCheckUtils.checkMaxValue(pictureId, 9223372036854775807L, "pictureId");
		RequestCheckUtils.checkMinValue(pictureId, 0L, "pictureId");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("img", this.img);
		return params;
	}
	
	

}