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

    @GetMapping("/Search/{name}")
    public List<Song> externalControllerHandler(@PathVariable String name){
        return ExternalApiCall.searchSong(name);
    }

    @GetMapping("/Search/{name}/{id}")
    public Song select(@PathVariable String name, @PathVariable String id){
        return ExternalApiCall.selectSong(name, id);
    }


}
