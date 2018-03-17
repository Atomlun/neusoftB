package com.utils;

import java.util.List;

public class PageUtil<E> {
	private int pageNum;// 页码，当前第几页
	private int pageSize;// 每页显示数
	private int totalPage;// 总页数
	private int totalRecord;// 数据总条数
	private int start;// 总共能显示的页数，给用户点击的
	private int end;// 显示的尾页数
	private List<E> list;// 存储的页面显示数据集合
	private int startIndex;

	public PageUtil(int pageNum, int pageSize, int totalRecord) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		if (totalRecord % pageSize == 0) {
			this.totalPage = totalRecord / pageSize;
		} else {
			this.totalPage = totalRecord / pageSize + 1;
		}
		this.startIndex = (pageNum - 1) * pageSize;
		this.start = 1;
		this.end = 5;
		//显示的页数的算法
		if(totalPage <= 5){
			this.end = this.totalPage;
		}else{
			this.start = pageNum -2;
			this.end = pageNum +2;
			if(start < 0){
				this.start = 1;
				this.end = 5;
			}
			if(end > totalPage){
				this.start = totalPage -5;
				this.end = totalPage;
			}
		}
		
		
		
		
		
		
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

}

