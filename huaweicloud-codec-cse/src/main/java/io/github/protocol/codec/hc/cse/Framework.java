package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Framework {
    @JsonProperty("name")
    private String name;

    @JsonProperty("version")
    private String version;
}
