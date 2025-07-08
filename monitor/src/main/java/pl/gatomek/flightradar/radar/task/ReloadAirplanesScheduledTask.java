package pl.gatomek.flightradar.radar.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestClient;
import pl.gatomek.flightradar.radar.dto.AirplanesLiveData;

import java.util.concurrent.TimeUnit;

@Slf4j
@RequiredArgsConstructor
public class ReloadAirplanesScheduledTask {

    private final RestClient restClient;

    @Scheduled(fixedDelay = 15, timeUnit = TimeUnit.SECONDS)
    public void reloadAirplanesData() {
        AirplanesLiveData data = restClient.get().retrieve().body(AirplanesLiveData.class);
        log.info("Radar: {} @ {}", data.getNumberOfAirplanes(), data.getCachedTime());
    }
}
