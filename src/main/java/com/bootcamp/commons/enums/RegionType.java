package com.bootcamp.commons.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Created by darextossa on 11/28/17.
 */
public enum RegionType {
    @SerializedName("ville")
    VILLE,
    @SerializedName("pays")
    PAYS,
    @SerializedName("commune")
    COMMUNE,
    @SerializedName("departement")
    DEPARTEMENT;
}
