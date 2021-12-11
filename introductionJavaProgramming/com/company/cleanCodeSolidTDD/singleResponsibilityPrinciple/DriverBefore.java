package com.company.cleanCodeSOLIDTDD.singleResponsibilityPrinciple;

import java.math.BigDecimal;
import java.util.Date;

public class DriverBefore {
	private String driverId;
	private String driverName;
	private String address;
	private Date dateOfJoining;
	private String newBuses;
	private BigDecimal companyTaxes;

	public String buyNewBuses() {
		return newBuses + "logic about new buses";
	}

	public BigDecimal calculateTaxesForCompany() {
		return companyTaxes;
	}
}
