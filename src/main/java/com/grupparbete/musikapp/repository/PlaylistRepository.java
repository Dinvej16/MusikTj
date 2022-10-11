package com.grupparbete.musikapp.repository;

import com.grupparbete.musikapp.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository extends CrudRepository<Playlist, Integer> {
}
