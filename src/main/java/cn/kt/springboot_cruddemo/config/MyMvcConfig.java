package cn.kt.springboot_cruddemo.config;/*
 *Created by tao on 2020-05-14.
 */

/*
 * 使用WebMvcConfigurer来扩展springMVC的功能*/

import cn.kt.springboot_cruddemo.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
在Spring 5.0 中，已经将 WebMvcConfigurerAdapter 抽象类加上 @Deprecated 注解 记为过时。
* extends WebMvcConfigurerAdapter  替换为 implements WebMvcConfigurer 即可
* */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("main");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/webjars/**",
                                "/login.html", "/",
                                "/user/login",
                                "/asserts/**");
            }
        };
        return adapter;
    }

}