package com.project.contract.rentacar.service;

import com.project.contract.rentacar.model.Vehicle;
import com.project.contract.rentacar.model.VehicleResponseModel;

public interface IVehicleService {
	VehicleResponseModel saveVehicle(Vehicle vehicle);

	VehicleResponseModel getVehicles();

	VehicleResponseModel getVehicleById(String id);
}
