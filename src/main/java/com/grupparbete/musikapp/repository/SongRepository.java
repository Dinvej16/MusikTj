package com.grupparbete.musikapp.repository;

import com.grupparbete.musikapp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
