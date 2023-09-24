package com.xiangyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan({"com.xiangyin.controller","com.xiangyin.exceptionhandler"})
@EnableWebMvc
public class WebMVCJavaConfig implements WebMvcConfigurer {
    //二秘书
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/","jsp");
    }
    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
