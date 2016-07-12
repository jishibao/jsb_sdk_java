package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.GradeDiscount;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductGradepriceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2554521745497361573L;

	/** 
	 * 等级折扣列表
	 */
	@ApiListField("grade_discounts")
	@ApiField("grade_discount")
	private List<GradeDiscount> gradeDiscounts;

	/** 
	 * 操作是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setGradeDiscounts(List<GradeDiscount> gradeDiscounts) {
		this.gradeDiscounts = gradeDiscounts;
	}
	public List<GradeDiscount> getGradeDiscounts( ) {
		return this.gradeDiscounts;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
