package com.grupparbete.musikapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      Long id;
      String name;
      String artist;
      String streams; // Sångens speltid

      public Song(String name, String artist, String streams) {
            this.id = id;
            this.name = name;
            this.artist = artist;
            this.streams = streams;
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

      public String getStreams() {
            return streams;
      }
}
