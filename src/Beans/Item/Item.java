package Beans.Item; 

import Beans.Book.Book;
import Beans.Order.Order;

/** 
 * 文件名：Item.java
 * All right Rserved liqx2012
 * 
 * 订单条目,另外该条目与订单是多对一的关系；条目与图书是一一对应关系。
 * 
 * @author 邓超  E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-17 上午10:24:20 
 * @since jdk1.6
 * 类说明 
 */
public class Item {
	//条目
	int id;
	// 该条目对应的总的价格（单价*数量）
	float iCost;
	// 该条目对应的图书的购买数量
	int iNum;
	
	//与图书关联，是一（条目）对多（书）对应关系
	Book iBook;
	//与订单是多（订单条目）对一(订单)的关系
	Order iOrder;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getiCost() {
		return iCost;
	}
	public void setiCost(float iCost) {
		this.iCost = iCost;
	}
	public Book getiBook() {
		return iBook;
	}
	public void setiBook(Book iBook) {
		this.iBook = iBook;
	}
	public int getiNum() {
		return iNum;
	}
	public void setiNum(int iNum) {
		this.iNum = iNum;
	}
	public Order getiOrder() {
		return iOrder;
	}
	public void setiOrder(Order iOrder) {
		this.iOrder = iOrder;
	}
	
	
}
 
