package com.atwj.config;

import com.atwj.client.WjApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wj
 * @create_time 2023/7/4
 * @description
 */
@Configuration
@ConfigurationProperties(prefix = "wjapi.client")
@Data
public class WjApiClientConfig {

    private String accessKey;
    private String secretKey;


    @Bean
    public WjApiClient wjApiClient() {
        return new WjApiClient(accessKey, secretKey);
    }

}
