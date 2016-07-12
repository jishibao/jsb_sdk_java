package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3748413974868424859L;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("modules")
	@ApiField("waybill_cloud_print_response")
	private List<WaybillCloudPrintResponse> modules;


	public void setModules(List<WaybillCloudPrintResponse> modules) {
		this.modules = modules;
	}
	public List<WaybillCloudPrintResponse> getModules( ) {
		return this.modules;
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillCloudPrintResponse extends TaobaoObject {
		private static final long serialVersionUID = 1273273372915274396L;
		/**
		 * encodingType
		 */
		@ApiField("encoding_type")
		private Long encodingType;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 模板内容
		 */
		@ApiField("print_data")
		private String printData;
		/**
		 * 签名
		 */
		@ApiField("signature")
		private String signature;
		/**
		 * 模板URL
		 */
		@ApiField("template_url")
		private String templateUrl;
		/**
		 * 面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	
		public Long getEncodingType() {
			return this.encodingType;
		}
		public void setEncodingType(Long encodingType) {
			this.encodingType = encodingType;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public String getPrintData() {
			return this.printData;
		}
		public void setPrintData(String printData) {
			this.printData = printData;
		}
		public String getSignature() {
			return this.signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public String getTemplateUrl() {
			return this.templateUrl;
		}
		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}
	}
	


}
