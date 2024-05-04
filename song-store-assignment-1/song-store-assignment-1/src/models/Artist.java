package models;

import javax.swing.text.Utilities;

public class Artist {


    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    //TODO The artist name (String artistName)  in the system is entered by the user.
    //     Default value is "".
    //     When creating the Artist, truncate the name to 15 characters.
    //     When updating an existing Artist, only update the name if it is 15 characters or less.
    private String artistName ="";


    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    //TODO The verified status (boolean verified)  Default is false.
    private boolean verified = false;

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
public String toString(){
        return"Artist Name:"+artistName
                +",is verified:"+ Utilities.booleanToYN(verified);
}

}
