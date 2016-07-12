package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 包裹信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillPackageinfolist extends TaobaoObject {

	private static final long serialVersionUID = 1298112124795629668L;

	/**
	 * 包裹信息
	 */
	@ApiField("package_info")
	private CainiaoStockOutBillPackageinfo packageInfo;


	public CainiaoStockOutBillPackageinfo getPackageInfo() {
		return this.packageInfo;
	}
	public void setPackageInfo(CainiaoStockOutBillPackageinfo packageInfo) {
		this.packageInfo = packageInfo;
	}

}
