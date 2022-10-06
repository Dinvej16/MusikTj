package com.grupparbete.musikapp.service;

import com.grupparbete.musikapp.DAO.PlaylistDAO;
import com.grupparbete.musikapp.model.Playlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    PlaylistDAO playlistDAO;

    public PlaylistService(PlaylistDAO playlistDAO) {
        this.playlistDAO = playlistDAO;
    }

    public void addPlaylist(Playlist playlist) {
        playlistDAO.savePlaylist(playlist);
    }

    public void deletePlaylistById(Integer id) {
        playlistDAO.deleteById(id);
    }


    public List<Playlist> getAllPlaylists() {
        return (List<Playlist>) playlistDAO.getAllPlaylists();
    }

}
