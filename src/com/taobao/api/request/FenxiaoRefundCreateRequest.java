package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoRefundCreateResponse;

/**
 * TOP API: taobao.fenxiao.refund.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoRefundCreateRequest extends BaseTaobaoRequest<FenxiaoRefundCreateResponse> {
	
	

	/** 
	* 是否退货，只有子采购单发货后，才能申请退货
	 */
	private Boolean isReturnGoods;

	/** 
	* 此条子采购单是否退邮费，邮费要记在最后一笔申请退款的子单上面
	 */
	private Boolean isReturnPostFee;

	/** 
	* 退款说明,2-200字
	 */
	private String refundDesc;

	/** 
	* 发货前：
1、缺货，2、拍错商品，3、商品缺少所需样式，4、协商一致退款，5、未及时发货，0、其它
发货后：
经销：
1、商品质量问题，2、收到的商品不符，3、协商一致退款，4、一直未收到货，5、退还多付邮费，6、折扣、赠品、发票等问题，0、其它
代销：
1、商品质量问题，2、收到的商品不符，3、协商一致退款，4、买家一直未收到货，5、退还多付邮费，6、折扣、赠品、发票等问题，0、其它
	 */
	private Long refundReasonId;

	/** 
	* 需要退款的金额，单位为分
	 */
	private Long returnFee;

	/** 
	* 需要创建退款的子采购单id
	 */
	private Long subOrderId;

	public void setIsReturnGoods(Boolean isReturnGoods) {
		this.isReturnGoods = isReturnGoods;
	}

	public Boolean getIsReturnGoods() {
		return this.isReturnGoods;
	}

	public void setIsReturnPostFee(Boolean isReturnPostFee) {
		this.isReturnPostFee = isReturnPostFee;
	}

	public Boolean getIsReturnPostFee() {
		return this.isReturnPostFee;
	}

	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public String getRefundDesc() {
		return this.refundDesc;
	}

	public void setRefundReasonId(Long refundReasonId) {
		this.refundReasonId = refundReasonId;
	}

	public Long getRefundReasonId() {
		return this.refundReasonId;
	}

	public void setReturnFee(Long returnFee) {
		this.returnFee = returnFee;
	}

	public Long getReturnFee() {
		return this.returnFee;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.refund.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_return_goods", this.isReturnGoods);
		txtParams.put("is_return_post_fee", this.isReturnPostFee);
		txtParams.put("refund_desc", this.refundDesc);
		txtParams.put("refund_reason_id", this.refundReasonId);
		txtParams.put("return_fee", this.returnFee);
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoRefundCreateResponse> getResponseClass() {
		return FenxiaoRefundCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(isReturnGoods, "isReturnGoods");
		RequestCheckUtils.checkNotEmpty(isReturnPostFee, "isReturnPostFee");
		RequestCheckUtils.checkNotEmpty(refundDesc, "refundDesc");
		RequestCheckUtils.checkNotEmpty(refundReasonId, "refundReasonId");
		RequestCheckUtils.checkNotEmpty(returnFee, "returnFee");
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}
	

}