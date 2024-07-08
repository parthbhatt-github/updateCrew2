package com.example.demo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.entity.ProcessedRequestDTO;
import com.example.demo.entity.Response;

import com.example.demo.entity.Crew;
import com.example.demo.services.CloudWatchAppender;
import com.example.demo.services.Updateresttemplateservice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;


@RestController
public class Updatecontroller {
	
	//private Logger logger = new LoggerFactory();
	private ILoggingEvent _logger =  (ILoggingEvent) LoggerFactory.getLogger(Updatecontroller.class);
	//private Logger logger = (Logger) LoggerFactory.getLogger(Updatecontroller.class);

	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	public Updateresttemplateservice updateresttemplateservice;
	
	String url = "http://dynamodbupdater/ddboperation";
	
	@PutMapping("/updateCrew")
    public ResponseEntity<Response> UpdateCrew(@RequestBody Crew crew) throws JsonProcessingException {
		_logger.getMessage();
	
        System.out.println(crew);
		ProcessedRequestDTO requestDTO = updateRequest(crew);
        String jsonRequest = mapper.writeValueAsString(requestDTO);
        System.out.println(jsonRequest);
        HttpEntity request = new HttpEntity<>(requestDTO);
        ResponseEntity<Response> response = restTemplate.exchange(url, HttpMethod.POST,request, Response.class);
        System.out.println(response);

        return response;
    }
	


	 private ProcessedRequestDTO updateRequest(Crew crew){ ProcessedRequestDTO
	  requestDTO = new ProcessedRequestDTO();
	  requestDTO.setCrewid(crew.getCrewId());
	  requestDTO.setOperationType("UPDATE"); requestDTO.setCrewDTO(crew); return
	  requestDTO;
	}

}
