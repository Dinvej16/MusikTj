package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RequestHandler {

    @GetMapping({"/Search/{type}", "/Search/"})
    public List<Song> externalControllerHandler(@PathVariable(name = "type", required = false) String type){
        return ExternalApiCall.searchSong(type);
    }



}
