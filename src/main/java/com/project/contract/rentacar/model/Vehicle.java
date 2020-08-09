package com.project.contract.rentacar.model;

import java.io.Serializable;

import com.project.contract.enums.FuelType;
import com.project.contract.enums.TransmissionType;
import com.project.contract.enums.VehicleBrand;
import com.project.contract.enums.VehicleClassType;

/*
"name": "i20",
"bigBagCount": 1,
"smallBagCount": 1,
"transmission": "manual",
"brand": {
    "name": "Hyundai"
},
"class": "economic",
"seats": 5,
"fuel": "gas",
"image": {
    "small": "https:\/\/static.yolcu360.com\/thumbnails\/90\/bf\/90bf388ccd4fb9adbe8dc0e1c55084d5.png",
    "large": "https:\/\/static.yolcu360.com\/thumbnails\/06\/8c\/068cc0ffb31e245fcf5b7551b4eeffed.png",
    "medium": "https:\/\/static.yolcu360.com\/thumbnails\/a8\/0e\/a80ee21501eb4c37228de1b92a478431.png"
}
*/
public class Vehicle implements Serializable {



	private static final long serialVersionUID = 2626556889389784718L;

	private String name;
	private String code;
	private TransmissionType transmissionType;
	private VehicleBrand brand;
	private VehicleClassType classType;
	private FuelType fuelType;
	private int bigBagCount;
	private int smallBagCount;
	private int doorCount;
	private int seatCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBigBagCount() {
		return bigBagCount;
	}

	public void setBigBagCount(int bigBagCount) {
		this.bigBagCount = bigBagCount;
	}

	public int getSmallBagCount() {
		return smallBagCount;
	}

	public void setSmallBagCount(int smallBagCount) {
		this.smallBagCount = smallBagCount;
	}

	public TransmissionType getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(TransmissionType transmissionType) {
		this.transmissionType = transmissionType;
	}

	public VehicleBrand getBrand() {
		return brand;
	}

	public void setBrand(VehicleBrand brand) {
		this.brand = brand;
	}

	public VehicleClassType getClassType() {
		return classType;
	}

	public void setClassType(VehicleClassType classType) {
		this.classType = classType;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	public String getCode() {
		if (code == null) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(this.brand.getCode()).append("-");
			strBuilder.append(this.fuelType.getCode()).append("-");
			strBuilder.append(this.transmissionType.getCode()).append("-");
			strBuilder.append(this.getDoorCount()).append("-");
			strBuilder.append(this.name);
		}
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Vehicle [code=" + code + "]";
	}
	/* images */

}
