package com.example.demo.entity;

public class Crewinfo {

	private String operationType = "UPDATE";
	private String crewid;
	private Crew crewDetails;

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getCrewid() {
		return crewid;
	}

	public void setCrewid(String crewid) {
		this.crewid = crewid;
	}

	public Crew getCrewDetails() {
		return crewDetails;
	}

	public void setCrewDetails(Crew crewDetails) {
		this.crewDetails = crewDetails;
	}

	@Override
	public String toString() {
		return "Crewinfo [operationType=" + operationType + ", crewid=" + crewid + ", crewDetails=" + crewDetails + "]";
	}

}
