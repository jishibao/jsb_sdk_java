package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 运费模板对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryTemplate extends TaobaoObject {

	private static final long serialVersionUID = 4615821325744481734L;

	/**
	 * 运费模板上设置的发货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 可选值：0,1,2,3<br>,说明如下<br>
1)买家承担运费的模版<br>
0：买家承担服务费<br>
1: 卖家承担服务费<br>
2)卖家承担运费的模版<br>
2:卖家承担运费的模版（集市），卖家承担服务费<br>
3:卖家承担运费的模版（天猫），卖家承担服务费<br>
	 */
	@ApiField("assumer")
	private Long assumer;

	/**
	 * 该模板上设置的卖家发货地址区域ID，如：address为浙江省杭州市西湖去文三路XX号那么这个consign_area_id的值就是西湖区的ID
	 */
	@ApiField("consign_area_id")
	private Long consignAreaId;

	/**
	 * 模板创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 运费模板中运费详细信息对象，包含默认运费和指定地区运费
	 */
	@ApiListField("fee_list")
	@ApiField("top_fee")
	private List<TopFee> feeList;

	/**
	 * 模板修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 模板名称，长度不能超过25个字节
	 */
	@ApiField("name")
	private String name;

	/**
	 * 物流服务模板支持增值服务列表，多个用分号隔开。cod:货到付款 mops：刷卡付款
	 */
	@ApiField("supports")
	private String supports;

	/**
	 * 模块ID
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 是否商超模版
	 */
	@ApiField("template_type")
	private Long templateType;

	/**
	 * 可选值：0
说明：
0:表示按宝贝件数计算运费
<br/><br/>
1:表示按宝贝重量计算运费
<br/><br/>
3:表示按宝贝体积计算运费
	 */
	@ApiField("valuation")
	private Long valuation;


	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAssumer() {
		return this.assumer;
	}
	public void setAssumer(Long assumer) {
		this.assumer = assumer;
	}

	public Long getConsignAreaId() {
		return this.consignAreaId;
	}
	public void setConsignAreaId(Long consignAreaId) {
		this.consignAreaId = consignAreaId;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public List<TopFee> getFeeList() {
		return this.feeList;
	}
	public void setFeeList(List<TopFee> feeList) {
		this.feeList = feeList;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSupports() {
		return this.supports;
	}
	public void setSupports(String supports) {
		this.supports = supports;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(Long templateType) {
		this.templateType = templateType;
	}

	public Long getValuation() {
		return this.valuation;
	}
	public void setValuation(Long valuation) {
		this.valuation = valuation;
	}

}
