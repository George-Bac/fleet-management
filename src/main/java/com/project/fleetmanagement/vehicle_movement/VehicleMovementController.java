package com.project.fleetmanagement.vehicle_movement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle-movements")
@RequiredArgsConstructor
public class VehicleMovementController {

    private final VehicleMovementService vehicleMovementService;

    @GetMapping
    public String getVehicleMovements() {
        return "entity/vehicle-movement";
    }
}
