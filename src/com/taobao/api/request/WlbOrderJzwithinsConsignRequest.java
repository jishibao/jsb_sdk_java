package com.taobao.api.request;

import com.taobao.api.domain.JzPartnerNew;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.JzConsignArgsNew;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbOrderJzwithinsConsignResponse;

/**
 * TOP API: taobao.wlb.order.jzwithins.consign request
 * 
 * @author top auto create
 * @since 1.0, 2015.03.11
 */
public class WlbOrderJzwithinsConsignRequest extends BaseTaobaoRequest<WlbOrderJzwithinsConsignResponse> {
	
	

	/** 
	* 物流服务商信息
	 */
	private String insPartner;

	/** 
	* 家装物流发货参数
	 */
	private String jzConsignArgs;

	/** 
	* 淘宝交易订单号
	 */
	private Long tid;

	/** 
	* 物流服务商信息
	 */
	private String tmsPartner;

	public void setInsPartner(String insPartner) {
		this.insPartner = insPartner;
	}

	public void setInsPartner(JzPartnerNew insPartner) {
		this.insPartner = new JSONWriter(false,true).write(insPartner);
	}

	public String getInsPartner() {
		return this.insPartner;
	}

	public void setJzConsignArgs(String jzConsignArgs) {
		this.jzConsignArgs = jzConsignArgs;
	}

	public void setJzConsignArgs(JzConsignArgsNew jzConsignArgs) {
		this.jzConsignArgs = new JSONWriter(false,true).write(jzConsignArgs);
	}

	public String getJzConsignArgs() {
		return this.jzConsignArgs;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTmsPartner(String tmsPartner) {
		this.tmsPartner = tmsPartner;
	}

	public void setTmsPartner(JzPartnerNew tmsPartner) {
		this.tmsPartner = new JSONWriter(false,true).write(tmsPartner);
	}

	public String getTmsPartner() {
		return this.tmsPartner;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.jzwithins.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ins_partner", this.insPartner);
		txtParams.put("jz_consign_args", this.jzConsignArgs);
		txtParams.put("tid", this.tid);
		txtParams.put("tms_partner", this.tmsPartner);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderJzwithinsConsignResponse> getResponseClass() {
		return WlbOrderJzwithinsConsignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}