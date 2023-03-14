package com.scrimfinderapi.scrimfinder.web.wq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/out/wq")
public class WqOutgoing {
    @GetMapping("/logs")
    public Object getWorkerQueueLogs(){
        String uri = "http://localhost:8081/api/hello";
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }
}
