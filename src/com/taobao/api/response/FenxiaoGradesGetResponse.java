package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.FenxiaoGrade;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.grades.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoGradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1126847773446194625L;

	/** 
	 * 分销商等级信息
	 */
	@ApiListField("fenxiao_grades")
	@ApiField("fenxiao_grade")
	private List<FenxiaoGrade> fenxiaoGrades;


	public void setFenxiaoGrades(List<FenxiaoGrade> fenxiaoGrades) {
		this.fenxiaoGrades = fenxiaoGrades;
	}
	public List<FenxiaoGrade> getFenxiaoGrades( ) {
		return this.fenxiaoGrades;
	}
	


}
