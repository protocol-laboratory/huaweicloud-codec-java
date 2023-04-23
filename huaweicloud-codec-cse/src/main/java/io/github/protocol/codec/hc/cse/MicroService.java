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
public class MicroService {
    @JsonProperty("serviceId")
    private String serviceId;

    @JsonProperty("environment")
    private String environment;

    @JsonProperty("appId")
    private String appId;

    @JsonProperty("serviceName")
    private String serviceName;

    @JsonProperty("version")
    private String version;

    @JsonProperty("description")
    private String description;

    @JsonProperty("level")
    private String level;

    @JsonProperty("registerBy")
    private String registerBy;

    @JsonProperty("schemas")
    private List<String> schemas;

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("modTimestamp")
    private String modTimestamp;

    @JsonProperty("framework")
    private Framework framework;

    @JsonProperty("paths")
    private List<String> paths;

    @JsonProperty("properties")
    private Map<String, String> properties;
}
