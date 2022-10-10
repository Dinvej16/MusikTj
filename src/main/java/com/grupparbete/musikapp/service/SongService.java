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


    public void createSong(Song song) {
        songRepository.save(song);
    }
    }



