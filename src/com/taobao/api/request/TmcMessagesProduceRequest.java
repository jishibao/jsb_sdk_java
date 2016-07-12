package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmcMessagesProduceResponse;

/**
 * TOP API: taobao.tmc.messages.produce request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.29
 */
public class TmcMessagesProduceRequest extends BaseTaobaoRequest<TmcMessagesProduceResponse> {
	
	

	/** 
	* tmc消息列表, 最多50条，元素结构与taobao.tmc.message.produce一致，用json表示的消息列表。例如：[{"content": "{\"tid\":1234554321,\"status\":\"X_LOGISTICS_PRINTED\",\"action_time\":\"2014-08-08 18:24:00\",\"seller_nick\": \"向阳aa\",\"operator\":\"小张\"}","topic": "taobao_jds_TradeTrace"},{"content": "{\"tid\":1234554321,\"status\":\"X_LOGISTICS_PRINTED\",\"action_time\":\"2014-08-08 18:24:00\",\"seller_nick\": \"向阳aa\",\"operator\":\"小张\"}","topic": "taobao_jds_TradeTrace"}]
	 */
	private String messages;

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public void setMessages(List<TmcPublishMessage> messages) {
		this.messages = new JSONWriter(false,true).write(messages);
	}

	public String getMessages() {
		return this.messages;
	}

	public String getApiMethodName() {
		return "taobao.tmc.messages.produce";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("messages", this.messages);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcMessagesProduceResponse> getResponseClass() {
		return TmcMessagesProduceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(messages, 50, "messages");
	}
	
	/**
	 * tmc消息列表, 最多50条，元素结构与taobao.tmc.message.produce一致，用json表示的消息列表。例如：[{"content": "{\"tid\":1234554321,\"status\":\"X_LOGISTICS_PRINTED\",\"action_time\":\"2014-08-08 18:24:00\",\"seller_nick\": \"向阳aa\",\"operator\":\"小张\"}","topic": "taobao_jds_TradeTrace"},{"content": "{\"tid\":1234554321,\"status\":\"X_LOGISTICS_PRINTED\",\"action_time\":\"2014-08-08 18:24:00\",\"seller_nick\": \"向阳aa\",\"operator\":\"小张\"}","topic": "taobao_jds_TradeTrace"}]
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TmcPublishMessage extends TaobaoObject {
		private static final long serialVersionUID = 4347311711345463997L;
		/**
		 * 消息内容的JSON表述，必须按照topic的定义来填充
		 */
		@ApiField("content")
		private String content;
		/**
		 * 消息的扩增属性，用json格式表示
		 */
		@ApiField("json_ex_content")
		private String jsonExContent;
		/**
		 * 直发消息需要传入目标appkey
		 */
		@ApiField("target_app_key")
		private String targetAppKey;
		/**
		 * 消息类型
		 */
		@ApiField("topic")
		private String topic;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getJsonExContent() {
			return this.jsonExContent;
		}
		public void setJsonExContent(String jsonExContent) {
			this.jsonExContent = jsonExContent;
		}
		public String getTargetAppKey() {
			return this.targetAppKey;
		}
		public void setTargetAppKey(String targetAppKey) {
			this.targetAppKey = targetAppKey;
		}
		public String getTopic() {
			return this.topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
	}
	

}