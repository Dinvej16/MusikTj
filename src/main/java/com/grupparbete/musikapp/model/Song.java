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

      public Song(String name, String artist) {
            this.id = id;
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
