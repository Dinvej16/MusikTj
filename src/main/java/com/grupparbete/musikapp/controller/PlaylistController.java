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

    @DeleteMapping("/delete/{id}")
    public void deletePlaylistById(@PathVariable("id") Integer id) {
        playlistService.deletePlaylistById(id);
    }

    @GetMapping("/getall")
    public List<Playlist> getAllPlaylists(){
        return playlistService.getAllPlaylists();
    }


    @PutMapping("add/{songId}/{playListId}")
    public List<Song> addSongToPlaylist(@PathVariable("songId") Long songId, @PathVariable("playListId") Integer playListId){
        return playlistService.addSongToPlaylist(songId, playListId);
    }

    @GetMapping("{id}")
    public Playlist getById(@PathVariable("id") Integer id) {
        return playlistService.getById(id);
    }

    @DeleteMapping("delete/{playlistId}/{songId}")
    public void deleteSongFromPlaylistById(@PathVariable("playlistId") Integer playlistId, @PathVariable("songId") Long songId){
         playlistService.deleteSongFromPlaylistById(playlistId, songId);
    }

}