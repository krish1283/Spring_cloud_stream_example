package org.krish.cloud.steam.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;

@RestController
public class PlayerController {
    @Autowired
    private StreamBridge streamBridge;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delegateToSupplier(@RequestBody String body) {
        System.out.println("Sending " + body);
        streamBridge.send("toStream-out-0", body);
    }

    @GetMapping
    public String greeting() {
        streamBridge.send("toStream-out-0", "hello");
        return "Hello";
    }


}