package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {
    @GetMapping()
    public static JSONObject externalControllerHandler(){
        return ExternalApiCall.searchSong();
    }
}
