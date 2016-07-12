package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ProductPropimgUploadResponse;

/**
 * TOP API: taobao.product.propimg.upload request
 * 
 * @author top auto create
 * @since 1.0, 2012.10.15
 */
public class ProductPropimgUploadRequest extends BaseTaobaoRequest<ProductPropimgUploadResponse> implements TaobaoUploadRequest<ProductPropimgUploadResponse> {

	
	

	/** 
	* 产品属性图片ID
	 */
	private Long id;

	/** 
	* 图片内容.图片最大为2M,只支持JPG,GIF.
	 */
	private FileItem image;

	/** 
	* 图片序号
	 */
	private Long position;

	/** 
	* 产品ID.Product的id
	 */
	private Long productId;

	/** 
	* 属性串.目前仅支持颜色属性.调用taobao.itemprops.get获取类目属性,取得颜色属性pid,再用taobao.itempropvalues.get取得vid;格式:pid:vid,只能传入一个颜色pid:vid串;
	 */
	private String props;

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

	public void setProps(String props) {
		this.props = props;
	}

	public String getProps() {
		return this.props;
	}

	public String getApiMethodName() {
		return "taobao.product.propimg.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("position", this.position);
		txtParams.put("product_id", this.productId);
		txtParams.put("props", this.props);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ProductPropimgUploadResponse> getResponseClass() {
		return ProductPropimgUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(image, "image");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(props, "props");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}