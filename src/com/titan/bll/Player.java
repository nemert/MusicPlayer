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
public class Player {
    public PlayList playlist;
    public int currentSong;
    public boolean isPlaying = false;

    public void loadPlaylist(PlayList playlist) {
        playlist = playlist;
        currentSong = 0;
        isPlaying = true;
    }

    public Song currentSong() {
        return playlist.getSong(currentSong);
    }

    public void nextSong() {
        currentSong++;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void stop() {
        if (isPlaying) {
            isPlaying = false;
        }
    }
}
