package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 类目属性度量衡相关数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemTaosirDO extends TaobaoObject {

	private static final long serialVersionUID = 3154854487329393481L;

	/**
	 * 表达式元素list
	 */
	@ApiListField("expr_el_list")
	@ApiField("item_tao_sir_el_d_o")
	private List<ItemTaoSirElDO> exprElList;

	/**
	 * 数值小数点精度
	 */
	@ApiField("precision")
	private Long precision;

	/**
	 * 卖家可选单位List<单位id，单位名>
	 */
	@ApiListField("std_unit_list")
	@ApiField("feature")
	private List<Feature> stdUnitList;

	/**
	 * 时间类型：0表示非时间，1表示时间点，2表示时间范围
	 */
	@ApiField("type")
	private Long type;


	public List<ItemTaoSirElDO> getExprElList() {
		return this.exprElList;
	}
	public void setExprElList(List<ItemTaoSirElDO> exprElList) {
		this.exprElList = exprElList;
	}

	public Long getPrecision() {
		return this.precision;
	}
	public void setPrecision(Long precision) {
		this.precision = precision;
	}

	public List<Feature> getStdUnitList() {
		return this.stdUnitList;
	}
	public void setStdUnitList(List<Feature> stdUnitList) {
		this.stdUnitList = stdUnitList;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
