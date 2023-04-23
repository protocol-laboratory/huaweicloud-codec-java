package io.github.protocol.codec.hc.aom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MetricDataPoints {
    @JsonProperty("statistics")
    private List<StatisticValue> statistics;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("unit")
    private String unit;
}
