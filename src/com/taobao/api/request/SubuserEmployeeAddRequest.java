package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserEmployeeAddResponse;

/**
 * TOP API: taobao.subuser.employee.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class SubuserEmployeeAddRequest extends BaseTaobaoRequest<SubuserEmployeeAddResponse> {
	
	

	/** 
	* 当前员工所属部门ID
	 */
	private Long departmentId;

	/** 
	* 当前员工担任职务ID
	 */
	private Long dutyId;

	/** 
	* 员工姓名
	 */
	private String employeeName;

	/** 
	* 员工花名
	 */
	private String employeeNickname;

	/** 
	* 员工工号(可以用大小写英文字母和数字)
	 */
	private String employeeNum;

	/** 
	* 员工入职时间
	 */
	private Date entryDate;

	/** 
	* 员工身份证号码
	 */
	private String idCardNum;

	/** 
	* 直接上级的员工ID
	 */
	private Long leaderId;

	/** 
	* 办公电话
	 */
	private String officePhone;

	/** 
	* 员工私人邮箱
	 */
	private String personalEmail;

	/** 
	* 员工手机号码
	 */
	private String personalMobile;

	/** 
	* 员工性别 1：男; 2:女
	 */
	private Long sex;

	/** 
	* 子账号ID
	 */
	private Long subId;

	/** 
	* 工作地点
	 */
	private String workLocation;

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDutyId(Long dutyId) {
		this.dutyId = dutyId;
	}

	public Long getDutyId() {
		return this.dutyId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeNickname(String employeeNickname) {
		this.employeeNickname = employeeNickname;
	}

	public String getEmployeeNickname() {
		return this.employeeNickname;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getEmployeeNum() {
		return this.employeeNum;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}

	public String getIdCardNum() {
		return this.idCardNum;
	}

	public void setLeaderId(Long leaderId) {
		this.leaderId = leaderId;
	}

	public Long getLeaderId() {
		return this.leaderId;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getPersonalEmail() {
		return this.personalEmail;
	}

	public void setPersonalMobile(String personalMobile) {
		this.personalMobile = personalMobile;
	}

	public String getPersonalMobile() {
		return this.personalMobile;
	}

	public void setSex(Long sex) {
		this.sex = sex;
	}

	public Long getSex() {
		return this.sex;
	}

	public void setSubId(Long subId) {
		this.subId = subId;
	}

	public Long getSubId() {
		return this.subId;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getWorkLocation() {
		return this.workLocation;
	}

	public String getApiMethodName() {
		return "taobao.subuser.employee.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("department_id", this.departmentId);
		txtParams.put("duty_id", this.dutyId);
		txtParams.put("employee_name", this.employeeName);
		txtParams.put("employee_nickname", this.employeeNickname);
		txtParams.put("employee_num", this.employeeNum);
		txtParams.put("entry_date", this.entryDate);
		txtParams.put("id_card_num", this.idCardNum);
		txtParams.put("leader_id", this.leaderId);
		txtParams.put("office_phone", this.officePhone);
		txtParams.put("personal_email", this.personalEmail);
		txtParams.put("personal_mobile", this.personalMobile);
		txtParams.put("sex", this.sex);
		txtParams.put("sub_id", this.subId);
		txtParams.put("work_location", this.workLocation);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserEmployeeAddResponse> getResponseClass() {
		return SubuserEmployeeAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(departmentId, "departmentId");
		RequestCheckUtils.checkNotEmpty(employeeName, "employeeName");
		RequestCheckUtils.checkNotEmpty(sex, "sex");
		RequestCheckUtils.checkNotEmpty(subId, "subId");
	}
	

}