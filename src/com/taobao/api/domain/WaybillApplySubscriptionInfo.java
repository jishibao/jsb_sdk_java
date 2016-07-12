package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商家与CP的订购关系
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplySubscriptionInfo extends TaobaoObject {

	private static final long serialVersionUID = 1176751631178341758L;

	/**
	 * CP网点信息及对应的商家的发货信息
	 */
	@ApiListField("branch_account_cols")
	@ApiField("waybill_branch_account")
	private List<WaybillBranchAccount> branchAccountCols;

	/**
	 * 物流服务商ID
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 1是直营，2是加盟
	 */
	@ApiField("cp_type")
	private Long cpType;

	/**
	 * 订购关系是否建立
	 */
	@ApiField("result")
	private Long result;


	public List<WaybillBranchAccount> getBranchAccountCols() {
		return this.branchAccountCols;
	}
	public void setBranchAccountCols(List<WaybillBranchAccount> branchAccountCols) {
		this.branchAccountCols = branchAccountCols;
	}

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public Long getCpType() {
		return this.cpType;
	}
	public void setCpType(Long cpType) {
		this.cpType = cpType;
	}

	public Long getResult() {
		return this.result;
	}
	public void setResult(Long result) {
		this.result = result;
	}

}
