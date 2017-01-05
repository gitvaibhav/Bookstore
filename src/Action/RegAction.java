package Action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import Action.ActionBase.ActionBase;
import Beans.User.User;
import Dao.HibernateUtil.HibernateUtil;
import Dao.UserDao.imp.UserDaoHibernate;
import DataWrapper.UserWrapper;
/**
 * 文件名：RegAction.java 该文件是用来处理用户注册的相关业务。
 * 
 * All right Rserved liqx2012
 * 
 * @author 李青鑫 E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-16 下午03:49:56
 * @since jdk1.6 类说明
 */
public class RegAction extends UserWrapper implements ActionBase {
	// 这个是用户注册是的确认密码
	private String confirm = null;

	/**
	 * @return the confirm
	 */
	public String getConfirm() {
		return confirm;
	}

	/**
	 * @param confir
	 *            the confirm to set
	 */
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	/**
	 * 首先判断用户名是否可用，如果可用则可以将该用户的信息写入到数据库中。 否则提示相关的信息。
	 * 
	 * @return 如果用户注册成功，将会跳转到home.html 页面（主页面），并实现用户自动登录（使用刚刚注册的用户名）
	 */
	public String execute() {
		UserDaoHibernate uDao = new UserDaoHibernate();
		//首先查询数据库，验证用户名是否已经被注册
		User u = uDao.findByName(getUserName());
		if(null != u ){
			//显示错误信息提示客户该用户名已经被使用，更换其他的用户名
			as.addFieldError("nameErr","用户名已经被使用");
		}else{
			//说明该可用户名可以使用，接着是检验用户输入两次密码是否匹配，如果不匹配
			//则也提示相关的错误信息：提示用户输入两次密码不匹配
			if(getPwd() != getConfirm()){
				as.addFieldError("pwdErr","两次输入的密码不匹配");
			}
			//将数据保存到数据库中
			uDao.addUser(wrapper());
			//用户自动登录的实现，也就是将用户名输出到主页上。
			ActionContext.getContext().put("user",getUserName());
		}
		return SUCCESS;
	}
}
