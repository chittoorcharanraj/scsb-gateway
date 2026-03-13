package org.recap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.util.List;

/**
 * Created by akulak on 3/3/17.
 */
@Data
public class ItemAvailabityStatusRequest {
    @JsonProperty("barcodes")
    private List<String> Barcodes;
}
