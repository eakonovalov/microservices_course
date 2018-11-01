package com.eakonovalov.limitsservice;

import com.eakonovalov.limitsservice.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekonovalov on 2018-10-04.
 */
@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/fault-tolerance-example")
    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfigurations")
    public LimitConfiguration retrieveConfigurations() {
        throw new RuntimeException("Not available");
    }

    public LimitConfiguration fallbackRetrieveConfigurations() {
        return new LimitConfiguration(9, 9999);
    }

}
