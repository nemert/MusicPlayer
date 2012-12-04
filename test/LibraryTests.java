/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titan.bll.Player;
import com.titan.bll.Song;
import com.titan.bll.Library;
import com.titan.bll.PlayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Nikki
 */
public class LibraryTests {
    
    public LibraryTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void emptyLibraryTest() {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongIncrementsTest(){
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("My Posse's On Broadway", "Sir Mix a Lot"));
        myLibrary.addSong(new Song("Brass Monkey", "Beastie Boys"));
        assertEquals(2, myLibrary.songCount());
    }
    
    @Test
    public void removeSongIncrementsTest(){
        Library myLibrary = new Library();
        myLibrary.removeSong(new Song("My Posse's On Broadway", "Sir Mix a Lot"));
        myLibrary.removeSong(new Song("Brass Monkey", "Beastie Boys"));
        assertEquals(0, myLibrary.songCount());
    }
    
    @Test
    public void addNewPlaylistTest(){
        PlayList newPlayList = new PlayList("Nikki's Mix");
        assertEquals(0, newPlayList.songCount());
    }
    
    @Test
    public void skipSongs(){
        int count = 0;
        Set<String> set = new HashSet<String>();
        set.add("My Posse's On Broadway");
        set.add("Brass Monkey");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + ", ");
            count++;
        }
        assertEquals(2, count);
    }
    
    @Test
    public void sortTitle(){
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("My Posse's On Broadway", "Sir Mix a Lot"));
        myLibrary.addSong(new Song("Brass Monkey", "Beastie Boys"));
        myLibrary.addSong(new Song("Boyfriend", "Justin Bieber"));
        assertEquals("My Posse's On Broadway", myLibrary.getSong(0).getTitle());
        myLibrary.sortTitle();
        assertEquals("Boyfriend", myLibrary.getSong(0).getTitle());
    }
    
    @Test
    public void sortArtist(){
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("My Posse's On Broadway", "Sir Mix a Lot"));
        myLibrary.addSong(new Song("Brass Monkey", "Beastie Boys"));
        myLibrary.addSong(new Song("Boyfriend", "Justin Bieber"));
        assertEquals("Sir Mix a Lot", myLibrary.getSong(0).getArtist());
        myLibrary.sortArtist();
        assertEquals("Beastie Boys", myLibrary.getSong(0).getArtist());
    }
    
    @Test
    public void stopSong() {
        Player myPlayer = new Player();
        PlayList myPlaylist = new PlayList("Nikki's List");
        myPlaylist.addSong(new Song("Killer Queen", "Queen"));
        myPlayer.loadPlaylist(myPlaylist);
        assertTrue(myPlayer.isPlaying());
        myPlayer.stop();
        assertFalse(myPlayer.isPlaying);
        
    }
    
}
