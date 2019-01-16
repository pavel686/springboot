package com.cblue.base.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;


public class MyFilter03 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。。333");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("执行过滤操作。。。333");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁。。。333");
    }
}
