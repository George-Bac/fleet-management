package com.project.fleetmanagement.vehicle_model;

import com.project.fleetmanagement.client.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleModelService {

    private final VehicleModelRepository vehicleModelRepository;
}
