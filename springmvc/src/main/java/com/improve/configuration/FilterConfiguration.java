package com.improve.configuration;

import com.improve.filter.CategoriesFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean<CategoriesFilter> register()
    {
        FilterRegistrationBean<CategoriesFilter> reg=new
                FilterRegistrationBean<CategoriesFilter>();
        CategoriesFilter filter =new CategoriesFilter();
        reg.setFilter(filter);
        reg.addUrlPatterns("/categories/*");
        reg.setOrder(1);
        return reg;
    }

}
