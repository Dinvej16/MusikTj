package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/{id}")
    public Song getById(@PathVariable("id") Long id){
        return songService.GetSongById(id);
    }

    @PostMapping("/create")
    public void CreateSong(@RequestBody Song song){
        songService.createSong(song);
    }
}