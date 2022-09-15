package com.project.fleetmanagement.vehicle_hire;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleHireService {

    private final VehicleHireRepository vehicleHireRepository;
}
