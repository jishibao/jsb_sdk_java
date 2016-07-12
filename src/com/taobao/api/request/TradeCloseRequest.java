package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeCloseResponse;

/**
 * TOP API: taobao.trade.close request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.14
 */
public class TradeCloseRequest extends BaseTaobaoRequest<TradeCloseResponse> {
	
	

	/** 
	* 交易关闭原因。可以选择的理由有：1.未及时付款2、买家不想买了3、买家信息填写错误，重新拍4、恶意买家/同行捣乱5、缺货6、买家拍错了7、同城见面交易
	 */
	private String closeReason;

	/** 
	* 主订单或子订单编号。
	 */
	private Long tid;

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getCloseReason() {
		return this.closeReason;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.close";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("close_reason", this.closeReason);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeCloseResponse> getResponseClass() {
		return TradeCloseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(closeReason, "closeReason");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}