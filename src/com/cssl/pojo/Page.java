package com.cssl.pojo;

import java.io.Serializable;

public class Page implements Serializable {
	private int pageNow=1; //当前页数
	private int pagesize=4;//每页显示记录的条数
	private int totalCount;//总的记录条数
	private int totalPageCount;//总的页数
	@SuppressWarnings("unused")
	private int startPos;//开始位置,从0开始
	@SuppressWarnings("unused")
	private boolean hasFirst;//是否有首页
	@SuppressWarnings("unused")
	private boolean hasPre;//是否有前一页
	@SuppressWarnings("unused")
	private boolean hasLast;//是否有最后一页
	@SuppressWarnings("unused")
	private boolean hasNext;//是否有下一页
	
	public Page(int pageNow, int totalCount) {
		super();
		this.pageNow = pageNow;
		this.totalCount = totalCount;
	}
	

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPageCount() {
		totalPageCount=getTotalCount()/getPagesize();
		return (totalCount % pagesize == 0) ? totalPageCount 
		        : totalPageCount + 1; 
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getStartPos() {
		return (pageNow-1)*pagesize;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public boolean isHasFirst() {
		return (pageNow==1)? true:false;
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}
	/*
	 * 是否有首页
	 */
	public boolean isHasPre() {
		return isHasFirst()?false:true;
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	/*
	 * 是否有下一页
	 */
	public boolean isHasNext() {
		return isHasLast()?true:false;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	/*
	 * 是否有尾页
	 */
	public boolean isHasLast() {
		return (pageNow==getTotalPageCount()?false:true);
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
	
	
	

}
