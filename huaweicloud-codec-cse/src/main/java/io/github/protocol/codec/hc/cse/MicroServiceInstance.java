package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MicroServiceInstance {
    @JsonProperty("instanceId")
    private String instanceId;

    @JsonProperty("serviceId")
    private String serviceId;

    @JsonProperty("version")
    private String version;

    @JsonProperty("endpoints")
    private List<String> endpoints;

    @JsonProperty("status")
    private String status;

    @JsonProperty("properties")
    private Map<String, String> properties;

    @JsonProperty("healthCheck")
    private HealthCheck healthCheck;

    @JsonProperty("dataCenterInfo")
    private DataCenterInfo dataCenterInfo;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("modTimestamp")
    private String modTimestamp;
}
