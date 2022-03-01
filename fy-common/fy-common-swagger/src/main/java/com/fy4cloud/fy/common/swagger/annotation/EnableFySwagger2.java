package com.fy4cloud.fy.common.swagger.annotation;

import com.fy4cloud.fy.common.swagger.config.GatewaySwaggerAutoConfiguration;
import com.fy4cloud.fy.common.swagger.config.SwaggerAutoConfiguration;
import com.fy4cloud.fy.common.swagger.support.SwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * fy swagger 开启注解
 * @author fy
 * @date 2022/3/01
 */

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableConfigurationProperties(SwaggerProperties.class) //该注解的作用是使 SwaggerProperties 这个类上标注的 @ConfigurationProperties 注解生效,并且会自动将这个类注入到 IOC 容器中
@Import({ SwaggerAutoConfiguration.class, GatewaySwaggerAutoConfiguration.class })
public @interface EnableFySwagger2 {

}
