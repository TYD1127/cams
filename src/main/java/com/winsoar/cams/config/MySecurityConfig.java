package com.winsoar.cams.config;

import com.winsoar.cams.utils.JWTAuthenticationFilter;
import com.winsoar.cams.utils.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author TangYaD
 * @Date 2020/12/28 0:08
 * @Version 1.0
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    UserDetailsService customUserService() { // 注册UserDetailsService 的bean
        return new UserDetailsServiceImpl();
    }

    public static final String[] AUTH_WHITELIST = {
            "/login",
            "/",
            "/mlogin",
            "/gologin",
            "/mregister",
            "/toLogin",
            "/favicon.ico" // other public endpoints of your API may be appended to this array
    };

    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //认证
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        //调用DetailsService完成用户身份验证              设置密码加密方式
        auth.userDetailsService(customUserService()).passwordEncoder(getBCryptPasswordEncoder());
    }

    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 禁用 csrf, 由于使用的是JWT，我们这里不需要csrf
        http.cors().and().csrf().disable()
                .authorizeRequests()
                // 跨域预检请求
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                // 登录URL不需要认证
                .antMatchers("/login").permitAll()
                .antMatchers("/mlogin").permitAll()
                .antMatchers("/toLogin").permitAll()
                .antMatchers("/").permitAll()
                // 其他所有请求需要身份认证
                .anyRequest().authenticated().and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()));
        // 退出登录处理器
        http.headers().frameOptions().sameOrigin();// 解决IFrame拒绝的问题
        http.logout()
                .logoutSuccessUrl("/")
                .deleteCookies("Authorization");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/h-ui/**", "/js/**");
    }
}

