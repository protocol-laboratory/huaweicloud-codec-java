package io.github.protocol.codec.hc.aom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DimensionSeries {
    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;
}
