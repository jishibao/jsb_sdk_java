package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.ta.number.singlecallbyvoice response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinTaNumberSinglecallbyvoiceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4244721951929529664L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 1398532928619967875L;
		/**
		 * 系统自动生成
		 */
		@ApiField("code")
		private String code;
		/**
		 * 结果
		 */
		@ApiField("model")
		private String model;
		/**
		 * 系统自动生成
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * 成功，失败
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getModel() {
			return this.model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
