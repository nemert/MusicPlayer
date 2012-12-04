package com.titan.bll;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikki
 */
public class Song {
    public String title;
    public String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
}
