package com.project.fleetmanagement.vehicle_make;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleMakeService {

    private final VehicleMakeRepository vehicleMakeRepository;
}
