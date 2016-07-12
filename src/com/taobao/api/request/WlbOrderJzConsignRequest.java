package com.taobao.api.request;

import com.taobao.api.domain.JzReceiverTo;
import com.taobao.api.domain.Tpdto;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.JzTopArgs;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbOrderJzConsignResponse;

/**
 * TOP API: taobao.wlb.order.jz.consign request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.23
 */
public class WlbOrderJzConsignRequest extends BaseTaobaoRequest<WlbOrderJzConsignResponse> {
	
	

	/** 
	* 安装收货人信息,如果为空,则取默认收货人信息
	 */
	private String insReceiverTo;

	/** 
	* 安装公司信息,需要安装时,才填写
	 */
	private String insTpDto;

	/** 
	* 家装收货人信息,如果为空,则取默认收货信息
	 */
	private String jzReceiverTo;

	/** 
	* 发货参数
	 */
	private String jzTopArgs;

	/** 
	* 物流公司信息
	 */
	private String lgTpDto;

	/** 
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。如果为空，取的卖家的默认取货地址
	 */
	private Long senderId;

	/** 
	* 交易号
	 */
	private Long tid;

	public void setInsReceiverTo(String insReceiverTo) {
		this.insReceiverTo = insReceiverTo;
	}

	public void setInsReceiverTo(JzReceiverTo insReceiverTo) {
		this.insReceiverTo = new JSONWriter(false,true).write(insReceiverTo);
	}

	public String getInsReceiverTo() {
		return this.insReceiverTo;
	}

	public void setInsTpDto(String insTpDto) {
		this.insTpDto = insTpDto;
	}

	public void setInsTpDto(Tpdto insTpDto) {
		this.insTpDto = new JSONWriter(false,true).write(insTpDto);
	}

	public String getInsTpDto() {
		return this.insTpDto;
	}

	public void setJzReceiverTo(String jzReceiverTo) {
		this.jzReceiverTo = jzReceiverTo;
	}

	public void setJzReceiverTo(JzReceiverTo jzReceiverTo) {
		this.jzReceiverTo = new JSONWriter(false,true).write(jzReceiverTo);
	}

	public String getJzReceiverTo() {
		return this.jzReceiverTo;
	}

	public void setJzTopArgs(String jzTopArgs) {
		this.jzTopArgs = jzTopArgs;
	}

	public void setJzTopArgs(JzTopArgs jzTopArgs) {
		this.jzTopArgs = new JSONWriter(false,true).write(jzTopArgs);
	}

	public String getJzTopArgs() {
		return this.jzTopArgs;
	}

	public void setLgTpDto(String lgTpDto) {
		this.lgTpDto = lgTpDto;
	}

	public void setLgTpDto(Tpdto lgTpDto) {
		this.lgTpDto = new JSONWriter(false,true).write(lgTpDto);
	}

	public String getLgTpDto() {
		return this.lgTpDto;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getSenderId() {
		return this.senderId;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.jz.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ins_receiver_to", this.insReceiverTo);
		txtParams.put("ins_tp_dto", this.insTpDto);
		txtParams.put("jz_receiver_to", this.jzReceiverTo);
		txtParams.put("jz_top_args", this.jzTopArgs);
		txtParams.put("lg_tp_dto", this.lgTpDto);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderJzConsignResponse> getResponseClass() {
		return WlbOrderJzConsignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}