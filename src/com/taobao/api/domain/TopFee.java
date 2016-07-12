package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 运费模板中运费信息对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TopFee extends TaobaoObject {

	private static final long serialVersionUID = 1663579396655572392L;

	/**
	 * 增费：输入0.00-999.99（最多包含两位小数） 不能为空不输入运费时必须输入0
	 */
	@ApiField("add_fee")
	private String addFee;

	/**
	 * 增费标准：当valuation(记价方式)为0时输入1-9999范围内的整数
	 */
	@ApiField("add_standard")
	private String addStandard;

	/**
	 * 邮费子项涉及的地区,多个地区用逗号连接数量串;可以用taobao.areas.get接口获取.或者参考:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm 例 (110000,310000,320000,330000).就代表邮费子项涉 及(北京,上海,江苏,浙江)四个地区.填写时要注意对照地区代码值,如果填入错误地区代码,将会出现错误信息.
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 可选值：post:平邮; cod:货到付款; ems:EMS; express:快递公司
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 首费：输入0.01-999.99（最多包含两位小数） 不能为空也不能为0
	 */
	@ApiField("start_fee")
	private String startFee;

	/**
	 * 首费标准：当valuation(记价方式)为0时输入1-9999范围内的整数
	 */
	@ApiField("start_standard")
	private String startStandard;


	public String getAddFee() {
		return this.addFee;
	}
	public void setAddFee(String addFee) {
		this.addFee = addFee;
	}

	public String getAddStandard() {
		return this.addStandard;
	}
	public void setAddStandard(String addStandard) {
		this.addStandard = addStandard;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStartFee() {
		return this.startFee;
	}
	public void setStartFee(String startFee) {
		this.startFee = startFee;
	}

	public String getStartStandard() {
		return this.startStandard;
	}
	public void setStartStandard(String startStandard) {
		this.startStandard = startStandard;
	}

}
