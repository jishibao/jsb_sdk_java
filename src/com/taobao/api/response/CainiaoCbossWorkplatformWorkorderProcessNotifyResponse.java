package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.workorder.process.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformWorkorderProcessNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4847563151756764543L;

	/** 
	 * 结果
	 */
	@ApiField("response")
	private Struct response;


	public void setResponse(Struct response) {
		this.response = response;
	}
	public Struct getResponse( ) {
		return this.response;
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Struct extends TaobaoObject {
		private static final long serialVersionUID = 3578951617711262246L;
		/**
		 * 错误码
		 */
		@ApiField("res_error_code")
		private String resErrorCode;
		/**
		 * 错误信息
		 */
		@ApiField("res_error_msg")
		private String resErrorMsg;
		/**
		 * 调用结果
		 */
		@ApiField("res_success")
		private Boolean resSuccess;
	
		public String getResErrorCode() {
			return this.resErrorCode;
		}
		public void setResErrorCode(String resErrorCode) {
			this.resErrorCode = resErrorCode;
		}
		public String getResErrorMsg() {
			return this.resErrorMsg;
		}
		public void setResErrorMsg(String resErrorMsg) {
			this.resErrorMsg = resErrorMsg;
		}
		public Boolean getResSuccess() {
			return this.resSuccess;
		}
		public void setResSuccess(Boolean resSuccess) {
			this.resSuccess = resSuccess;
		}
	}
	


}
