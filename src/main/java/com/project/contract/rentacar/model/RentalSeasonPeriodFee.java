package com.project.contract.rentacar.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

import com.project.contract.enums.FeePeriod;

public class RentalSeasonPeriodFee extends RentalSeasonPeriod implements Serializable {

	public RentalSeasonPeriodFee(RentalSeasonPeriod rentalSeasonPeriod) {
		super(rentalSeasonPeriod.getBeginDate(), rentalSeasonPeriod.getEndDate(), rentalSeasonPeriod.getOrdinal());
	}
	
	public RentalSeasonPeriodFee(LocalDate beginDate, LocalDate endDate, int ordinal) {
		super(beginDate, endDate, ordinal);
	}


	private static final long serialVersionUID = 3479898609825191647L;

	private String rentalId;
	private Map<FeePeriod, BigDecimal>  periodFeeMap;

	public Map<FeePeriod, BigDecimal> getPeriodFeeMap() {
		return periodFeeMap;
	}

	public void setPeriodFeeMap(Map<FeePeriod, BigDecimal> periodFeeMap) {
		this.periodFeeMap = periodFeeMap;
	}

	public String getRentalId() {
		return rentalId;
	}

	public void setRentalId(String rentalId) {
		this.rentalId = rentalId;
	}
	
	
	
}
