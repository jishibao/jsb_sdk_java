package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cntms.mailno.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCntmsMailnoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4881222851745714798L;

	/** 
	 * 揽货商（分拨中心）编码
	 */
	@ApiField("allocator_code")
	private String allocatorCode;

	/** 
	 * 揽货商（分拨中心）名称
	 */
	@ApiField("allocator_name")
	private String allocatorName;

	/** 
	 * 物流商公司编码
（ERP在调用菜鸟发货接口时此字段赋值到tms_code, 调用淘宝“自己联系物流（线下物流）发货”时，做为company_code传入）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/** 
	 * 物流商名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/** 
	 * 面单号
	 */
	@ApiField("mailno")
	private String mailno;

	/** 
	 * 集包地代码
	 */
	@ApiField("package_center_code")
	private String packageCenterCode;

	/** 
	 * 集包地名称
	 */
	@ApiField("package_center_name")
	private String packageCenterName;

	/** 
	 * 二级流向信息
	 */
	@ApiField("sec_distribution")
	private String secDistribution;

	/** 
	 * 一级流向信息，大头笔
	 */
	@ApiField("short_address")
	private String shortAddress;

	/** 
	 * 二级配送公司编码
	 */
	@ApiField("tms_code")
	private String tmsCode;

	/** 
	 * 二级配送公司名称
	 */
	@ApiField("tms_name")
	private String tmsName;


	public void setAllocatorCode(String allocatorCode) {
		this.allocatorCode = allocatorCode;
	}
	public String getAllocatorCode( ) {
		return this.allocatorCode;
	}

	public void setAllocatorName(String allocatorName) {
		this.allocatorName = allocatorName;
	}
	public String getAllocatorName( ) {
		return this.allocatorName;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	public String getLogisticsCode( ) {
		return this.logisticsCode;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}
	public String getLogisticsName( ) {
		return this.logisticsName;
	}

	public void setMailno(String mailno) {
		this.mailno = mailno;
	}
	public String getMailno( ) {
		return this.mailno;
	}

	public void setPackageCenterCode(String packageCenterCode) {
		this.packageCenterCode = packageCenterCode;
	}
	public String getPackageCenterCode( ) {
		return this.packageCenterCode;
	}

	public void setPackageCenterName(String packageCenterName) {
		this.packageCenterName = packageCenterName;
	}
	public String getPackageCenterName( ) {
		return this.packageCenterName;
	}

	public void setSecDistribution(String secDistribution) {
		this.secDistribution = secDistribution;
	}
	public String getSecDistribution( ) {
		return this.secDistribution;
	}

	public void setShortAddress(String shortAddress) {
		this.shortAddress = shortAddress;
	}
	public String getShortAddress( ) {
		return this.shortAddress;
	}

	public void setTmsCode(String tmsCode) {
		this.tmsCode = tmsCode;
	}
	public String getTmsCode( ) {
		return this.tmsCode;
	}

	public void setTmsName(String tmsName) {
		this.tmsName = tmsName;
	}
	public String getTmsName( ) {
		return this.tmsName;
	}
	


}
