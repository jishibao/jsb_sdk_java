package com.taobao.api.response;

import com.taobao.api.domain.ItemProp;
import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemprops.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItempropsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1431271746414765579L;

	/** 
	 * 类目属性信息(如果是取全量或者增量，不包括属性值),根据fields传入的参数返回相应的结果
	 */
	@ApiListField("item_props")
	@ApiField("item_prop")
	private List<ItemProp> itemProps;

	/** 
	 * 最近修改时间(只有取全量或增量的时候会返回该字段)。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_modified")
	private Date lastModified;


	public void setItemProps(List<ItemProp> itemProps) {
		this.itemProps = itemProps;
	}
	public List<ItemProp> getItemProps( ) {
		return this.itemProps;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public Date getLastModified( ) {
		return this.lastModified;
	}
	


}
