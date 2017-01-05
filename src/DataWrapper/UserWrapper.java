package DataWrapper; 

import Beans.User.User;

/** 
 * 文件名：UserWrapper.java
 * All right Rserved liqx2012
 * 数据封装器，将提供user的信息，输出将是一个封装好了的user对象
 * 
 * @author 李青鑫  E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-16 下午09:10:36 
 * @since jdk1.6
 * 类说明 
 */
public class UserWrapper extends User{
public User wrapper(){
	User u = new User();
	
	u.setId(0);//id默认设置为0，因为数据库为自动进行id编码
	u.setUserName(getUserName());
	u.setPwd(getPwd());
	u.setAddress(getAddress());
	u.setZip_code(getZip_code());
	u.setRealName(getRealName());
	u.setPhone(getPhone());
	u.setEmail(getEmail());
	System.out.println("wrapper"+getUserName()+getPwd()+getEmail()+getPhone()+getRealName()+getAddress()+getZip_code());
	return u;
}
}
 
