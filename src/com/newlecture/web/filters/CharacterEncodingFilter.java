package com.newlecture.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		//얘는 요청이 올때 하는것
		
		chain.doFilter(request, response);
		//chain은 필터의 필터를 사용할 수 있게 하는 것
		
		//갈때 하는것은?
		//response.getWriter().println("SSSSS");
	}
	//어떠한 요청이 있어도 doFilter를 거쳐서 실행됨
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
