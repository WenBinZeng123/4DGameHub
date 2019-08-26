package com.cssl.pojo;

import java.io.Serializable;

public class Page implements Serializable {
	private int pageNow=1; //��ǰҳ��
	private int pagesize=4;//ÿҳ��ʾ��¼������
	private int totalCount;//�ܵļ�¼����
	private int totalPageCount;//�ܵ�ҳ��
	@SuppressWarnings("unused")
	private int startPos;//��ʼλ��,��0��ʼ
	@SuppressWarnings("unused")
	private boolean hasFirst;//�Ƿ�����ҳ
	@SuppressWarnings("unused")
	private boolean hasPre;//�Ƿ���ǰһҳ
	@SuppressWarnings("unused")
	private boolean hasLast;//�Ƿ������һҳ
	@SuppressWarnings("unused")
	private boolean hasNext;//�Ƿ�����һҳ
	
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
	 * �Ƿ�����ҳ
	 */
	public boolean isHasPre() {
		return isHasFirst()?false:true;
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	/*
	 * �Ƿ�����һҳ
	 */
	public boolean isHasNext() {
		return isHasLast()?true:false;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	/*
	 * �Ƿ���βҳ
	 */
	public boolean isHasLast() {
		return (pageNow==getTotalPageCount()?false:true);
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
	
	
	

}
