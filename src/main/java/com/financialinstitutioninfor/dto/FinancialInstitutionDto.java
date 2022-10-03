package com.financialinstitutioninfor.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class FinancialInstitutionDto {
	
	private String nameOfMfi;
	private Long dateOfBranchOpening;
	private Long branchchLocation;
	private String clientOutReach;
	private String keyReasonsForDefault;
	private Long pos;
	private Long par;

	public String getNameOfMfi() {
		return nameOfMfi;
	}

	public void setNameOfMfi(String nameOfMfi) {
		this.nameOfMfi = nameOfMfi;
	}

	public Long getDateOfBranchOpening() {
		return dateOfBranchOpening;
	}

	public void setDateOfBranchOpening(Long dateOfBranchOpening) {
		this.dateOfBranchOpening = dateOfBranchOpening;
	}

	public Long getBranchchLocation() {
		return branchchLocation;
	}

	public void setBranchchLocation(Long branchchLocation) {
		this.branchchLocation = branchchLocation;
	}

	public String getClientOutReach() {
		return clientOutReach;
	}

	public void setClientOutReach(String clientOutReach) {
		this.clientOutReach = clientOutReach;
	}

	public String getKeyReasonsForDefault() {
		return keyReasonsForDefault;
	}

	public void setKeyReasonsForDefault(String keyReasonsForDefault) {
		this.keyReasonsForDefault = keyReasonsForDefault;
	}

	public Long getPos() {
		return pos;
	}

	public void setPos(Long pos) {
		this.pos = pos;
	}

	public Long getPar() {
		return par;
	}

	public void setPar(Long par) {
		this.par = par;
	}

	public FinancialInstitutionDto(String nameOfMfi, Long dateOfBranchOpening, Long branchchLocation,
			String clientOutReach, String keyReasonsForDefault, Long pos, Long par) {
		super();
		this.nameOfMfi = nameOfMfi;
		this.dateOfBranchOpening = dateOfBranchOpening;
		this.branchchLocation = branchchLocation;
		this.clientOutReach = clientOutReach;
		this.keyReasonsForDefault = keyReasonsForDefault;
		this.pos = pos;
		this.par = par;
	}

	public FinancialInstitutionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FinancialInstitutionDto [nameOfMfi=" + nameOfMfi + ", dateOfBranchOpening=" + dateOfBranchOpening
				+ ", branchchLocation=" + branchchLocation + ", clientOutReach=" + clientOutReach
				+ ", keyReasonsForDefault=" + keyReasonsForDefault + ", pos=" + pos + ", par=" + par + "]";
	}

}
