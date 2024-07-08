package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Crew;
import com.example.demo.entity.Crewinfo;
import com.example.demo.entity.ProcessedRequestDTO;

@Service
public class Updateresttemplateservice {

	//RestTemplate resttemplate = new RestTemplate();
	//final String URL = "/ddboperation";
	
	//String url = "http://dynamodbupdater/ddboperation";
//	public void updateCrew(Crew crew) {
//		resttemplate.put(url, crew);
//	}
	
	public ProcessedRequestDTO UpdateCrew(Crew objCrew)
	{
		ProcessedRequestDTO requestDTO = new ProcessedRequestDTO();
		requestDTO.setCrewid(objCrew.getCrewId());
		requestDTO.setOperationType("UPDATE");
		requestDTO.setCrewDTO(objCrew);
		return  requestDTO;		
	}

}
