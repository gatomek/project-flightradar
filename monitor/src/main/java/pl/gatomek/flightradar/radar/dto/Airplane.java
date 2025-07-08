package pl.gatomek.flightradar.radar.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Airplane {

    @JsonAlias("hex")
    private String icao;

    @JsonAlias("type")
    private MessageType messageType;

    private String flight;

    @JsonAlias("r")
    private String registration;

    @JsonAlias("t")
    private String airplaneType;

    private String dbFlags;

    private String desc;

    @JsonAlias("alt_baro")
    private String barometricAltitudeInFeet;

    @JsonAlias("alt_geom")
    private String geometricAltitudeInFeet;

    @JsonAlias("gs")
    private String groundSpeedInKnots;

    @JsonAlias("ias")
    private String indicatedAirSpeedInKnots;

    @JsonAlias("tas")
    private String trueAirSpeedInKnots;

    @JsonAlias("mach")
    private String machNumber;

    @JsonAlias("wd")
    private String windDirection;

    @JsonAlias("ws")
    private String windSpeed;

    private String oat;
    private String tat;
    private String track;
    private String track_rate;
    private String roll;
    private String mag_heading;
    private String true_heading;
    private String baro_rate;
    private String geom_rate;
    private String squawk;
    private String emergency;

    @JsonAlias("category")
    private EmitterCategory emitterCategory;

    private String nav_qnh;
    private String nav_altitude_mcp;
    private String nav_heading;
    private String lat;
    private String lon;
    private String nic;
    private String rc;
    private String seen_pos;
    private String version;
    private String nic_baro;
    private String nac_p;
    private String nac_v;
    private String sill;
    private String sill_type;
    private String gva;
    private String sda;
    private String alert;
    private String spi;
    private List<String> mlat;
    private List<String> tisb;
    private String messages;
    private String seen;
    private String rssi;
    private String dst;
    private String dir;
}
