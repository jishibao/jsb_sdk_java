package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemImgUploadResponse;

/**
 * TOP API: taobao.item.img.upload request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.22
 */
public class ItemImgUploadRequest extends BaseTaobaoRequest<ItemImgUploadResponse> implements TaobaoUploadRequest<ItemImgUploadResponse> {

	
	

	/** 
	* 商品图片id(如果是更新图片，则需要传该参数)
	 */
	private Long id;

	/** 
	* 商品图片内容类型:JPG,GIF;最大:3M 。支持的文件类型：gif,jpg,jpeg,png
	 */
	private FileItem image;

	/** 
	* 是否将该图片设为主图,可选值:true,false;默认值:false(非主图)
	 */
	private Boolean isMajor;

	/** 
	* 商品数字ID，该参数必须
	 */
	private Long numIid;

	/** 
	* 图片序号
	 */
	private Long position;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setIsMajor(Boolean isMajor) {
		this.isMajor = isMajor;
	}

	public Boolean getIsMajor() {
		return this.isMajor;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getPosition() {
		return this.position;
	}

	public String getApiMethodName() {
		return "taobao.item.img.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("is_major", this.isMajor);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("position", this.position);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemImgUploadResponse> getResponseClass() {
		return ItemImgUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}