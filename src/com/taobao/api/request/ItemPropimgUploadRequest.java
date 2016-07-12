package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemPropimgUploadResponse;

/**
 * TOP API: taobao.item.propimg.upload request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.22
 */
public class ItemPropimgUploadRequest extends BaseTaobaoRequest<ItemPropimgUploadResponse> implements TaobaoUploadRequest<ItemPropimgUploadResponse> {

	
	

	/** 
	* 属性图片ID。如果是新增不需要填写
	 */
	private Long id;

	/** 
	* 属性图片内容。类型:JPG,GIF;图片大小不超过:3M
	 */
	private FileItem image;

	/** 
	* 商品数字ID，必选
	 */
	private Long numIid;

	/** 
	* 图片位置
	 */
	private Long position;

	/** 
	* 属性列表。调用taobao.itemprops.get获取类目属性，属性必须是颜色属性，再用taobao.itempropvalues.get取得vid。格式:pid:vid。
	 */
	private String properties;

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

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getApiMethodName() {
		return "taobao.item.propimg.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("position", this.position);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemPropimgUploadResponse> getResponseClass() {
		return ItemPropimgUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
		RequestCheckUtils.checkNotEmpty(properties, "properties");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}