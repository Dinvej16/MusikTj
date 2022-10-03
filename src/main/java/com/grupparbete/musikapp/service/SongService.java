package com.grupparbete.musikapp.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class SongService {
    @Autowired
    SongRepository songRepository;
    public Song getSong(String name) {
        String Url = "http://ws.audioscrobbler.com/2.0/?method=track.search&track=" + name + "&api_key=ce19f5aede5a8f37fb37f06b517a790e&format=json";
        RestTemplate rt = new RestTemplate();
        JsonNode node = rt.getForObject(Url, JsonNode.class);
        Song song = null;
        for (JsonNode i : node.get("results").get("trackmatches").get("track")) {
            String trackName = i.get("name").asText();
            String artist = i.get("artist").asText();
            String streams = i.get("listeners").asText();

            song = new Song(trackName, artist, streams);
            songRepository.save(song);
        }
        return song;
    }

    public void createSong(Song song) {
        songRepository.save(song);
    }
    }



