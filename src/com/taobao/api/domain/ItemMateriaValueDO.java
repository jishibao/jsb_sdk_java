package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 类目材质DO数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemMateriaValueDO extends TaobaoObject {

	private static final long serialVersionUID = 6267898849174543228L;

	/**
	 * 材质值名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当前材质值，是否需要填写含量值。比如：棉 是需要填写含量值，而牛皮 是不需要填写含量值的
	 */
	@ApiField("need_content_number")
	private Boolean needContentNumber;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNeedContentNumber() {
		return this.needContentNumber;
	}
	public void setNeedContentNumber(Boolean needContentNumber) {
		this.needContentNumber = needContentNumber;
	}

}
