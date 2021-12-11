package com.company.cleanCodeSOLIDTDD.singleResponsibilityPrinciple;

import java.math.BigDecimal;

public class DriverTaxes {
	private BigDecimal companyTaxes;

	public DriverTaxes() {

	}

	public BigDecimal calculateTaxesForCompany() {
		return companyTaxes;
	}

}
