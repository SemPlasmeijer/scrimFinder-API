package com.scrimfinderapi.scrimfinder.web.wq;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/in/wq/")
public class WqIncoming {
    @PostMapping()
    public String createMassBatch(){

        return "";
    }
}
