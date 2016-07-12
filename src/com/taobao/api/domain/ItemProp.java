package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商品属性
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemProp extends TaobaoObject {

	private static final long serialVersionUID = 4196938197348194299L;

	/**
	 * 子属性的模板（卖家自行输入属性时需要用到）
	 */
	@ApiField("child_template")
	private String childTemplate;

	/**
	 * 类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 属性的feature列表
	 */
	@ApiListField("features")
	@ApiField("feature")
	private List<Feature> features;

	/**
	 * 是否允许别名。可选值：true（是），false（否）
	 */
	@ApiField("is_allow_alias")
	private Boolean isAllowAlias;

	/**
	 * 是否颜色属性。可选值:true(是),false(否)
	 */
	@ApiField("is_color_prop")
	private Boolean isColorProp;

	/**
	 * 是否是可枚举属性。可选值:true(是),false(否)
	 */
	@ApiField("is_enum_prop")
	private Boolean isEnumProp;

	/**
	 * 在is_enum_prop是true的前提下，是否是卖家可以自行输入的属性（注：如果is_enum_prop返回false，该参数统一返回false）。可选值:true(是),false(否)。<b>对于品牌和型号属性（包括子属性）：如果用户是C卖家，则可自定义属性；如果是B卖家，则不可自定义属性，而必须要授权的属性。</b>
	 */
	@ApiField("is_input_prop")
	private Boolean isInputProp;

	/**
	 * 是否商品属性。可选值:true(是),false(否)
	 */
	@ApiField("is_item_prop")
	private Boolean isItemProp;

	/**
	 * 是否关键属性。可选值:true(是),false(否)
	 */
	@ApiField("is_key_prop")
	private Boolean isKeyProp;

	/**
	 * 是否是材质 属性项
	 */
	@ApiField("is_material")
	private Boolean isMaterial;

	/**
	 * 是否销售属性。可选值:true(是),false(否)
	 */
	@ApiField("is_sale_prop")
	private Boolean isSaleProp;

	/**
	 * 是否度量衡属性项
	 */
	@ApiField("is_taosir")
	private Boolean isTaosir;

	/**
	 * 材质属性信息
	 */
	@ApiField("material_do")
	private ItemMaterialProp materialDo;

	/**
	 * 属性修改时间（增量类目专用）
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 三种枚举类型：modify，add，delete（增量类目专用）
	 */
	@ApiField("modified_type")
	private String modifiedType;

	/**
	 * 发布产品或商品时是否可以多选。可选值:true(是),false(否)
	 */
	@ApiField("multi")
	private Boolean multi;

	/**
	 * 发布产品或商品时是否为必选属性。可选值:true(是),false(否)
	 */
	@ApiField("must")
	private Boolean must;

	/**
	 * 属性名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 上级属性ID
	 */
	@ApiField("parent_pid")
	private Long parentPid;

	/**
	 * 上级属性值ID
	 */
	@ApiField("parent_vid")
	private Long parentVid;

	/**
	 * 属性 ID 例：品牌的PID=20000
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * null
	 */
	@ApiListField("prop_values")
	@ApiField("prop_value")
	private List<PropValue> propValues;

	/**
	 * 发布产品或商品时是否为必选属性(与must相同)。可选值:true(是),false(否)
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 排列序号。取值范围:大于零的整排列序号。取值范围:大于零的整数
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * 状态。可选值:normal(正常),deleted(删除)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 度量衡相关信息
	 */
	@ApiField("taosir_do")
	private ItemTaosirDO taosirDo;

	/**
	 * 属性值类型。可选值：
multiCheck(枚举多选)
optional(枚举单选)
multiCheckText(枚举可输入多选)
optionalText(枚举可输入单选)
text(非枚举可输入)
	 */
	@ApiField("type")
	private String type;


	public String getChildTemplate() {
		return this.childTemplate;
	}
	public void setChildTemplate(String childTemplate) {
		this.childTemplate = childTemplate;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public List<Feature> getFeatures() {
		return this.features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Boolean getIsAllowAlias() {
		return this.isAllowAlias;
	}
	public void setIsAllowAlias(Boolean isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Boolean getIsInputProp() {
		return this.isInputProp;
	}
	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}

	public Boolean getIsItemProp() {
		return this.isItemProp;
	}
	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean getIsMaterial() {
		return this.isMaterial;
	}
	public void setIsMaterial(Boolean isMaterial) {
		this.isMaterial = isMaterial;
	}

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean getIsTaosir() {
		return this.isTaosir;
	}
	public void setIsTaosir(Boolean isTaosir) {
		this.isTaosir = isTaosir;
	}

	public ItemMaterialProp getMaterialDo() {
		return this.materialDo;
	}
	public void setMaterialDo(ItemMaterialProp materialDo) {
		this.materialDo = materialDo;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifiedType() {
		return this.modifiedType;
	}
	public void setModifiedType(String modifiedType) {
		this.modifiedType = modifiedType;
	}

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentPid() {
		return this.parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentVid() {
		return this.parentVid;
	}
	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public List<PropValue> getPropValues() {
		return this.propValues;
	}
	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public ItemTaosirDO getTaosirDo() {
		return this.taosirDo;
	}
	public void setTaosirDo(ItemTaosirDO taosirDo) {
		this.taosirDo = taosirDo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
