package com.grupparbete.musikapp.service;

import net.minidev.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class ExternalApiCall {

    //Detta är "sök" urlen som finns i LastFm API. Det som händer här är att den kan hitta låt utifrån både artist och låtens namn.
    private static final String apiUrl = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=asme &api_key=cb2bdec273e087b5aef93970d41e9676&format=json";

    public static JSONObject fetchUserData(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(apiUrl, JSONObject.class);
        try {
            return restTemplate.getForObject(apiUrl, JSONObject.class);
        } catch (Exception abc){
            return null;
        }
    }
}
