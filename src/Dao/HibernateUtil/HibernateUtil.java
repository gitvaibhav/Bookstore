package Dao.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 文件名：HibernateUtil.java All right Rserved liqx2012
 * 
 * @author 李青鑫 E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-4 下午08:39:59
 * @since jdk1.6 该类中首先是获取hibernate的配置文件信息，这是一个工具类。
 */
public class HibernateUtil {
	private static SessionFactory sf;
	private static Configuration cf;
	 static {
	 cf = new Configuration();
	 //读取配置文件获取数据库的相关配置信息。
	 sf = cf.configure().buildSessionFactory();
	 }
//	public HibernateUtil() {
//		cf = new Configuration();
//		// 读取配置文件获取数据库的相关配置信息。
//		sf = cf.configure().buildSessionFactory();
//	}

	public static Session getSession() {
		return sf.openSession();
	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
