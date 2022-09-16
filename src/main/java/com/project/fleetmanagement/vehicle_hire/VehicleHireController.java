package com.project.fleetmanagement.vehicle_hire;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle-hires")
@RequiredArgsConstructor
public class VehicleHireController {

    private final VehicleHireService vehicleHireService;

    @GetMapping
    public String getVehicleHires() {
        return "entity/vehicle-hire";
    }
}
