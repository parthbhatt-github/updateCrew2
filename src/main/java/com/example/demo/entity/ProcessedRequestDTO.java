package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "operationType",
        "id",
        "crew"
})
public class ProcessedRequestDTO {
	
	@JsonProperty("operationType")
	private String operationType = "UPDATE";
    @JsonProperty("id")
    private String crewid;
    @JsonProperty("crew")
    private Crew crewDTO;
    
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
	public Crew getCrewDTO() {
		return crewDTO;
	}
	public void setCrewDTO(Crew crewDTO) {
		this.crewDTO = crewDTO;
	}
}
