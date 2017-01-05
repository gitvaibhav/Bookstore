package Beans.Book; 

import java.util.Date;

import Beans.Item.Item;
import Beans.Kind.Kind;

/** 
 * 文件名：Book.java
 * All right Rserved liqx2012
 * 
 * 图书Bean用户封装图书的各类信息：比如：名称，单价，作者等。
 * @author 李青鑫  E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-17 上午09:39:02 
 * @since jdk1.6
 * 类说明 
 */
public class Book {
	// 图书类型ID
	int bID;
	//图书名称
	String bName;
	//单价
	float bPrice;
	//内容简介
	String bDes;
	//作者 
	String bAuth;
	//出版社
	String bEditor;
	//出版时间
	Date bPubDate;
	//图书页数
	int bPage;
	
	//将图书与图书类型关联起来是多对一的关系
	Kind bKind;
	//与Item相关联是多（book）对一（item）关系
	Item bItem;
	
	public int getbID() {
		return bID;
	}
	public void setbID(int bID) {
		this.bID = bID;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public String getbDes() {
		return bDes;
	}
	public void setbDes(String bDes) {
		this.bDes = bDes;
	}
	public String getbAuth() {
		return bAuth;
	}
	public void setbAuth(String bAuth) {
		this.bAuth = bAuth;
	}
	public String getbEditor() {
		return bEditor;
	}
	public void setbEditor(String bEditor) {
		this.bEditor = bEditor;
	}
	public Date getbPubDate() {
		return bPubDate;
	}
	public void setbPubDate(Date bPubDate) {
		this.bPubDate = bPubDate;
	}
	public int getbPage() {
		return bPage;
	}
	public void setbPage(int bPage) {
		this.bPage = bPage;
	}
	public Kind getbKind() {
		return bKind;
	}
	public void setbKind(Kind bKind) {
		this.bKind = bKind;
	}
	public Item getbItem() {
		return bItem;
	}
	public void setbItem(Item bItem) {
		this.bItem = bItem;
	}
	
	
}
 
