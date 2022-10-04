package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.repository.PlaylistRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PlaylistDAO {

    PlaylistRepository repository;

    public PlaylistDAO(PlaylistRepository repository) {
        this.repository = repository;
    }

    public void savePlaylist(Playlist playlist) {
        repository.save(playlist);

    }
}
