package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 用户信用
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UserCredit extends TaobaoObject {

	private static final long serialVersionUID = 2633329533568245894L;

	/**
	 * 收到的好评总条数。取值范围:大于零的整数
	 */
	@ApiField("good_num")
	private Long goodNum;

	/**
	 * 信用等级（是根据score生成的），信用等级：淘宝会员在淘宝网上的信用度，分为20个级别，级别如：level = 1 时，表示一心；level = 2 时，表示二心
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 信用总分（“好评”加一分，“中评”不加分，“差评”扣一分。分越高，等级越高）
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 收到的评价总条数。取值范围:大于零的整数
	 */
	@ApiField("total_num")
	private Long totalNum;


	public Long getGoodNum() {
		return this.goodNum;
	}
	public void setGoodNum(Long goodNum) {
		this.goodNum = goodNum;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

}
