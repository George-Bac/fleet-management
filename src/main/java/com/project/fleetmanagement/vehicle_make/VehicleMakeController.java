package com.project.fleetmanagement.vehicle_make;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle-makes")
@RequiredArgsConstructor
public class VehicleMakeController {

    private final VehicleMakeService vehicleMakeService;

    @GetMapping
    public String getVehicleMakes() {
        return "entity/vehicle-make";
    }
}
