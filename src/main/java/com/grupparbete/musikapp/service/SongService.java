package com.grupparbete.musikapp.service;
import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;


@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public Song GetSongById(@PathVariable("id") Long id){
        Optional<Song> maybeSong = songRepository.findById(id);
        if(maybeSong.isPresent()){
            Song song = maybeSong.get();
            return song;
        }
        return null;
    }

    public void createSong(Song song) {
        songRepository.save(song);

    }

    }




