package pl.gatomek.flightradar.radar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.time.Duration;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient restClient(RadarConfig radarConfig) {
        String uri = radarConfig.getUri()
                .replace("{lon}", radarConfig.getLongitude())
                .replace("{lat}", radarConfig.getLatitude())
                .replace("{range}", radarConfig.getRange());

        return RestClient.builder()
                .baseUrl(radarConfig.getApi() + "/" + uri)
                .requestFactory(customFactory())
                .build();
    }

    private ClientHttpRequestFactory customFactory() {
        var factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(Duration.ofSeconds(5L));
        factory.setReadTimeout(Duration.ofSeconds(5L));
        return factory;
    }
}
