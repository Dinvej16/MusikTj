package com.grupparbete.musikapp.model;

import javax.persistence.*;

@Entity
@Table
public class Song {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      String id;
      String name;
      String artist;

      public Song(String id, String name, String artist) {

            this.id = id;
            this.name = name;
            this.artist = artist;
      }

      public Song(String name, String artist) {

            this.id = id;
            this.name = name;
            this.artist = artist;
      }



      public Song() {

      }


      public String getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public String getArtist() {
            return artist;
      }
}
