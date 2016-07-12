package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 评价列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeRate extends TaobaoObject {

	private static final long serialVersionUID = 3552334577154528876L;

	/**
	 * 评价内容,最大长度:500个汉字
	 */
	@ApiField("content")
	private String content;

	/**
	 * 评价创建时间,格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 商品价格,精确到2位小数;单位:元.如:200.07，表示:200元7分
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 评价者昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 商品的数字ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子订单ID
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 被评价者昵称
	 */
	@ApiField("rated_nick")
	private String ratedNick;

	/**
	 * 评价解释,最大长度:500个汉字
	 */
	@ApiField("reply")
	private String reply;

	/**
	 * 评价结果,可选值:good(好评),neutral(中评),bad(差评)
	 */
	@ApiField("result")
	private String result;

	/**
	 * 评价者角色.可选值:seller(卖家),buyer(买家)
	 */
	@ApiField("role")
	private String role;

	/**
	 * 交易ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 评价信息是否用于记分，
可取值：true(参与记分)和false(不参与记分)
	 */
	@ApiField("valid_score")
	private Boolean validScore;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getRatedNick() {
		return this.ratedNick;
	}
	public void setRatedNick(String ratedNick) {
		this.ratedNick = ratedNick;
	}

	public String getReply() {
		return this.reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Boolean getValidScore() {
		return this.validScore;
	}
	public void setValidScore(Boolean validScore) {
		this.validScore = validScore;
	}

}
