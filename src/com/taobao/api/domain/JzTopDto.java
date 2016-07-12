package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 家装返回的数据信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class JzTopDto extends TaobaoObject {

	private static final long serialVersionUID = 6866815395627774612L;

	/**
	 * 快递公司列表
	 */
	@ApiListField("expresses")
	@ApiField("expresses")
	private List<Expresses> expresses;

	/**
	 * 商品对应的服务信息
	 */
	@ApiField("goods_relations")
	private String goodsRelations;

	/**
	 * 安装公司列表
	 */
	@ApiListField("ins_tps")
	@ApiField("instps")
	private List<Instps> insTps;

	/**
	 * 物流公司列表
	 */
	@ApiListField("lg_cps")
	@ApiField("lgcps")
	private List<Lgcps> lgCps;

	/**
	 * 是否支持修改安装地址
	 */
	@ApiField("supp_modify_ins_add")
	private Boolean suppModifyInsAdd;

	/**
	 * 是否支持快递
	 */
	@ApiField("support_delivery")
	private Boolean supportDelivery;

	/**
	 * 是否支持安装
	 */
	@ApiField("support_install")
	private Boolean supportInstall;


	public List<Expresses> getExpresses() {
		return this.expresses;
	}
	public void setExpresses(List<Expresses> expresses) {
		this.expresses = expresses;
	}

	public String getGoodsRelations() {
		return this.goodsRelations;
	}
	public void setGoodsRelations(String goodsRelations) {
		this.goodsRelations = goodsRelations;
	}
	public void setGoodsRelationsString(String goodsRelations) {
		this.goodsRelations = goodsRelations;
	}
	

	public List<Instps> getInsTps() {
		return this.insTps;
	}
	public void setInsTps(List<Instps> insTps) {
		this.insTps = insTps;
	}

	public List<Lgcps> getLgCps() {
		return this.lgCps;
	}
	public void setLgCps(List<Lgcps> lgCps) {
		this.lgCps = lgCps;
	}

	public Boolean getSuppModifyInsAdd() {
		return this.suppModifyInsAdd;
	}
	public void setSuppModifyInsAdd(Boolean suppModifyInsAdd) {
		this.suppModifyInsAdd = suppModifyInsAdd;
	}

	public Boolean getSupportDelivery() {
		return this.supportDelivery;
	}
	public void setSupportDelivery(Boolean supportDelivery) {
		this.supportDelivery = supportDelivery;
	}

	public Boolean getSupportInstall() {
		return this.supportInstall;
	}
	public void setSupportInstall(Boolean supportInstall) {
		this.supportInstall = supportInstall;
	}

}
