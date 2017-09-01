package com.tripadv.mty.domain.page;
<<<<<<< HEAD
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
=======

/**
 * 分页类
 */
public class Page {
    private int currentPage = 1;  //当前页
    private int pageSize;  //每页显示记录数

    private int records;  //总记录数
    private int maxPage;  //最大页数

    private int nextPage;  //下一页
    private int prePage;   //上一页

    private int begin;    //mysql数据库分页起点

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

    //只读属性 计算最大页数
    public int getMaxPage() {
        return records % pageSize == 0 ? records / pageSize : records / pageSize +1;
    }


    //只读属性 计算下一页
    public int getNextPage() {
        if(currentPage == this.getMaxPage()){
            return this.getMaxPage();
        }
        return currentPage + 1;
    }

    //只读属性 计算上一页
    public int getPrePage() {
        if(currentPage == 1){
            return 1;
        }
        return currentPage - 1;
    }

    //计算mysql数据库分页的起点
    public int getBegin() {
        return (currentPage-1) * pageSize;
    }



>>>>>>> origin/lijinhui
}
