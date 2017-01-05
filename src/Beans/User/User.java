/**
 * 
 *Copyright {year} whut,All right Reservered
 *@version 1.0,2012-2012-3-10
 *@author  ÀîÇàöÎ
 *@since jdk1.6
 */ 
package Beans.User; 

import Beans.Order.Order;

/** 
 * 文件名：User.java
 * All right Rserved liqx2012
 * @author 李青鑫   E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-4 上午10:10:25 
 * @since jdk1.6
 * 封装了用户的信息包括：用户名，密码和用户ID该ID是为数据库映射而准备。
 * 另外User表与UserDetail表示一一对应关系，也就是说一个user在UserDetail表中必须有一条相关的记录。
 */

public class User {
	private int id;
	//用户的登录名称，不是用户的真实姓名
	private String userName;
	private String pwd;
	private String realName;
	private String address;
	private String zip_code;
	private String phone;
	private String email;
	//用户与订单的映射关系一对多的
	Order order;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the zip_code
	 */
	public String getZip_code() {
		return zip_code;
	}
	/**
	 * @param zipCode the zip_code to set
	 */
	public void setZip_code(String zipCode) {
		zip_code = zipCode;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
 
