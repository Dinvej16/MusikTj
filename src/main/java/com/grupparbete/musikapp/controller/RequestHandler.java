package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RequestHandler {

    @GetMapping("/Search/{name}")
    public  JSONObject externalControllerHandler(@PathVariable String name){
        return ExternalApiCall.searchSong(name);
    }



}
