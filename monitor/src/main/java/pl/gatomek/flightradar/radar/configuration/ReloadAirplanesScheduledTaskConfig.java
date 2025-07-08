package pl.gatomek.flightradar.radar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import pl.gatomek.flightradar.radar.task.ReloadAirplanesScheduledTask;

@Configuration
public class ReloadAirplanesScheduledTaskConfig {

    @Bean
    public ReloadAirplanesScheduledTask reloadAirplanesScheduledTask(RestClient restClient) {
        return new ReloadAirplanesScheduledTask(restClient);
    }
}
