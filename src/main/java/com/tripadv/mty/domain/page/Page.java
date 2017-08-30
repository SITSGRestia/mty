package com.tripadv.mty.domain.page;
/*
 * ��ҳ��
 * 
 * */
public class Page {
	private int currentPage=1;//��ǰҳ
	private int pageSize;//ÿҳ��ʾ��¼��

	private int records;//�ܼ�¼��
	private int maxPage;//���ҳ��



	private int nextPage;//��һҳ
	private int prePage;//��һҳ
	
	private int begin;//mysql���ݿ��ҳ���

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}
    //ֻ������ �������ҳ��
	public int getMaxPage() {
		return records % pageSize == 0 ? records / pageSize : records / pageSize + 1;
	}
	//ֻ������ ������һҳ
	public int getNextPage() {
		if (currentPage == this.getMaxPage()) {
			return this.getMaxPage();
		}
		return currentPage + 1;
	}
	//ֻ������ ������һҳ
	public int getPrePage() {
		if (currentPage == 1) {
			return 1;
		}
		return currentPage - 1;
	}

	//����mysql���ݿ��ҳ���
	public int getBegin() {
		return (currentPage-1)*pageSize;
	}
}
