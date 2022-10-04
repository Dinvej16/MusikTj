package com.grupparbete.musikapp.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.grupparbete.musikapp.model.Song;
import net.minidev.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import javax.activation.MimeTypeParameterList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExternalApiCall {


    //Detta är "sök" urlen som finns i LastFm API. Det som händer här är att den kan hitta låtar utifrån både artist och låtens namn.

    public static List<Song> searchSong(String name){
        ArrayList<Song> songs = new ArrayList<Song>();
        String apiUrlSearch = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=" + name + "&api_key=cb2bdec273e087b5aef93970d41e9676&format=json";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode node = restTemplate.getForObject(apiUrlSearch, JsonNode.class);
        try {
            Song song = null;
            for (JsonNode i : node.get("results").get("trackmatches").get("track")) {

                String trackName = i.get("name").asText();
                String artist = i.get("artist").asText();
                String id = i.get("listeners").asText();

                song = new Song(id,trackName, artist);

                songs.add(song);
            }
            return songs;

        } catch (Exception e){
            return null;
        }

    }

    public static Song selectSong(String name, String id){
     List<Song> choices = searchSong(name).stream().filter(x -> x.getId().equalsIgnoreCase(id)).toList();
     for (Song i : choices){
         System.out.println(i.getId());
         return i;

       }
        return null;
    }
}
