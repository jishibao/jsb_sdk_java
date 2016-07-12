package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductBooksAddResponse;

/**
 * TOP API: tmall.product.books.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.06
 */
public class TmallProductBooksAddRequest extends BaseTaobaoRequest<TmallProductBooksAddResponse> implements TaobaoUploadRequest<TmallProductBooksAddResponse> {

	
	

	/** 
	* 摘要信息，不支持HTML代码，长度限制5000
	 */
	private String abstractMsg;

	/** 
	* 用户的Id,需要确定自己id的可以联系接口负责人
	 */
	private String appInfo;

	/** 
	* 作者/著者，最多填写三个人名，超出三个人的以“等”结束
	 */
	private String author;

	/** 
	* 作者国别/地区，到国家级别
	 */
	private String authorArea;

	/** 
	* 条形码，数字，共13位，9787开头
	 */
	private String barCode;

	/** 
	* 装帧
	 */
	private String bookBind;

	/** 
	* 开本，如：16  表示16开本
	 */
	private Long bookSize;

	/** 
	* 版本
	 */
	private Long bookVersion;

	/** 
	* 目录，不支持HTML代码，长度限制为8000
	 */
	private String catalog;

	/** 
	* 类目id
	 */
	private Long categoryId;

	/** 
	* 中图分类号，英文字母加数字组成
	 */
	private String chinaClassifyNo;

	/** 
	* cip数据编号，真实格式：（XXX）第***号，
导入时，格式为XXX-***
	 */
	private String cip;

	/** 
	* 点评者，只写一个人的名字，超出的以“等”结束
	 */
	private String commentator;

	/** 
	* 用户自己的Id号
	 */
	private String customId;

	/** 
	* 图书名称(正副书名)
	 */
	private String deputyName;

	/** 
	* 绘图者，只写一个人的名字，超出的以“等”结束
	 */
	private String drawor;

	/** 
	* 编者，只写一个人的名字，超出的以“等”结束
	 */
	private String editor;

	/** 
	* 摄影者，只写一个人的名字，超出的以“等”结束
	 */
	private String graphor;

	/** 
	* 上传图片，图片上传使用byte[]类型
	 */
	private FileItem image;

	/** 
	* 不带‘-’的图书ISBN号
1. 位数限定：10位 末尾校验,7开头
2. 位数限定：13位、开头数字限定： 9787开头
	 */
	private String isbn;

	/** 
	* 这条记录对应的淘宝的Ids
	 */
	private String itemIds;

	/** 
	* 口述者，只写一个人的名字，超出的以“等”结束
	 */
	private String narrator;

	/** 
	* 分册名
	 */
	private String partName;

	/** 
	* 分册号
	 */
	private Long partNo;

	/** 
	* 策划者，只写一个人的名字，超出的以“等”结束
	 */
	private String plottor;

	/** 
	* 价格支持整数和小数，小数保留小数点后两位，若有多个价格，价格之间通过','号分隔
	 */
	private String price;

	/** 
	* 出版社名称
	 */
	private String publishCompany;

	/** 
	* 出版时间，格式必须注意：年份/月份
	 */
	private String publishYm;

	/** 
	* 年号，必须是完整的年份，如：2013，当输入的值不是四位或者首位大于2时，调接口失败
	 */
	private String reginYear;

	/** 
	* 注释者，只写一个人的名字，超出的以“等”结束
	 */
	private String scholisat;

	/** 
	* 丛书名
	 */
	private String seriesBooksName;

	/** 
	* 简介，不支持HTML代码，长度不能超过5000
	 */
	private String summary;

	/** 
	* 译者，只写一个人的名字，超出的以“等”结束
	 */
	private String translator;

	public void setAbstractMsg(String abstractMsg) {
		this.abstractMsg = abstractMsg;
	}

