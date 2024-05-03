package models;

import utils.Utilities;

import java.util.Objects;

public class Song {

    //TODO The song id (int songId) is between 1000 to 9999(both inclusive).  Default is 9999.
   private int songId =0;
   private String name =" ";
   private Artist artist;
   private int length=1;

    //TODO The song name (String name).
    //     Default value is "".
    //     When creating the song, truncate the name to 20 characters.
    //     When updating an existing song, only update the name if it is 20 characters or less.

    //TODO The song's artist (Artist artist)
    //    You should have already written the Artist class
    //     When creating the song, you should have the artist object as a parameter

    //TODO The length of the song in seconds (int length) is between 1 and 600. Default is 1.

    //TODO Add the constructor, Song(int, String, Artist), that adheres to the above validation rules

    public Song(int songId, String name, Artist artist) {
        this.songId = songId;
        this.name = name;
        this.artist = artist;
    }


    //TODO Add a getter and setter for each field, that adheres to the above validation rules

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
       if(Utilities.validRange(songId,1000,9999)){
           this.songId = songId;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Utilities.validateStringLength(name,15))
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (Utilities.validRange(length,1,600))
        this.length = length;
    }
//TODO Add a generated equals method.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && length == song.length && Objects.equals(name, song.name) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, name, artist, length);
    }


    //TODO The toString should return the string containing each of the field values including the use of the artist's toString()

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", name='" + name + '\'' +
                ", artist=" + artist +
                ", length=" + length +
                '}';
    }
}