package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallBrandcatPropinputGetResponse;

/**
 * TOP API: tmall.brandcat.propinput.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.06
 */
public class TmallBrandcatPropinputGetRequest extends BaseTaobaoRequest<TmallBrandcatPropinputGetResponse> {
	
	

	/** 
	* 品牌ID，如果类目没有品牌，指定null
	 */
	private Long brandId;

	/** 
	* 类目ID
	 */
	private Long cid;

	/** 
	* 属性ID，如果属性有子属性，请指定最后一级子属性ID，tmall.brandcat.propinput.get返回的即为的该属性ID对应的输入特征，对于有子属性模板的情况指定顶级属性ID即可
	 */
	private Long pid;

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return this.brandId;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return this.pid;
	}

	public String getApiMethodName() {
		return "tmall.brandcat.propinput.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("brand_id", this.brandId);
		txtParams.put("cid", this.cid);
		txtParams.put("pid", this.pid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallBrandcatPropinputGetResponse> getResponseClass() {
		return TmallBrandcatPropinputGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(brandId, "brandId");
		RequestCheckUtils.checkNotEmpty(cid, "cid");
		RequestCheckUtils.checkNotEmpty(pid, "pid");
	}
	

}