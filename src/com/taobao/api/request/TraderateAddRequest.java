package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TraderateAddResponse;

/**
 * TOP API: taobao.traderate.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TraderateAddRequest extends BaseTaobaoRequest<TraderateAddResponse> {
	
	

	/** 
	* 是否匿名,卖家评不能匿名。可选值:true(匿名),false(非匿名)。注意：如果交易订单匿名，则评价也匿名
	 */
	private Boolean anony;

	/** 
	* 评价内容,最大长度: 500个汉字 .注意：当评价结果为good时就不用输入评价内容.评价内容为neutral/bad的时候需要输入评价内容
	 */
	private String content;

	/** 
	* 子订单ID
	 */
	private Long oid;

	/** 
	* 评价结果,可选值:good(好评),neutral(中评),bad(差评)
	 */
	private String result;

	/** 
	* 评价者角色,可选值:seller(卖家),buyer(买家)
	 */
	private String role;

	/** 
	* 交易ID
	 */
	private Long tid;

	public void setAnony(Boolean anony) {
		this.anony = anony;
	}

	public Boolean getAnony() {
		return this.anony;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.traderate.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("anony", this.anony);
		txtParams.put("content", this.content);
		txtParams.put("oid", this.oid);
		txtParams.put("result", this.result);
		txtParams.put("role", this.role);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TraderateAddResponse> getResponseClass() {
		return TraderateAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(result, "result");
		RequestCheckUtils.checkNotEmpty(role, "role");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}