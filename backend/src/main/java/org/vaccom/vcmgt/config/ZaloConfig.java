package org.vaccom.vcmgt.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author TrinhNX
 * @since 8/29/2021
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "zalo")
@PropertySource(value = "classpath:NotificationTemplate.yml", factory = YamlPropertySourceFactory.class)
public class ZaloConfig {
    private String accessToken;
    private String henTiemChung;
    private String giayDiDuong;
}