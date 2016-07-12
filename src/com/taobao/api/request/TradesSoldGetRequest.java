package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradesSoldGetResponse;

/**
 * TOP API: taobao.trades.sold.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.19
 */
public class TradesSoldGetRequest extends BaseTaobaoRequest<TradesSoldGetResponse> {
	
	

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 查询交易创建时间结束。格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date endCreated;

	/** 
	* 可选值有ershou(二手市场的订单）,service（商城服务子订单）mark（双十一大促活动异常订单）作为扩展类型筛选只能做单个ext_type查询，不能全部查询所有的ext_type类型
	 */
	private String extType;

	/** 
	* 需要返回的字段列表，多个字段用半角逗号分隔，可选值为返回示例中能看到的所有字段。rx_audit_status=0,处方药未审核
	 */
	private String fields;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于零的整数; 默认值:40;最大值:100
	 */
	private Long pageSize;

	/** 
	* 评价状态，默认查询所有评价状态的数据，除了默认值外每次只能查询一种状态。<br>可选值：RATE_UNBUYER(买家未评)RATE_UNSELLER(卖家未评)RATE_BUYER_UNSELLER(买家已评，卖家未评)RATE_UNBUYER_SELLER(买家未评，卖家已评)RATE_BUYER_SELLER(买家已评,卖家已评)
	 */
	private String rateStatus;

	/** 
	* 查询三个月内交易创建时间开始。格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date startCreated;

	/** 
	* 交易状态（<a href="http://open.taobao.com/doc/detail.htm?id=102856" target="_blank">查看可选值</a>），默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。
	 */
	private String status;

	/** 
	* 卖家对交易的自定义分组标签，目前可选值为：time_card（点卡软件代充），fee_card（话费软件代充）
	 */
	private String tag;

	/** 
	* 交易类型列表，同时查询多种交易类型可用逗号分隔。<span style="color:red;font-weight: bold;">默认同时查询guarantee_trade,auto_delivery,ec,cod,step 这5 种的交易类型的数据；查询所有交易类型的数据，需要设置下面全部可选值。</span>可选值：fixed(一口价)auction(拍卖)guarantee_trade(一口价、拍卖)step(分阶段付款，万人团，阶梯团订单）independent_simple_trade(旺店入门版交易)independent_shop_trade(旺店标准版交易)auto_delivery(自动发货)ec(直冲)cod(货到付款)game_equipment(游戏装备)shopex_trade(ShopEX交易)netcn_trade(万网交易)external_trade(统一外部交易)instant_trade (即时到账)b2c_cod(大商家货到付款)hotel_trade(酒店类型交易)super_market_trade(商超交易)super_market_cod_trade(商超货到付款交易)taohua(淘花网交易类型）waimai(外卖交易类型）o2o_offlinetrade（O2O交易）nopaid（即时到帐/趣味猜交易类型）step (万人团) eticket(电子凭证) tmall_i18n（天猫国际）;nopaid （无付款交易）insurance_plus（保险）finance（基金）注：guarantee_trade是一个组合查询条件，并不是一种交易类型，获取批量或单个订单中不会返回此种类型的订单。pre_auth_type(预授权0元购)
	 */
	private String type;

	/** 
	* 是否启用has_next的分页方式，如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，通过此种方式获取增量交易，接口调用成功率在原有的基础上有所提升。
	 */
	private Boolean useHasNext;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setExtType(String extType) {
		this.extType = extType;
	}

	public String getExtType() {
		return this.extType;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}

	public String getRateStatus() {
		return this.rateStatus;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public Date getStartCreated() {
		return this.startCreated;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}

	public Boolean getUseHasNext() {
		return this.useHasNext;
	}

	public String getApiMethodName() {
		return "taobao.trades.sold.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("ext_type", this.extType);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rate_status", this.rateStatus);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("tag", this.tag);
		txtParams.put("type", this.type);
		txtParams.put("use_has_next", this.useHasNext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradesSoldGetResponse> getResponseClass() {
		return TradesSoldGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}