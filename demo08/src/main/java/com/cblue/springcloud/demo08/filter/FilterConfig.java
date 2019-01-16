package com.cblue.springcloud.demo08.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean registerKeywordHandleFilter() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean();

        Filter03 myFilter03 = new Filter03();

        // 设置过滤器名称, 执行顺序, 拦截url
        String filterName = myFilter03.getClass().getSimpleName();
        int order = 3;
        List<String> urlPatterns = new ArrayList<>(1);
        urlPatterns.add("/*");

        filterBean.setFilter(myFilter03);
        filterBean.setName(filterName);
        filterBean.setOrder(order);
        filterBean.setUrlPatterns(urlPatterns);


        return filterBean;
    }


}
