package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HealthCheck {
    @JsonProperty("mode")
    private String mode;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("interval")
    private Integer interval;

    @JsonProperty("times")
    private Integer times;
}