	public String getAbstractMsg() {
		return this.abstractMsg;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthorArea(String authorArea) {
		this.authorArea = authorArea;
	}

	public String getAuthorArea() {
		return this.authorArea;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBookBind(String bookBind) {
		this.bookBind = bookBind;
	}

	public String getBookBind() {
		return this.bookBind;
	}

	public void setBookSize(Long bookSize) {
		this.bookSize = bookSize;
	}

	public Long getBookSize() {
		return this.bookSize;
	}

	public void setBookVersion(Long bookVersion) {
		this.bookVersion = bookVersion;
	}

	public Long getBookVersion() {
		return this.bookVersion;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getCatalog() {
		return this.catalog;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setChinaClassifyNo(String chinaClassifyNo) {
		this.chinaClassifyNo = chinaClassifyNo;
	}

	public String getChinaClassifyNo() {
		return this.chinaClassifyNo;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getCip() {
		return this.cip;
	}

	public void setCommentator(String commentator) {
		this.commentator = commentator;
	}

	public String getCommentator() {
		return this.commentator;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setDeputyName(String deputyName) {
		this.deputyName = deputyName;
	}

	public String getDeputyName() {
		return this.deputyName;
	}

	public void setDrawor(String drawor) {
		this.drawor = drawor;
	}

	public String getDrawor() {
		return this.drawor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getEditor() {
		return this.editor;
	}

	public void setGraphor(String graphor) {
		this.graphor = graphor;
	}

	public String getGraphor() {
		return this.graphor;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

	public String getNarrator() {
		return this.narrator;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartNo(Long partNo) {
		this.partNo = partNo;
	}

	public Long getPartNo() {
		return this.partNo;
	}

	public void setPlottor(String plottor) {
		this.plottor = plottor;
	}

	public String getPlottor() {
		return this.plottor;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPublishCompany(String publishCompany) {
		this.publishCompany = publishCompany;
	}

	public String getPublishCompany() {
		return this.publishCompany;
	}

	public void setPublishYm(String publishYm) {
		this.publishYm = publishYm;
	}

	public String getPublishYm() {
		return this.publishYm;
	}

	public void setReginYear(String reginYear) {
		this.reginYear = reginYear;
	}

	public String getReginYear() {
		return this.reginYear;
	}

	public void setScholisat(String scholisat) {
		this.scholisat = scholisat;
	}

	public String getScholisat() {
		return this.scholisat;
	}

	public void setSeriesBooksName(String seriesBooksName) {
		this.seriesBooksName = seriesBooksName;
	}

	public String getSeriesBooksName() {
		return this.seriesBooksName;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getTranslator() {
		return this.translator;
	}

	public String getApiMethodName() {
		return "tmall.product.books.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("abstract_msg", this.abstractMsg);
		txtParams.put("app_info", this.appInfo);
		txtParams.put("author", this.author);
		txtParams.put("author_area", this.authorArea);
		txtParams.put("bar_code", this.barCode);
		txtParams.put("book_bind", this.bookBind);
		txtParams.put("book_size", this.bookSize);
		txtParams.put("book_version", this.bookVersion);
		txtParams.put("catalog", this.catalog);
		txtParams.put("category_id", this.categoryId);
		txtParams.put("china_classify_no", this.chinaClassifyNo);
		txtParams.put("cip", this.cip);
		txtParams.put("commentator", this.commentator);
		txtParams.put("custom_id", this.customId);
		txtParams.put("deputy_name", this.deputyName);
		txtParams.put("drawor", this.drawor);
		txtParams.put("editor", this.editor);
		txtParams.put("graphor", this.graphor);
		txtParams.put("isbn", this.isbn);
		txtParams.put("item_ids", this.itemIds);
		txtParams.put("narrator", this.narrator);
		txtParams.put("part_name", this.partName);
		txtParams.put("part_no", this.partNo);
		txtParams.put("plottor", this.plottor);
		txtParams.put("price", this.price);
		txtParams.put("publish_company", this.publishCompany);
		txtParams.put("publish_ym", this.publishYm);
		txtParams.put("regin_year", this.reginYear);
		txtParams.put("scholisat", this.scholisat);
		txtParams.put("series_books_name", this.seriesBooksName);
		txtParams.put("summary", this.summary);
		txtParams.put("translator", this.translator);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductBooksAddResponse> getResponseClass() {
		return TmallProductBooksAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(appInfo, "appInfo");
		RequestCheckUtils.checkMaxLength(appInfo, 40, "appInfo");
		RequestCheckUtils.checkNotEmpty(author, "author");
		RequestCheckUtils.checkMaxLength(author, 80, "author");
		RequestCheckUtils.checkMaxLength(authorArea, 80, "authorArea");
		RequestCheckUtils.checkNotEmpty(barCode, "barCode");
		RequestCheckUtils.checkMaxLength(barCode, 20, "barCode");
		RequestCheckUtils.checkNotEmpty(bookBind, "bookBind");
		RequestCheckUtils.checkMaxLength(bookBind, 10, "bookBind");
		RequestCheckUtils.checkMaxLength(catalog, 8000, "catalog");
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkMaxLength(chinaClassifyNo, 30, "chinaClassifyNo");
		RequestCheckUtils.checkMaxLength(cip, 50, "cip");
		RequestCheckUtils.checkMaxLength(commentator, 40, "commentator");
		RequestCheckUtils.checkNotEmpty(customId, "customId");
		RequestCheckUtils.checkNotEmpty(deputyName, "deputyName");
		RequestCheckUtils.checkMaxLength(deputyName, 150, "deputyName");
		RequestCheckUtils.checkMaxLength(drawor, 40, "drawor");
		RequestCheckUtils.checkMaxLength(editor, 40, "editor");
		RequestCheckUtils.checkMaxLength(graphor, 40, "graphor");
		RequestCheckUtils.checkNotEmpty(isbn, "isbn");
		RequestCheckUtils.checkMaxLength(isbn, 13, "isbn");
		RequestCheckUtils.checkMaxLength(narrator, 40, "narrator");
		RequestCheckUtils.checkMaxLength(partName, 150, "partName");
		RequestCheckUtils.checkMaxLength(plottor, 40, "plottor");
		RequestCheckUtils.checkNotEmpty(price, "price");
		RequestCheckUtils.checkMaxLength(price, 40, "price");
		RequestCheckUtils.checkMaxLength(publishCompany, 80, "publishCompany");
		RequestCheckUtils.checkMaxLength(reginYear, 10, "reginYear");
		RequestCheckUtils.checkMaxLength(scholisat, 40, "scholisat");
		RequestCheckUtils.checkMaxLength(seriesBooksName, 150, "seriesBooksName");
		RequestCheckUtils.checkMaxLength(summary, 5000, "summary");
		RequestCheckUtils.checkMaxLength(translator, 40, "translator");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}