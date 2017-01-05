package Beans.Order; 

import java.util.Date;

import Beans.Item.Item;
import Beans.User.User;

/** 
 * 文件名：Item.java
 * All right Rserved liqx2012
 * 
 * 封装订单Bean，其目的是方便页面的操作，与数据库交互。
 * @author 李青鑫  E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-17 上午10:04:10 
 * @since jdk1.6
 * 类说明 
 */
public class Order {
	//订单id
	int oID;
	//下单时间
	Date oDate;
	//付款方式
	String oPay;
	//送货方式
	String oSend;
	
	//将订单与用户关联起来，其关系是：多（订单）对一(用户)
	User oUser;
	//订单与条目关联起来，其关系是：多（）对一（条目）关系
	Item oItem;
	public int getoID() {
		return oID;
	}

	public void setoID(int oID) {
		this.oID = oID;
	}

	public Date getoDate() {
		return oDate;
	}

	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}

	public String getoPay() {
		return oPay;
	}

	public void setoPay(String oPay) {
		this.oPay = oPay;
	}

	public String getoSend() {
		return oSend;
	}

	public void setoSend(String oSend) {
		this.oSend = oSend;
	}

	public User getoUser() {
		return oUser;
	}

	public void setoUser(User oUser) {
		this.oUser = oUser;
	}

	public Item getoItem() {
		return oItem;
	}

	public void setoItem(Item oItem) {
		this.oItem = oItem;
	}
	
}
 
