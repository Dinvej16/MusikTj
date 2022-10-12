package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestHandler {

    @GetMapping({"/Search/{type}", "/Search/"})
    public List<Song> externalControllerHandler(@PathVariable(name = "type", required = false) String type){
        return ExternalApiCall.searchSong(type);
    }



}
