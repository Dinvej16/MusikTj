package com.grupparbete.musikapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "songs")
public class Song {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      Long id;
      String name;
      String artist;
      @ManyToMany(mappedBy = "songs")
      private List<Playlist> playlists;

      public Song(String name, String artist) {

            this.name = name;
            this.artist = artist;
      }

      public Song() {

      }


      public Long getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public String getArtist() {
            return artist;
      }
}