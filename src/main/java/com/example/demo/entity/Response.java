package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	public String getRequestedCrewId() {
		return requestedCrewId;
	}
	public void setRequestedCrewId(String requestedCrewId) {
		this.requestedCrewId = requestedCrewId;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public List<Crew> getCrews() {
		return crews;
	}
	public void setCrews(List<Crew> crews) {
		this.crews = crews;
	}
	@JsonProperty("requestedCrewId")
	private String requestedCrewId;
	@JsonProperty("operationType")
	private String operationType;
	@JsonProperty("status")
	private String status;
	@JsonProperty("statuscode")
	private String statusCode;
	@JsonProperty("crews")
	private List<Crew> crews = new ArrayList<>() ;
	
}
