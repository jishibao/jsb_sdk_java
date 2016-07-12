package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DeliveryTemplateAddResponse;

/**
 * TOP API: taobao.delivery.template.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class DeliveryTemplateAddRequest extends BaseTaobaoRequest<DeliveryTemplateAddResponse> {
	
	

	/** 
	* 可选值：0、1 ，说明如下<br>0:表示买家承担服务费;<br>1:表示卖家承担服务费
	 */
	private Long assumer;

	/** 
	* 卖家发货地址区域ID
<br/><br/><font color=blue>可以不填，如果没有填写取卖家默认发货地址的区域ID，如果需要输入必须用taobao.areas.get接口获取.或者参考：http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm 
</font>

<br/><br/><font color=red>注意：填入该值时必须取您的发货地址最小区域级别ID，比如您的发货地址是：某省XX市xx区（县）时需要填入区(县)的ID，当然有些地方没有区或县可以直接填市级别的ID</font>
	 */
	private Long consignAreaId;

	/** 
	* 运费模板的名称，长度不能超过50个字节
	 */
	private String name;

	/** 
	* 增费：输入0.00-999.99（最多包含两位小数）

<br/><br/><font color=blue>增费必须小于等于首费，但是当首费为0时增费可以大于首费</font>


<br/><br/><font color=red>输入的格式分号个数和template_types数量一致，逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
	 */
	private String templateAddFees;

	/** 
	* 增费标准：当valuation(记价方式)为0时输入1-9999范围内的整数<br/><font color=red>当valuation(记价方式)为1时输入0.1-9999.9范围内的小数只能包含以为小数（单位为千克）<br/><font color=blue>当valuation(记价方式)为3时输入0.1-999.9范围内的数值，数值只能包含一位小数（单位为 立方米）
<br/>
<br><font color=red>输入的格式分号个数和template_types数量一致，逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
	 */
	private String templateAddStandards;

	/** 
	* 邮费子项涉及的地区.结构: value1;value2;value3,value4
<br>如:1,110000;1,110000;1,310000;1,320000,330000。 aredId解释(1=全国,110000=北京,310000=上海,320000=江苏,330000=浙江)
如果template_types设置为post;ems;exmpress;cod则表示为平邮(post)指定默认地区(全国)和北京地区的运费;其他的类似以分号区分一一对应
<br/>可以用taobao.areas.get接口获取.或者参考：http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm<br/>
<br/><font color=red>每个运费方式设置涉及的地区中必须包含全国地区（areaId=1）表示默认运费,可以只设置默认运费</font>
<br><font color=blue>注意:为多个地区指定指定不同（首费标准、首费、增费标准、增费一项不一样就算不同）的运费以逗号","区分，
template_start_standards(首费标准)、template_start_fees(首费)、
template_add_standards(增费标准)、
template_add_fees(增费)必须与template_types分号数量相同。如果为需要为多个地区指定相同运费则地区之间用“|”隔开即可。</font>
<font color=red>如果卖家没有传入发货地址则默认地址库的发货地址</font>
	 */
	private String templateDests;

	/** 
	* 首费：输入0.00-999.99（最多包含两位小数）
<br/><font color=red>输入的格式分号个数和template_types数量一致，逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
	 */
	private String templateStartFees;

	/** 
	* 首费标准：当valuation(记价方式)为0时输入1-9999范围内的整数<br/><font color=red>当valuation(记价方式)为1时输入0.1-9999.9范围内的小数只能包含以为小数（单位为千克）<br/><font color=blue>当valuation(记价方式)为3时输入0.1-999.9范围内的数值，数值只能包含一位小数（单位为 立方米）
<br/>
<font color=red>输入的格式分号个数和template_types数量一致，逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
	 */
	private String templateStartStandards;

	/** 
	* 运费方式:平邮 (post),快递公司(express),EMS (ems),货到付款(cod),物流宝保障速递(wlb),家装物流(furniture)结构:value1;value2;value3;value4 
如: post;express;ems;cod 
<br/><font color=red>
注意:在添加多个运费方式时,字符串中使用 ";" 分号区分
。template_dests(指定地区)
template_start_standards(首费标准)、template_start_fees(首费)、template_add_standards(增费标准)、template_add_fees(增费)必须与template_types的分号数量相同. </font>
<br>
<font color=blue>
注意：<br/>
1、post,ems,express三种运费方式必须填写一个<br/>
2、只有订购了货到付款用户可以填cod;只有家装物流用户可以填写furniture
只有订购了保障速递的用户可以填写bzsd,只有物流宝用户可以填写wlb<br/>
3、如果是货到付款用户当没有填写cod运送方式时，运费模板会默认继承express的费用为cod的费用<br/>
4、如果是保障速递户当没有填写bzsd运送方式时，运费模板会默认继承express的费用为bzsd的费用<br/>
5、由于3和4的原因所以当是货到付款用户或保障速递用户时如果没填写对应的运送方式express是必须填写的
</font>
	 */
	private String templateTypes;

	/** 
	* 可选值：0、1、3，说明如下。<br>0:表示按宝贝件数计算运费 <br>1:表示按宝贝重量计算运费
 <br>3:表示按宝贝体积计算运费
	 */
	private Long valuation;

	public void setAssumer(Long assumer) {
		this.assumer = assumer;
	}

	public Long getAssumer() {
		return this.assumer;
	}

	public void setConsignAreaId(Long consignAreaId) {
		this.consignAreaId = consignAreaId;
	}

	public Long getConsignAreaId() {
		return this.consignAreaId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setTemplateAddFees(String templateAddFees) {
		this.templateAddFees = templateAddFees;
	}

	public String getTemplateAddFees() {
		return this.templateAddFees;
	}

	public void setTemplateAddStandards(String templateAddStandards) {
		this.templateAddStandards = templateAddStandards;
	}

	public String getTemplateAddStandards() {
		return this.templateAddStandards;
	}

	public void setTemplateDests(String templateDests) {
		this.templateDests = templateDests;
	}

	public String getTemplateDests() {
		return this.templateDests;
	}

	public void setTemplateStartFees(String templateStartFees) {
		this.templateStartFees = templateStartFees;
	}

	public String getTemplateStartFees() {
		return this.templateStartFees;
	}

	public void setTemplateStartStandards(String templateStartStandards) {
		this.templateStartStandards = templateStartStandards;
	}

	public String getTemplateStartStandards() {
		return this.templateStartStandards;
	}

	public void setTemplateTypes(String templateTypes) {
		this.templateTypes = templateTypes;
	}

	public String getTemplateTypes() {
		return this.templateTypes;
	}

	public void setValuation(Long valuation) {
		this.valuation = valuation;
	}

	public Long getValuation() {
		return this.valuation;
	}

	public String getApiMethodName() {
		return "taobao.delivery.template.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("assumer", this.assumer);
		txtParams.put("consign_area_id", this.consignAreaId);
		txtParams.put("name", this.name);
		txtParams.put("template_add_fees", this.templateAddFees);
		txtParams.put("template_add_standards", this.templateAddStandards);
		txtParams.put("template_dests", this.templateDests);
		txtParams.put("template_start_fees", this.templateStartFees);
		txtParams.put("template_start_standards", this.templateStartStandards);
		txtParams.put("template_types", this.templateTypes);
		txtParams.put("valuation", this.valuation);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DeliveryTemplateAddResponse> getResponseClass() {
		return DeliveryTemplateAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(assumer, "assumer");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 50, "name");
		RequestCheckUtils.checkNotEmpty(templateAddFees, "templateAddFees");
		RequestCheckUtils.checkNotEmpty(templateAddStandards, "templateAddStandards");
		RequestCheckUtils.checkNotEmpty(templateDests, "templateDests");
		RequestCheckUtils.checkNotEmpty(templateStartFees, "templateStartFees");
		RequestCheckUtils.checkNotEmpty(templateStartStandards, "templateStartStandards");
		RequestCheckUtils.checkNotEmpty(templateTypes, "templateTypes");
		RequestCheckUtils.checkNotEmpty(valuation, "valuation");
	}
	

}