package com.pi.rodizioapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController

public class ServerController {
    @CrossOrigin
    @GetMapping(path = "api/server")
    public Object apiStatus (){
        HashMap<String, Object> result = new HashMap<>();
        HashMap<String, Object> message = new HashMap<>();
        message.put("message","Server funcionando");
        result.put("results",message);
        return result;
    }
}
