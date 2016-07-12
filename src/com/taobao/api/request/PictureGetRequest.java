package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureGetResponse;

/**
 * TOP API: taobao.picture.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.29
 */
public class PictureGetRequest extends BaseTaobaoRequest<PictureGetResponse> {
	
	

	/** 
	* 图片使用，如果是pc宝贝detail使用，设置为client:computer，查询出来的图片是符合pc的宝贝detail显示的如果是手机宝贝detail使用，设置为client:phone，查询出来的图片是符合手机的宝贝detail显示的,默认值是全部
	 */
	private String clientType;

	/** 
	* 是否删除,unfroze代表没有删除
	 */
	private String deleted;

	/** 
	* 查询上传结束时间点,格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date endDate;

	/** 
	* 是否获取https的链接
	 */
	private Boolean isHttps;

	/** 
	* 图片被修改的时间点，格式:yyyy-MM-dd HH:mm:ss。查询此修改时间点之后到目前的图片。
	 */
	private Date modifiedTime;

	/** 
	* 图片查询结果排序,time:desc按上传时间从晚到早(默认), time:asc按上传时间从早到晚,sizes:desc按图片从大到小，sizes:asc按图片从小到大,默认time:desc
	 */
	private String orderBy;

	/** 
	* 页码.传入值为1代表第一页,传入值为2代表第二页,依此类推,默认值为1
	 */
	private Long pageNo;

	/** 
	* 每页条数.每页返回最多返回100条,默认值40
	 */
	private Long pageSize;

	/** 
	* 图片分类ID
	 */
	private Long pictureCategoryId;

	/** 
	* 图片ID
	 */
	private Long pictureId;

	/** 
	* 查询上传开始时间点,格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date startDate;

	/** 
	* 图片标题,最大长度50字符,中英文都算一字符
	 */
	private String title;

	/** 
	* 图片url查询接口
	 */
	private String urls;

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setIsHttps(Boolean isHttps) {
		this.isHttps = isHttps;
	}

	public Boolean getIsHttps() {
		return this.isHttps;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String getUrls() {
		return this.urls;
	}

	public String getApiMethodName() {
		return "taobao.picture.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("client_type", this.clientType);
		txtParams.put("deleted", this.deleted);
		txtParams.put("end_date", this.endDate);
		txtParams.put("is_https", this.isHttps);
		txtParams.put("modified_time", this.modifiedTime);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("picture_id", this.pictureId);
		txtParams.put("start_date", this.startDate);
		txtParams.put("title", this.title);
		txtParams.put("urls", this.urls);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureGetResponse> getResponseClass() {
		return PictureGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}