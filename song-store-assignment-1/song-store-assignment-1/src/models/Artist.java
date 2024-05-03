package models;

import utils.Utilities;

import java.util.Objects;

public class Artist {


    //TODO The artist name (String artistName)  in the system is entered by the user.
    //     Default value is "".
    //     When creating the Artist, truncate the name to 15 characters.
    //     When updating an existing Artist, only update the name if it is 15 characters or less.
    private String artistName= " ";


    //TODO The verified status (boolean verified)  Default is false.
    private boolean verified= false;

    //TODO Add the constructor, Artist(String, boolean), that adheres to the above validation rules

    public Artist(String artistName, boolean verified) {
        this.artistName = artistName;
        this.verified = verified;
    }

    //TODO Add a getter and setter for each field, that adheres to the above validation rules


    //TODO Add a generated equals method.


    //TODO The toString should return the string in this format:
    //      Taylor Swift is a verified artist  OR
    //      Shane Hennessy is not a verified artist

    public String getArtistName() {
        return artistName;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;

    }
    public void setArtistName(String artistName){
        if(Utilities.validateStringLength(artistName,15)){
            this.artistName=artistName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return verified == artist.verified && Objects.equals(artistName, artist.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, verified);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", verified=" + verified +
                '}';
    }

}
