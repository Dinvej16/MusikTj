package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping("/playlist")
    public void addPlaylist(@RequestBody Playlist playlist){
        playlistService.addPlaylist(playlist);
    }

    @DeleteMapping("/playlist/{id}")
    public void deletePlaylistById(@PathVariable("id") Integer id) {
        playlistService.deletePlaylistById(id);
    }

    @GetMapping("/getall")
    public List<Playlist> getAllPlaylists(){
        return playlistService.getAllPlaylists();
    }


//    @PostMapping("add/{playlistId}/{songId}")
//    public Song addSongToPlaylist(@PathVariable("playlistId") Integer playlistId, @PathVariable("song") String songId) {
//        return playlistService.addSongToPlaylist(playlistId, songId);
//    }

    @GetMapping("{id}")
        public Playlist getById(@PathVariable("id") Integer id) {
        return playlistService.getById(id);
        }

    }