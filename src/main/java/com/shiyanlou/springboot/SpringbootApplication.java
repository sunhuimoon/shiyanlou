package com.shiyanlou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringbootApplication {
    @Configuration
    static class WebConfig implements WebMvcConfigurer{
        //重写addResourcreHandlers方法
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            //设置静态资源映射路径为/**，资源位置为类路径下的upload
            /**
             "classpath:/upload/"   后面少写了有一个/，哎哎哎
             */
            registry.addResourceHandler("/**").addResourceLocations("classpath:/upload/");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
