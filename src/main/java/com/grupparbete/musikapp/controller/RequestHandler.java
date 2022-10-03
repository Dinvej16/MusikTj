package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestHandler {

    @GetMapping("/Search/{name}")
    public  JSONObject externalControllerHandler(@PathVariable String name){
        return ExternalApiCall.searchSong(name);
    }

    @GetMapping("/TrackInfo")
    public JSONObject externalControllerHandler2(){
        return ExternalApiCall.getTrackInfo();


    }


}
