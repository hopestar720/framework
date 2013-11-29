package com.xhsoft.framework.base.entity;

import java.util.List;

public class PageInfo<T> {

	/** 总共记录数 */
	private int totalRows;
	/** 每次记录数 */
	private int pageSize = 10;
	/** 页码 */
	private int pageNum = 1;
	/** 页数 */
	private int totalPages;
	/** 数据集 */
	private List<T> data;
	
	/**
	 * 获取结果集首行索引
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	public int getStart(){
		return (pageNum-1)*pageSize;
	}
	
	/**
	 * 获取结果集末行索引
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	public int getEnd(){
		if(getStart()+pageSize > totalRows)
			return totalRows;
		else
			return pageNum*pageSize;
	}
	

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
}
