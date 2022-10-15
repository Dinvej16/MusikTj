package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.service.ExternalApiCall;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
public class RequestHandler {

    @Autowired
    ExternalApiCall externalApiCall;



    public RequestHandler() {

    }

    // Söka efter låt
    @GetMapping("/Search/{name}")
    public List<Song> externalControllerHandler(@PathVariable String name){
        return externalApiCall.searchSong(name);
    }


    @GetMapping("/Search/{name}/{id}")
    public Song select(@PathVariable String name, @PathVariable Long id){
        return externalApiCall.selectSong(id);
    }


}