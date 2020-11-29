package com.chatwindow.config;

import javax.servlet.http.HttpServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.chatwindow.servlets.ImageServlet;
import com.chatwindow.servlets.StateServlet;

@Configuration
public class WebConfig {
    @Bean
    public ServletRegistrationBean<HttpServlet> countryServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new ImageServlet());
        servRegBean.addUrlMappings("/country/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
    @Bean
    public ServletRegistrationBean<HttpServlet> stateServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new StateServlet());
        servRegBean.addUrlMappings("/state/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}