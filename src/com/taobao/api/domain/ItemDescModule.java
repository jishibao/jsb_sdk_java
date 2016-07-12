package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品详情模块
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemDescModule extends TaobaoObject {

	private static final long serialVersionUID = 1264527248214584931L;

	/**
	 * 描述具体内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 一个List<String>的Json串，里面是模块引导提示，不超过3条（isv提交时可忽略不传）
	 */
	@ApiField("intros")
	private String intros;

	/**
	 * 模块id ,(注意:用户自定义模块不用填此项。)
	 */
	@ApiField("module_id")
	private Long moduleId;

	/**
	 * 模块名称
	 */
	@ApiField("module_name")
	private String moduleName;

	/**
	 * 是否必填 （isv提交时可忽略不传）
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 淘宝图片空间的地址链接，示例模板，最多不超过三个（isv提交时可忽略不传）
	 */
	@ApiField("tpl_urls")
	private String tplUrls;

	/**
	 * cat_mod:表示是运营设置的类目维度模块，usr_mod表示的是商家自定义模块。
	 */
	@ApiField("type")
	private String type;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getIntros() {
		return this.intros;
	}
	public void setIntros(String intros) {
		this.intros = intros;
	}

	public Long getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return this.moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getTplUrls() {
		return this.tplUrls;
	}
	public void setTplUrls(String tplUrls) {
		this.tplUrls = tplUrls;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
