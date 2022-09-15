package com.project.fleetmanagement.vehicle_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleStatusService {

    private final VehicleStatusRepository vehicleStatusRepository;
}
