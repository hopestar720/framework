package com.xhsoft.framework.base.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;
import com.xhsoft.framework.base.entity.AbstractEntity;

public class BaseAction<T extends AbstractEntity> extends ActionSupport
		implements Preparable, ModelDriven<T> {

	/** serialVersionUID */
	private static final long serialVersionUID = 9095550571913707891L;
	
	private static final Log logger = LogFactory.getLog(BaseAction.class);

	@Override
	public T getModel() {
		return null;
	}

	@Override
	public void prepare() throws Exception {
	}
	
	/**
	 * 获取HttpServletRequest对象
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	
	/**
	 * 获取HttpServletResponse对象
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	/**
	 * 获取或创建HttpSession对象
	 * @param create
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected HttpSession getSession(boolean...create){
		boolean cr = false;
		if(create.length > 0){
			cr = create[0];
		}
		return ServletActionContext.getRequest().getSession(cr);
	}
	
	/**
	 * 获取Sesson属性
	 * @param name
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected Object getSessionAttr(String name){
		return getSession().getAttribute(name);
	}
	
	/**
	 * 设置Session属性
	 * @param name
	 * @param value 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected void setSessionAttr(String name,String value){
		getSession().setAttribute(name, value);
	}
	
	/**
	 * 删除Session属性
	 * @param name 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected void removeSessionAttr(String name){
		getSession().removeAttribute(name);
	}
	
	/**
	 * 获取值栈信息
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected ValueStack getValueStack(){
		ActionContext ac = ActionContext.getContext();
		return ac.getValueStack();
	}
	
	/**
	 * 获取URL绝对路径
	 * @param url
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	protected String getRealPath(String url){
		return ServletActionContext.getServletContext().getRealPath(url);
	}

}
