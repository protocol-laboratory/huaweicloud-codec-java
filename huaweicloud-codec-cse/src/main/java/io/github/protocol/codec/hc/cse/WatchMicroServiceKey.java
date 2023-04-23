package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WatchMicroServiceKey {
    @JsonProperty("appId")
    private String appId;

    @JsonProperty("serviceName")
    private String serviceName;

    @JsonProperty("version")
    private String version;
}
