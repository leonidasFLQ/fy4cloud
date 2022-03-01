package com.fy4cloud.fy.common.security.annotation;

import com.fy4cloud.fy.common.security.component.FyResourceServerAutoConfiguration;
import com.fy4cloud.fy.common.security.component.FyResourceServerTokenRelayAutoConfiguration;
import com.fy4cloud.fy.common.security.component.FySecurityBeanDefinitionRegistrar;
import com.fy4cloud.fy.common.security.feign.FyFeignClientConfiguration;
import org.springframework.cloud.commons.security.ResourceServerTokenRelayAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
 * 资源服务注解
 * @author fy
 * @date 2022/03/01
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({ FyResourceServerAutoConfiguration.class, FySecurityBeanDefinitionRegistrar.class,
		FyResourceServerTokenRelayAutoConfiguration.class, FyFeignClientConfiguration.class })
public @interface EnableFyResourceServer {
}
