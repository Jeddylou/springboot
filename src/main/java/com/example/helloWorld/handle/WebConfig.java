package com.example.helloWorld.handle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：louzhengjie
 * @date ：Created in 2020/11/19 3:54 下午
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private RepeatSubmitInterceptor repeatSubmitInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        final String[] commonExclude = {"/error", "/files/**"};
        registry.addInterceptor(repeatSubmitInterceptor).excludePathPatterns(commonExclude);
    }
}
