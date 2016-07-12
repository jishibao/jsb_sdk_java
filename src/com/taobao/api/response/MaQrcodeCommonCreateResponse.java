package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.QrcodeDO;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ma.qrcode.common.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MaQrcodeCommonCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1135428539824367623L;

	/** 
	 * 二维码对像
	 */
	@ApiListField("modules")
	@ApiField("qrcode_d_o")
	private List<QrcodeDO> modules;

	/** 
	 * 执行是否成功
	 */
	@ApiField("suc")
	private Boolean suc;


	public void setModules(List<QrcodeDO> modules) {
		this.modules = modules;
	}
	public List<QrcodeDO> getModules( ) {
		return this.modules;
	}

	public void setSuc(Boolean suc) {
		this.suc = suc;
	}
	public Boolean getSuc( ) {
		return this.suc;
	}
	


}
