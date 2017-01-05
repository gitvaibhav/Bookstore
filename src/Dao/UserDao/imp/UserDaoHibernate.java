package Dao.UserDao.imp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Beans.User.User;
import Dao.HibernateUtil.HibernateUtil;
import Dao.UserDao.UserDao;

/**
 * 文件名：UserDaoHibernate.java All right Rserved liqx2012
 * 
 * @author 李青鑫 E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-10 下午04:04:23
 * @since jdk1.6 对UserDao的实现
 */
public class UserDaoHibernate implements UserDao {

	private Session ses;

	private static Logger log = LoggerFactory.getLogger(UserDaoHibernate.class);
	//HibernateUtil hUtil = new HibernateUtil();

	/**
	 * 将新的用户的注册信息写入到数据库中，注意因为数据库中要求User.userName 等字节为非空的或者是唯一的
	 * 所以user的信息必须是合法的，否则书库将抛出异常
	 * 
	 * @param user
	 *            需要添加的新的用户。
	 */
	public void addUser(User user) {
		ses =HibernateUtil.getSession();
		Transaction tc = ses.beginTransaction();log.info("save--------------------save");log.debug("save--------------------save");
		try {
			// 写入到数据库
			ses.save(user);
			// 提交事务
			tc.commit();
		} catch (HibernateException he) {
			log.info(he.getMessage());
			// 回滚以确保数据的一致性。
			tc.rollback();
		} finally {
			ses.close();
		}

	}

	public void delByID(int id) {
		// TODO Auto-generated method stub

	}

	public void delByName(String name) {
		// TODO Auto-generated method stub

	}

	/**
	 * 根据指定的id来查询用户并返回用户的相关信息（如果存在），如果不存在用户则会返回null。
	 * 
	 * @param id
	 *            需要查询的用户的id
	 * @return user的相关信息：当数据库中存在相关的用户信息。 null 数据库中不存在该用户的相关信息，或者是数据库异常。
	 */
	public User findByID(int id) {
		User u = null;
		try {
			ses =HibernateUtil.getSession();
			u = (User) ses.get(User.class, id);
		} catch (HibernateException he) {
			log.info(he.getMessage());
		} finally {
			ses.flush();//清除缓存
			ses.close();
			return u;
		}
	}

	/**
	 * 根据用户指定的用户名来查询数据库，如果用户<code>name</code>在数据库中已经存在，并且数据库
	 * 操作过程中没有异常，那么将会返回该用户的相关信息。否则返回null。
	 * 
	 * @param name
	 *            需要查询的用户名
	 * @return user 当数据库中存在该用户时 null 当数据库中不存在（表明该用户还未注册）， 或者是数据库操作异常。
	 */
	public User findByName(String name) {
		User u = null;
		try {
			ses =HibernateUtil.getSession();
			u = (User) ses.get(User.class, name);
		} catch (HibernateException he) {
			log.info(he.getMessage());
		} finally {
			// 这一句主要是防止当数据库操作异常的情况下用来关闭session。
			ses.close();
			return u;
		}
	}

	public void update() {
		// TODO Auto-generated method stub
	}

	/**
	 * 用户用户登录，如果数据库中存在User.userName并且User.pwd 是正确的， 那么将会返回User，否则返回null。
	 * 
	 * @param user
	 *            需要查询的用户这里只是使用两个属性一个是用户名：userName 另外一个是pwd,其他的属性在这里不使用。
	 * @return 当数据库中存在该用户，并且明码正确的话，将会返回User 对象； 当数据库中不存在或者用户输入的密码不正确，那么将会返回null;
	 */
	public List<User> login(User user) {
		List<User> u = null;
		String hql = "From User as u where u.userName=? and u.pwd=?";
		try {
			ses =HibernateUtil.getSession();
			Query query = ses.createQuery(hql);
			//设置hql 的userName 值
			query.setString(0, user.getUserName());
			//设置hql中的pwd值
			query.setString(1, user.getPwd());
			//查询数据库，获取数据列表
			u = query.list();
		} catch (HibernateException he) {
			log.info(he.getMessage());
		} finally {
			//这里关闭session是因为防止数据库操作时发生异常时try中的ses.close()不能正常执行。
			ses.close();
			return u;
		}
	}

}
