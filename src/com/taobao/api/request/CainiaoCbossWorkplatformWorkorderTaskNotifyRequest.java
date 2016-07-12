package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoCbossWorkplatformWorkorderTaskNotifyResponse;

/**
 * TOP API: cainiao.cboss.workplatform.workorder.task.notify request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.08
 */
public class CainiaoCbossWorkplatformWorkorderTaskNotifyRequest extends BaseTaobaoRequest<CainiaoCbossWorkplatformWorkorderTaskNotifyResponse> {
	
	

	/** 
	* content
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(Struct content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "cainiao.cboss.workplatform.workorder.task.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCbossWorkplatformWorkorderTaskNotifyResponse> getResponseClass() {
		return CainiaoCbossWorkplatformWorkorderTaskNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * content
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Struct extends TaobaoObject {
		private static final long serialVersionUID = 4127311186458624186L;
		/**
		 * 任务下发次数
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 扩展字段
		 */
		@ApiField("features")
		private String features;
		/**
		 * 任务创建时间
		 */
		@ApiField("gmt_create")
		private String gmtCreate;
		/**
		 * 工单任务id
		 */
		@ApiField("task_id")
		private String taskId;
		/**
		 * 工单任务名称
		 */
		@ApiField("task_name")
		private String taskName;
		/**
		 * 工单任务状态
		 */
		@ApiField("task_status")
		private Long taskStatus;
		/**
		 * 任务超时时间
		 */
		@ApiField("timeout")
		private String timeout;
		/**
		 * 工单id
		 */
		@ApiField("work_order_id")
		private String workOrderId;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getFeatures() {
			return this.features;
		}
		public void setFeatures(String features) {
			this.features = features;
		}
		public String getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getTaskName() {
			return this.taskName;
		}
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		public Long getTaskStatus() {
			return this.taskStatus;
		}
		public void setTaskStatus(Long taskStatus) {
			this.taskStatus = taskStatus;
		}
		public String getTimeout() {
			return this.timeout;
		}
		public void setTimeout(String timeout) {
			this.timeout = timeout;
		}
		public String getWorkOrderId() {
			return this.workOrderId;
		}
		public void setWorkOrderId(String workOrderId) {
			this.workOrderId = workOrderId;
		}
	}
	

}