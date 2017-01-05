package Dao.UserDao; 

import java.util.List;

import Beans.User.User;

/** 
 * 文件名：UserDao.java
 * All right Rserved liqx2012
 * @author 李青鑫   E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-3 下午04:04:36 
 * @since jdk1.6
 * 封装User类的基本操作，包括增加新的用户（用于用户注册），删除，更新用户相关信息，以及查找等。
 */
public interface UserDao {
		public void addUser(User user);
		public void delByID(int id);
		public void delByName(String name);
		public void update();
		public User findByID(int id);
		public User findByName(String name);
		public List<User> login(User user);
}
 
