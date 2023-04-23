package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateDependenciesReq {
    @JsonProperty("dependencies")
    private List<MicroServiceDependency> dependencies;
}
