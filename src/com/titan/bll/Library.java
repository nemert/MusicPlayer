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
public class Library {
    
    List<Song> songs;
    
    public Library(){
        songs = new ArrayList<Song>();
    }
    
    public void addSong(Song song){
        songs.add(song);
    }
    
    public int songCount(){
        return songs.size();
    }
    
    public void removeSong(Song songToRemove) {
        songs.remove(songToRemove);
    }
    
    public Song getSong(int i) {
        return songs.get(i);
    }

    public void sortTitle() {
        //Sort array
        Collections.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song s1, Song s2) {
                return s1.getTitle().compareToIgnoreCase(s2.getTitle());
            }
        });
    }
    
    public void sortArtist(){
         //Sort array
        Collections.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song s1, Song s2) {
                return s1.getArtist().compareToIgnoreCase(s2.getArtist());
            }
        });
    }
    
}
