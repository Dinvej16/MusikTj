package com.grupparbete.musikapp.service;

import net.minidev.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class ExternalApiCall {


    //Detta är "sök" urlen som finns i LastFm API. Det som händer här är att den kan hitta låtar utifrån både artist och låtens namn.

    public static JSONObject searchSong(String name){
        String apiUrlSearch = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=" + name + "&api_key=cb2bdec273e087b5aef93970d41e9676&format=json";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(apiUrlSearch, JSONObject.class);
        try {
            return restTemplate.getForObject(apiUrlSearch, JSONObject.class);
        } catch (Exception abc){
            return null;
        }
    }
}
