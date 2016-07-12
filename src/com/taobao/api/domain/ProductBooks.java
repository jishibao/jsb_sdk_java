package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 图书类目导入返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ProductBooks extends TaobaoObject {

	private static final long serialVersionUID = 4446227941342112387L;

	/**
	 * 作者/著者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 条形码，13位，9787开头
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 完整的图书名称
	 */
	@ApiField("book_name")
	private String bookName;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ISBN号
	 */
	@ApiField("isbn")
	private String isbn;

	/**
	 * 图书价格，若有多个，则以';'号分隔
	 */
	@ApiField("price")
	private String price;


	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBookName() {
		return this.bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
