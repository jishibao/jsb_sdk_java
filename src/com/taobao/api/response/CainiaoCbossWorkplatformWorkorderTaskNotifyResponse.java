package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cboss.workplatform.workorder.task.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCbossWorkplatformWorkorderTaskNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3735892649853116466L;

	/** 
	 * response
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
	 * response
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Struct extends TaobaoObject {
		private static final long serialVersionUID = 7886744289519493845L;
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
		 * 是否成功
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
