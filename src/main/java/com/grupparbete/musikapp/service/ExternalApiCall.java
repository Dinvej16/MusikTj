package com.grupparbete.musikapp.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.grupparbete.musikapp.model.Song;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class ExternalApiCall {


    static ArrayList<Song> searchResult = new ArrayList<>();


    public static List<Song> searchSong(String name) {
        String apiUrlSearch = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=" + name + "&api_key=cb2bdec273e087b5aef93970d41e9676&format=json";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode node = restTemplate.getForObject(apiUrlSearch, JsonNode.class);
        try {
            for (JsonNode i : node.get("results").get("trackmatches").get("track")) {

                String trackName = i.get("name").asText();
                String artist = i.get("artist").asText();
                String id = artist + "-" + trackName;
                id = id.replaceAll(" ", "-");

                Song song = new Song(id, trackName, artist);

                searchResult.add(song);


            }
            return searchResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Song selectSong(String id) {
        System.out.println(searchResult);
        for (Song i : searchResult) {
            if (i.getId().equals(id)) {
                System.out.println(i);
                return i;
            }
        }

        return null;
    }
}

