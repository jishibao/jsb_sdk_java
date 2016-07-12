package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 卖家定购的服务
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbSellerSubscription extends TaobaoObject {

	private static final long serialVersionUID = 2335824474275432147L;

	/**
	 * 定购有效结束日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 定购ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 判断该仓库是否是实体仓，还是虚拟仓，null是实体仓，10:代表虚拟仓
	 */
	@ApiField("is_own_service")
	private Long isOwnService;

	/**
	 * 父定购ID
可通过该字段来得之服务上下级关系。
例定购了仓储服务，下又有TMS服务。
该字段保存仓储服务ID。
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 服务商ID
	 */
	@ApiField("provider_user_id")
	private Long providerUserId;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 自有仓的别名，当当前订购记录为自有仓时才会有值
	 */
	@ApiField("service_alias")
	private String serviceAlias;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务ID
	 */
	@ApiField("service_id")
	private Long serviceId;

	/**
	 * 服务名
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型，
STORE 1-仓储、
TMS 2-TMS、
PACKAGE 3-包装服务
SUPPLIER 4-供货
INSTALL 5-安装
COMPLEX_SERVICE 100-综合服务
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 定购有效开始日期
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 状态
AUDITING 1-待审核
CANCEL 2-撤销
CHECKED 3-审核通过
FAILED 4-审核未通过
SYNCHRONIZING 5-同步中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 定购用户ID
	 */
	@ApiField("subscriber_user_id")
	private Long subscriberUserId;

	/**
	 * 定购用户NICK
	 */
	@ApiField("subscriber_user_nick")
	private String subscriberUserNick;

	/**
	 * 联系人地址信息
	 */
	@ApiField("wlb_partner_address")
	private WlbPartnerAddress wlbPartnerAddress;

	/**
	 * 联系人联系详情
	 */
	@ApiField("wlb_partner_contact")
	private WlbPartnerContact wlbPartnerContact;


	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getIsOwnService() {
		return this.isOwnService;
	}
	public void setIsOwnService(Long isOwnService) {
		this.isOwnService = isOwnService;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getProviderUserId() {
		return this.providerUserId;
	}
	public void setProviderUserId(Long providerUserId) {
		this.providerUserId = providerUserId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceAlias() {
		return this.serviceAlias;
	}
	public void setServiceAlias(String serviceAlias) {
		this.serviceAlias = serviceAlias;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Long getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSubscriberUserId() {
		return this.subscriberUserId;
	}
	public void setSubscriberUserId(Long subscriberUserId) {
		this.subscriberUserId = subscriberUserId;
	}

	public String getSubscriberUserNick() {
		return this.subscriberUserNick;
	}
	public void setSubscriberUserNick(String subscriberUserNick) {
		this.subscriberUserNick = subscriberUserNick;
	}

	public WlbPartnerAddress getWlbPartnerAddress() {
		return this.wlbPartnerAddress;
	}
	public void setWlbPartnerAddress(WlbPartnerAddress wlbPartnerAddress) {
		this.wlbPartnerAddress = wlbPartnerAddress;
	}

	public WlbPartnerContact getWlbPartnerContact() {
		return this.wlbPartnerContact;
	}
	public void setWlbPartnerContact(WlbPartnerContact wlbPartnerContact) {
		this.wlbPartnerContact = wlbPartnerContact;
	}

}
