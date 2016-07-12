package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 度量衡表达式DO数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemTaoSirElDO extends TaobaoObject {

	private static final long serialVersionUID = 5461279641673876556L;

	/**
	 * 是否输入框
	 */
	@ApiField("is_input")
	private Boolean isInput;

	/**
	 * 是否文本元素，用于显示也用于组装value_name，比如：操作符
	 */
	@ApiField("is_label")
	private Boolean isLabel;

	/**
	 * 是否只用于显示的文本元素
	 */
	@ApiField("is_show_label")
	private Boolean isShowLabel;

	/**
	 * 显示文本
	 */
	@ApiField("text")
	private String text;

	/**
	 * 0 - 类型为label元素，只用于展示，不用于组装value_name；
1 - 类型为label元素，用于展示，用于组装value_name；
2 - 类型为输入狂元素，主要用于卖家输入数据. 卖家填写完后需要重新设置该元素的文本数据；
	 */
	@ApiField("type")
	private Long type;


	public Boolean getIsInput() {
		return this.isInput;
	}
	public void setIsInput(Boolean isInput) {
		this.isInput = isInput;
	}

	public Boolean getIsLabel() {
		return this.isLabel;
	}
	public void setIsLabel(Boolean isLabel) {
		this.isLabel = isLabel;
	}

	public Boolean getIsShowLabel() {
		return this.isShowLabel;
	}
	public void setIsShowLabel(Boolean isShowLabel) {
		this.isShowLabel = isShowLabel;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
