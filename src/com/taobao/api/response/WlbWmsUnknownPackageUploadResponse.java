package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.unknown.package.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsUnknownPackageUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5846424626421543133L;

	/** 
	 * null
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
	 * null
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Struct extends TaobaoObject {
		private static final long serialVersionUID = 1197199516827888136L;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private String success;
	
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getSuccess() {
			return this.success;
		}
		public void setSuccess(String success) {
			this.success = success;
		}
	}
	


}
