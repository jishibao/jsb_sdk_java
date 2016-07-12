package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoGradeUpdateResponse;

/**
 * TOP API: taobao.fenxiao.grade.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoGradeUpdateRequest extends BaseTaobaoRequest<FenxiaoGradeUpdateResponse> {
	
	

	/** 
	* 等级ID
	 */
	private Long gradeId;

	/** 
	* 等级名称，等级名称不可重复
	 */
	private String name;

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getGradeId() {
		return this.gradeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.grade.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("grade_id", this.gradeId);
		txtParams.put("name", this.name);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoGradeUpdateResponse> getResponseClass() {
		return FenxiaoGradeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(gradeId, "gradeId");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 20, "name");
	}
	

}