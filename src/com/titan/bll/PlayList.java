package com.titan.bll;

import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikki
 */
public class PlayList {

    
    List<Song> playlist;
    String name;
    private boolean isPlaying;

    public PlayList(String name) {
        playlist = new ArrayList<Song>();
        this.name = name;        
    }
    
    public int songCount(){
        return playlist.size();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addSong(Song song){
        playlist.add(song);
    }
    
    public Song getSong(int i){
        return playlist.get(i);
    }
    

}
