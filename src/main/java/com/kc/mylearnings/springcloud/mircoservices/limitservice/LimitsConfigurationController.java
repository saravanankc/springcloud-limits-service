package com.kc.mylearnings.springcloud.mircoservices.limitservice;

import com.kc.mylearnings.springcloud.mircoservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiruation(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
        //return new LimitConfiguration(1000, 1);
    }
}
