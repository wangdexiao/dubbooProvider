package com.dubbo.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.dubbo.provider.api")
@PropertySource("classpath:dubbo-order-provider.properties")
public class ProviderConfiguration {

}
