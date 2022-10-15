package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.model.Song;
import com.grupparbete.musikapp.repository.PlaylistRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PlaylistDAO {

    PlaylistRepository repository;

    public PlaylistDAO(PlaylistRepository repository) {
        this.repository = repository;
    }

    public void savePlaylist(Playlist playlist) {
        repository.save(playlist);

    }

    public void deleteById(Integer id) {
        repository.deleteById(id);

    }

    public Iterable<Playlist> getAllPlaylists() {
        return repository.findAll();
    }



    public Optional<Playlist> getById(Integer id) {
        return repository.findById(id);
    }
}