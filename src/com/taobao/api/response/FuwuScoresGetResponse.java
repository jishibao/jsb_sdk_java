package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ScoreResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fuwu.scores.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FuwuScoresGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1719758251544611462L;

	/** 
	 * 评价流水记录
	 */
	@ApiListField("score_result")
	@ApiField("score_result")
	private List<ScoreResult> scoreResult;


	public void setScoreResult(List<ScoreResult> scoreResult) {
		this.scoreResult = scoreResult;
	}
	public List<ScoreResult> getScoreResult( ) {
		return this.scoreResult;
	}
	


}
