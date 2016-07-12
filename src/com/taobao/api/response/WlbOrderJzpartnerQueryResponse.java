package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PartnerNew;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.jzpartner.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderJzpartnerQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7389725758555576988L;

	/** 
	 * 安装服务商列表
	 */
	@ApiListField("install_list")
	@ApiField("partner_new")
	private List<PartnerNew> installList;

	/** 
	 * 接口查询成功或者失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 查询返回信息，如果失败，存储错误信息
	 */
	@ApiField("result_info")
	private String resultInfo;

	/** 
	 * 物流配送服务商对象列表
	 */
	@ApiListField("server_list")
	@ApiField("partner_new")
	private List<PartnerNew> serverList;


	public void setInstallList(List<PartnerNew> installList) {
		this.installList = installList;
	}
	public List<PartnerNew> getInstallList( ) {
		return this.installList;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

	public void setServerList(List<PartnerNew> serverList) {
		this.serverList = serverList;
	}
	public List<PartnerNew> getServerList( ) {
		return this.serverList;
	}
	


}
