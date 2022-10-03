package com.grupparbete.musikapp.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.grupparbete.musikapp.model.Song;
import net.minidev.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import javax.activation.MimeTypeParameterList;
import java.util.ArrayList;
import java.util.List;

public class ExternalApiCall {
static ArrayList<Song> songs = new ArrayList<Song>();

    //Detta är "sök" urlen som finns i LastFm API. Det som händer här är att den kan hitta låtar utifrån både artist och låtens namn.

    public static List<Song> searchSong(String name){
        String apiUrlSearch = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=" + name + "&api_key=cb2bdec273e087b5aef93970d41e9676&format=json";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode node = restTemplate.getForObject(apiUrlSearch, JsonNode.class);
        try {
            Song song = null;
            for (JsonNode i : node.get("results").get("trackmatches").get("track")) {

                String trackName = i.get("name").asText();
                String artist = i.get("artist").asText();
                song = new Song(trackName, artist);
                songs.add(song);
            }
            return songs;

        } catch (Exception e){
            return null;
        }

    }
}
