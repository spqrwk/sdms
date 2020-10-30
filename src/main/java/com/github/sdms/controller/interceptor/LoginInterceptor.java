package com.github.sdms.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.sdms.util.NoPermissionException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



/**
 * 登录拦截器
 * @author Charles7c
 * @date 2020年10月19日 上午11:45:15
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	// 后置拦截
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	// 处理拦截
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	// 前置拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("loginUser");
		if (obj == null) {
			throw new NoPermissionException("用户未登录！");
		}
		return true;
	}

}
