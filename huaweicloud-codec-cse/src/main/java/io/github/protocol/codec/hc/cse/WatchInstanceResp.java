package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WatchInstanceResp {
    @JsonProperty("action")
    private String action;

    @JsonProperty("key")
    private WatchMicroServiceKey key;

    @JsonProperty("instance")
    private MicroServiceInstance instance;
}
