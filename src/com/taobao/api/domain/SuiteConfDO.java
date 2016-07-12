package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 套装配置
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SuiteConfDO extends TaobaoObject {

	private static final long serialVersionUID = 1631555756362841728L;

	/**
	 * 如果有值，套装子规格形如：A*n,B*n,C*n....，n只能是inputs中的
	 */
	@ApiListField("inputs")
	@ApiField("number")
	private List<Long> inputs;

	/**
	 * 套装，子规格限制数，当前一级类目，最多允许选择多少个产品规格，为空表示无限制。套装子规格形如:A*n,B*n,C*n....,max_size就是C的最大个数
	 */
	@ApiField("max_size")
	private Long maxSize;

	/**
	 * 套装，子规格数量总和限制，当前一级类目，所以子产品规格的数量不能超过这个值，为空表示无限制,套装子规格形如：A*n,B*n,C*n....,max_total_number就是所有n和的最大限制
	 */
	@ApiField("max_total_number")
	private Long maxTotalNumber;

	/**
	 * 一级类目ID，标识在该一级在类目下能布套装
	 */
	@ApiField("root_cat_id")
	private Long rootCatId;

	/**
	 * 套装类目ID，当前一级类目，如果发布跨叶子类目的的套装，默认放到那个类目。如果没有值表示root_cat_id类目下发布的套装产品，不支持跨类目
	 */
	@ApiField("suite_cat_id")
	private Long suiteCatId;


	public List<Long> getInputs() {
		return this.inputs;
	}
	public void setInputs(List<Long> inputs) {
		this.inputs = inputs;
	}

	public Long getMaxSize() {
		return this.maxSize;
	}
	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
	}

	public Long getMaxTotalNumber() {
		return this.maxTotalNumber;
	}
	public void setMaxTotalNumber(Long maxTotalNumber) {
		this.maxTotalNumber = maxTotalNumber;
	}

	public Long getRootCatId() {
		return this.rootCatId;
	}
	public void setRootCatId(Long rootCatId) {
		this.rootCatId = rootCatId;
	}

	public Long getSuiteCatId() {
		return this.suiteCatId;
	}
	public void setSuiteCatId(Long suiteCatId) {
		this.suiteCatId = suiteCatId;
	}

}
