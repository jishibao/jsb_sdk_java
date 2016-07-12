package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemImgDeleteResponse;

/**
 * TOP API: taobao.item.img.delete request
 * 
 * @author top auto create
 * @since 1.0, 2015.05.08
 */
public class ItemImgDeleteRequest extends BaseTaobaoRequest<ItemImgDeleteResponse> {
	
	

	/** 
	* 商品图片ID
	 */
	private Long id;

	/** 
	* 标记是否要删除第6张图，因为第6张图与普通商品图片不是存储在同一个位置的无图片ID，所以要通过一个标记来判断是否为第6张图，目前第6张图业务主要用在女装业务下
	 */
	private Boolean isSixthPic;

	/** 
	* 商品数字ID
	 */
	private Long numIid;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setIsSixthPic(Boolean isSixthPic) {
		this.isSixthPic = isSixthPic;
	}

	public Boolean getIsSixthPic() {
		return this.isSixthPic;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.img.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("is_sixth_pic", this.isSixthPic);
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemImgDeleteResponse> getResponseClass() {
		return ItemImgDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkMinValue(id, 1L, "id");
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 1L, "numIid");
	}
	

}