package Beans.Kind; 

import Beans.Book.Book;

/** 
 * 文件名：Kind.java
 * All right Rserved liqx2012
 * 
 * 用户封装图书类型的Bean。
 * @author 李青鑫   E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-17 上午09:25:10 
 * @since jdk1.6
 * 类说明 
 */
public class Kind {
	//图书的类型ID
	int kID;
	//图书类型名称
	String kName;
	//图书类型的描述
	String kDes;
	
	//与图书相关联他们之间的关系是：一（类别）对多（书）
	Book kBook;
	/**
	 * @return the kID
	 */
	public int getkID() {
		return kID;
	}
	/**
	 * @param kID the kID to set
	 */
	public void setkID(int kID) {
		this.kID = kID;
	}
	/**
	 * @return the kName
	 */
	public String getkName() {
		return kName;
	}
	/**
	 * @param kName the kName to set
	 */
	public void setkName(String kName) {
		this.kName = kName;
	}
	/**
	 * @return the kDes
	 */
	public String getkDes() {
		return kDes;
	}
	/**
	 * @param kDes the kDes to set
	 */
	public void setkDes(String kDes) {
		this.kDes = kDes;
	}
	public Book getkBook() {
		return kBook;
	}
	public void setkBook(Book kBook) {
		this.kBook = kBook;
	}
	
}
 
