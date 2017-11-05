package com.rs2.eureka.client.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CommonRestService {
	Logger logger = LogManager.getLogger(CommonRestService.class.getName());
	
	@Value("${client.message}")
	private String clientMessage;

	@Value("${env.name}")
	private String env;
	
    @RequestMapping("/provider/service")
    public String service() {
    		logger.trace("In common service");
        return clientMessage + " on " + env;
    }
}
