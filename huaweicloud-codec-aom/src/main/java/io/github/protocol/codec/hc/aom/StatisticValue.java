package io.github.protocol.codec.hc.aom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StatisticValue {
    @JsonProperty("statistic")
    private String statistic;

    @JsonProperty("value")
    private Double value;
}
