package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeMemoAddResponse;

/**
 * TOP API: taobao.trade.memo.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.02
 */
public class TradeMemoAddRequest extends BaseTaobaoRequest<TradeMemoAddResponse> {
	
	

	/** 
	* 交易备注旗帜，可选值为：0(灰色), 1(红色), 2(黄色), 3(绿色), 4(蓝色), 5(粉红色)，默认值为0
	 */
	private Long flag;

	/** 
	* 交易备注。最大长度: 1000个字节
	 */
	private String memo;

	/** 
	* 交易编号
	 */
	private Long tid;

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public Long getFlag() {
		return this.flag;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.memo.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("flag", this.flag);
		txtParams.put("memo", this.memo);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeMemoAddResponse> getResponseClass() {
		return TradeMemoAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(flag, 5L, "flag");
		RequestCheckUtils.checkMinValue(flag, 0L, "flag");
		RequestCheckUtils.checkNotEmpty(memo, "memo");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}