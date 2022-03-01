package com.fy4cloud.fy.common.security.feign;

import feign.RequestInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * feign 拦截器传递 header 中oauth token， 使用hystrix 的信号量模式
 * @author fy
 * @date 2022/3/1
 **/
@ConditionalOnProperty("security.oauth2.client.client-id")
public class FyFeignClientConfiguration {
	@Bean
	public RequestInterceptor oauth2FeignRequestInterceptor(OAuth2ClientContext oAuth2ClientContext,
															OAuth2ProtectedResourceDetails resource, AccessTokenContextRelay accessTokenContextRelay) {
		return new FyFeignClientInterceptor(oAuth2ClientContext, resource, accessTokenContextRelay);
	}

}
