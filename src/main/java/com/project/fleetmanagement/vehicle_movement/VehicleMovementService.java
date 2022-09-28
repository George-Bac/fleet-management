package com.project.fleetmanagement.vehicle_movement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleMovementService {

    private final VehicleMovementRepository vehicleMovementRepository;
}
