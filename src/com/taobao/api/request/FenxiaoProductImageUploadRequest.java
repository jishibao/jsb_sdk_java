package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductImageUploadResponse;

/**
 * TOP API: taobao.fenxiao.product.image.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class FenxiaoProductImageUploadRequest extends BaseTaobaoRequest<FenxiaoProductImageUploadResponse> implements TaobaoUploadRequest<FenxiaoProductImageUploadResponse> {

	
	

	/** 
	* 产品图片
	 */
	private FileItem image;

	/** 
	* 产品主图图片空间相对路径或绝对路径
	 */
	private String picPath;

	/** 
	* 图片位置，0-14之间。0：操作sku属性图片，1：主图，2-5：细节图，6-14：额外主图
	 */
	private Long position;

	/** 
	* 产品ID
	 */
	private Long productId;

	/** 
	* properties表示sku图片的属性。key:value形式，key是pid，value是vid。如果position是0的话，则properties需要是必传项
	 */
	private String properties;

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getPosition() {
		return this.position;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.image.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("pic_path", this.picPath);
		txtParams.put("position", this.position);
		txtParams.put("product_id", this.productId);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductImageUploadResponse> getResponseClass() {
		return FenxiaoProductImageUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(position, "position");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}