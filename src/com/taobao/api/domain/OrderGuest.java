package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 酒店订单入住人结构。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderGuest extends TaobaoObject {

	private static final long serialVersionUID = 1737341749873833966L;

	/**
	 * 入住人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 酒店订单id
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 入住人序号
	 */
	@ApiField("person_pos")
	private Long personPos;

	/**
	 * 房间序号
	 */
	@ApiField("room_pos")
	private Long roomPos;

	/**
	 * 入住人电话
	 */
	@ApiField("tel")
	private String tel;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getPersonPos() {
		return this.personPos;
	}
	public void setPersonPos(Long personPos) {
		this.personPos = personPos;
	}

	public Long getRoomPos() {
		return this.roomPos;
	}
	public void setRoomPos(Long roomPos) {
		this.roomPos = roomPos;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
