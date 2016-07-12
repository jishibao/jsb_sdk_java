package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 查询物流商电子面单产品类型入参
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillProductTypeRequest extends TaobaoObject {

	private static final long serialVersionUID = 3383154124633187842L;

	/**
	 * 物流商编码CODE
	 */
	@ApiField("cp_code")
	private String cpCode;


	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

}
