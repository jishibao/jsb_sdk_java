package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商品描述模块化信息，包含类目级别的模块信息以及用户自定义模块约束等其他信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ModularDescInfo extends TaobaoObject {

	private static final long serialVersionUID = 1285773391842858536L;

	/**
	 * 旧描述与新描述共存时间（切换时间）。
	 */
	@ApiField("dead_line")
	private String deadLine;

	/**
	 * 运营定义的该商品所属类目的类目级别模块信息列表，列表顺序即为模块顺序。
	 */
	@ApiListField("itm_dsc_modules")
	@ApiField("item_desc_module")
	private List<ItemDescModule> itmDscModules;

	/**
	 * 默认值为false，如果此字段为true，则卖家上传的模块化的描述信息可以自定义排序。
	 */
	@ApiField("user_order")
	private Boolean userOrder;

	/**
	 * 用户自定义模块数量最大值限制。类目级别模块+用户级别模块必须小于<20
	 */
	@ApiField("usr_def_max_num")
	private Long usrDefMaxNum;


	public String getDeadLine() {
		return this.deadLine;
	}
	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public List<ItemDescModule> getItmDscModules() {
		return this.itmDscModules;
	}
	public void setItmDscModules(List<ItemDescModule> itmDscModules) {
		this.itmDscModules = itmDscModules;
	}

	public Boolean getUserOrder() {
		return this.userOrder;
	}
	public void setUserOrder(Boolean userOrder) {
		this.userOrder = userOrder;
	}

	public Long getUsrDefMaxNum() {
		return this.usrDefMaxNum;
	}
	public void setUsrDefMaxNum(Long usrDefMaxNum) {
		this.usrDefMaxNum = usrDefMaxNum;
	}

}
