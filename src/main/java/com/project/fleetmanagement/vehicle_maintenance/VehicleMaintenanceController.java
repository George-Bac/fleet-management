package com.project.fleetmanagement.vehicle_maintenance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicles-maintenances")
@RequiredArgsConstructor
public class VehicleMaintenanceController {

    private final VehicleMaintenanceService vehicleMaintenanceService;
}
