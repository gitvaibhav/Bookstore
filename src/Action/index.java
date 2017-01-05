package Action;

import Action.ActionBase.ActionBase;
import com.opensymphony.xwork2.ActionContext;

/**
 * 文件名：index.java All right Rserved liqx2012
 * 
 * @author 李青鑫  E-mail: lqx0830@hotmail.com
 * @version 1.0,创建时间：2012-3-10 下午05:18:15
 * @since jdk1.6 
 * 
 * 用来跳转页面，以为struts 不能再没有action处理的情况下来访问freemarker模板。
 */
public class index implements ActionBase {
	/**
	 * 该变量是供给home.html决定显示那个页面：
	 * style = 0 表示显示的是主页面的模板就是显示图书列表，分类等信息的页面。
	 * style =1 表示显示的应该是注册页面的模板
	 */
	public int style = 0;
	/**
	 * @return the style
	 */
	public int getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(int style) {
		this.style = style;
	}
	public String execute() {
		//输出style的值到home.html好让home.html进行判断到底是该输出哪个模板
		ActionContext.getContext().put("style", getStyle()); 
		return SUCCESS;
	}
}
