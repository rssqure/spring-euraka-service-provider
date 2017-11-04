package com.rs2.eureka.client.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonRestService {
	Logger logger = LogManager.getLogger(CommonRestService.class.getName());
	
    @RequestMapping("/provider/service")
    public String service() {
    		logger.trace("In common service");
        return "Hello from Common Service!";
    }
}
