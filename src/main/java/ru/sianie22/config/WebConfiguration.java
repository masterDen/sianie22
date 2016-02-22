package ru.sianie22.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * author: Denis Grigorichev
 * Created at: 18.02.16
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ru.sianie22.web")
public class WebConfiguration extends WebMvcConfigurerAdapter {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/resources/fonts/");
    }


    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/pages/");
        bean.setSuffix(".jsp");
        return bean;
    }
}
