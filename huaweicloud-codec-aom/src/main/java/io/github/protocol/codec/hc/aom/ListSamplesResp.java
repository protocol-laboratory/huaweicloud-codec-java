package io.github.protocol.codec.hc.aom;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ListSamplesResp {
    private List<SampleDataValue> samples;
}
