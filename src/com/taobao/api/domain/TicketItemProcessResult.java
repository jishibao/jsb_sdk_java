package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 门票商品操作结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TicketItemProcessResult extends TaobaoObject {

	private static final long serialVersionUID = 6648613996248615558L;

	/**
	 * 商品操作流程是否被迫终止。
如果broken==false则表示成功发布商品，则通过item_id字段获取新生成商品id；
如果broken==true则表示发布商品遇到问题，则通过broken_reasons字段获取到失败原因。
	 */
	@ApiField("broken")
	private Boolean broken;

	/**
	 * 操作商品遇到的错误原因
	 */
	@ApiListField("broken_reasons")
	@ApiField("string")
	private List<String> brokenReasons;

	/**
	 * 成功操作的商品标识
	 */
	@ApiField("item_id")
	private Long itemId;


	public Boolean getBroken() {
		return this.broken;
	}
	public void setBroken(Boolean broken) {
		this.broken = broken;
	}

	public List<String> getBrokenReasons() {
		return this.brokenReasons;
	}
	public void setBrokenReasons(List<String> brokenReasons) {
		this.brokenReasons = brokenReasons;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

}
