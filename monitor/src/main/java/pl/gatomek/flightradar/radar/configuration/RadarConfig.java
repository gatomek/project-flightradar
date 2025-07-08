package pl.gatomek.flightradar.radar.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "radar")
public class RadarConfig {
    private String api;
    private String uri;
    private String latitude;
    private String longitude;
    private String range;
}
