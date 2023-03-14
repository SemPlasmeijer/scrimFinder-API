package com.scrimfinderapi.scrimfinder.web.wq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/out/wq")
public class WqOutgoing {
    @GetMapping("/logs")
    public String getWorkerQueueLogs(){

        return "lmao";
    }
}
