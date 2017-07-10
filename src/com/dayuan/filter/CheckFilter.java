package com.dayuan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CheckFilter
 */
@WebFilter("/CheckFilter")
public class CheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		HttpSession session=req.getSession();
		Object obj=session.getAttribute("cardNo");
		
		if(req.getRequestURI().endsWith("check_balance.do")
				|| req.getRequestURI().endsWith("backHomepage.do")
				|| req.getRequestURI().endsWith("take_money.do")
				||req.getRequestURI().endsWith("save_money.do")
				||req.getRequestURI().endsWith("transfer.do")
				||req.getRequestURI().endsWith("SaveMoneyActionServlet")
				||req.getRequestURI().endsWith("不用过滤重新登录LoginBackServlet")
				||req.getRequestURI().endsWith("TakeMoneyServlet")
				||req.getRequestURI().endsWith("不用过滤登录Servlet")) {
			if(obj==null){
				resp.sendRedirect("login.jsp");
			}
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
