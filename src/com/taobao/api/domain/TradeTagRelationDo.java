package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 订单标签关联关系。tag_type的值有1,2,3,1为官方标，2为自定义标，3为主站只读标签。当标签为主站只读标签时，只有tag_name和tag_value信息，不含id和gmt_modified等信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeTagRelationDo extends TaobaoObject {

	private static final long serialVersionUID = 6674347227873662437L;

	/**
	 * 记录的创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 记录的最新修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 该标签操作的历史记录
	 */
	@ApiListField("history_trade_tag_relations")
	@ApiField("history_trade_relation_do")
	private List<HistoryTradeRelationDo> historyTradeTagRelations;

	/**
	 * 订单标签记录id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 标签名称
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 标签类型       1：官方标签      2：自定义标签     3：主站只读标签
	 */
	@ApiField("tag_type")
	private Long tagType;

	/**
	 * 标签值，json格式
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * 订单id
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 该标签在消费者端是否显示,0:不显示,1：显示
	 */
	@ApiField("visible")
	private Long visible;


	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<HistoryTradeRelationDo> getHistoryTradeTagRelations() {
		return this.historyTradeTagRelations;
	}
	public void setHistoryTradeTagRelations(List<HistoryTradeRelationDo> historyTradeTagRelations) {
		this.historyTradeTagRelations = historyTradeTagRelations;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Long getTagType() {
		return this.tagType;
	}
	public void setTagType(Long tagType) {
		this.tagType = tagType;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getVisible() {
		return this.visible;
	}
	public void setVisible(Long visible) {
		this.visible = visible;
	}

}
