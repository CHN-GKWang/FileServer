package com.gkwang.fileserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport ;

/**
 * Spring Security 配置类.
 * 
 * @since 1.0.0 2017年3月8日
 */
@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurationSupport  {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*") ; // 允许跨域请求
	}
}