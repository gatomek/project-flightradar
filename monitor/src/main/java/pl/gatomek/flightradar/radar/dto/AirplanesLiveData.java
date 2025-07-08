package pl.gatomek.flightradar.radar.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AirplanesLiveData {

    @JsonAlias("ac")
    private List<Airplane> airplanes = new ArrayList<>();

    @JsonAlias("msg")
    private String status;

    private Date now;

    @JsonAlias("total")
    private Integer numberOfAirplanes;

    @JsonAlias("ctime")
    private Date cachedTime;

    @JsonAlias("ptime")
    private Long serverProcessingTimeInMs;
}
