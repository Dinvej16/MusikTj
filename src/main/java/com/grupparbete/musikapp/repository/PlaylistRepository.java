package com.grupparbete.musikapp.repository;

import com.grupparbete.musikapp.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository <Playlist, Integer> {
}

