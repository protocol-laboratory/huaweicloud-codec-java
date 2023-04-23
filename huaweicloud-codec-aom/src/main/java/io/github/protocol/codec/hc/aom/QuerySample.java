package io.github.protocol.codec.hc.aom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class QuerySample {
    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("metric_name")
    private String metricName;

    @JsonProperty("dimensions")
    private List<DimensionSeries> dimensions;
}
