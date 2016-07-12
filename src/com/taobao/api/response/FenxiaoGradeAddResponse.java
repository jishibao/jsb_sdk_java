package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.grade.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoGradeAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1242512765199373347L;

	/** 
	 * 等级ID
	 */
	@ApiField("grade_id")
	private Long gradeId;

	/** 
	 * 操作是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	public Long getGradeId( ) {
		return this.gradeId;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
