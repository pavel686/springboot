package com.cblue.springcloud.demo08.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Component
@WebFilter(filterName = "myFilter02", urlPatterns = "/*")
@Order(1)
public class Filter01 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。。111");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //这句话必须加，形成一个过滤器链
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("执行过滤操作。。。111");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁。。。111");

    }
}
