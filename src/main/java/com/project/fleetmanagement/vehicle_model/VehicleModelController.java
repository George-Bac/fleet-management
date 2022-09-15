package com.project.fleetmanagement.vehicle_model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle-models")
@RequiredArgsConstructor
public class VehicleModelController {

    private final VehicleModelService vehicleModelService;
}
