package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestHandler {

    @GetMapping("/Search")
    public  JSONObject externalControllerHandler(){
        return ExternalApiCall.searchSong();
    }

    @GetMapping("/TrackInfo")
    public JSONObject externalControllerHandler2(){
        return ExternalApiCall.getTrackInfo();


    }


}
