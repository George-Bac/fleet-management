package com.project.fleetmanagement.vehicle_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle-statuses")
@RequiredArgsConstructor
public class VehicleStatusController {

    private final VehicleStatusService vehicleStatusService;

    @GetMapping
    public String getVehicleStatuses() {
        return "entity/vehicle-status";
    }
}
