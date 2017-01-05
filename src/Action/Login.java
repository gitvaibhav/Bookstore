package Action;

import java.util.List;

import Action.ActionBase.ActionBase;
import Beans.User.User;
import Dao.UserDao.imp.UserDaoHibernate;

import com.opensymphony.xwork2.ActionContext;

/**
 * 文件名：Login.java All right Rserved liqx2012
 * 类说明：
 * Login.action 用户用户登录，如果用户登录成功那么将返回SUCCESS,
 * 即home.html并显示用户的相关信息在该页面上。否则将返回Error以提示用户相关的错误信息。
 * 
 * @author 李青鑫 E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-10 下午04:43:12
 * @since jdk1.6 

 */
public class Login extends User implements ActionBase {
/**
 * 实现用户登录的业务，如果用户登录成功那么将会跳转到home.html页面否则将会提示相关的错误信息。
 * @return 如果用户输入的用户名密码正确则放回SUCCESS 否则将返回ERROR
 */
	public String execute() {
		UserDaoHibernate uDao = new UserDaoHibernate();
		User u = new User();
		u.setUserName(getUserName());
		u.setPwd(getPwd());
		List<User> list = uDao.login(u);
		// list 有非空则表示用户登录正确
		if (null != list && !list.isEmpty()) {
			// 下面是将用户名输出到页面以便在页面中显示用户的名，以方便用户查看当前登录的用户。
			ActionContext.getContext().getSession().put("user", getUserName());
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
