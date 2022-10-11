package com.grupparbete.musikapp.service;

import com.grupparbete.musikapp.DAO.PlaylistDAO;
import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class PlaylistService {
    SongService songService;
    PlaylistDAO playlistDAO;

    public PlaylistService(PlaylistDAO playlistDAO, SongService songService) {
        this.playlistDAO = playlistDAO;
        this.songService = songService;

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

//    public Song addSongToPlaylist(Integer playlistId, String songId) {
//        Optional <Playlist> playlistOptional = playlistDAO.getById(playlistId);
//        if (playlistOptional.isPresent()){
//            Playlist playlist = playlistOptional.get();
//            Song song =
//
//        }
//    }

    public Playlist getById(Integer id) {
        Optional<Playlist> maybePlaylist = playlistDAO.getById(id);

        if (maybePlaylist.isPresent()){
            Playlist playlist = maybePlaylist.get();
            return playlist;
        }
    return null;
    }
}