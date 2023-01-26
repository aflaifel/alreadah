package com.alreadah.example.endpointtracking;

import com.alreadah.example.endpointtracking.service.EndPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EndpointTrackingApplication {

	public static void main(String[] args) {

		SpringApplication.run(EndpointTrackingApplication.class, args);

	}

}
