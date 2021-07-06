package com.AutoHandel.user;

import com.AutoHandel.model.Producent;
import com.AutoHandel.model.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Client {
    private Double budget;
    private Producent preferableProducent;
    private VehicleType preferableVehicleType;
    private Boolean damagedAccept;


}
