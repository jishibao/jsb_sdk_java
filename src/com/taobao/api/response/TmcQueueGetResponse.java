package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.queue.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcQueueGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2823971844384427444L;

	/** 
	 * 队列详细信息
	 */
	@ApiListField("datas")
	@ApiField("tmc_queue_info")
	private List<TmcQueueInfo> datas;


	public void setDatas(List<TmcQueueInfo> datas) {
		this.datas = datas;
	}
	public List<TmcQueueInfo> getDatas( ) {
		return this.datas;
	}
	
	/**
	 * 队列详细信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TmcQueueInfo extends TaobaoObject {
		private static final long serialVersionUID = 3628551521776197721L;
		/**
		 * 消息队列Broker名称
		 */
		@ApiField("broker_name")
		private String brokerName;
		/**
		 * 当前队列当天读取量
		 */
		@ApiField("get_total")
		private Long getTotal;
		/**
		 * TMC组名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 当前队列当天写入量
		 */
		@ApiField("put_toal")
		private Long putToal;
	
		public String getBrokerName() {
			return this.brokerName;
		}
		public void setBrokerName(String brokerName) {
			this.brokerName = brokerName;
		}
		public Long getGetTotal() {
			return this.getTotal;
		}
		public void setGetTotal(Long getTotal) {
			this.getTotal = getTotal;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPutToal() {
			return this.putToal;
		}
		public void setPutToal(Long putToal) {
			this.putToal = putToal;
		}
	}
	


}
