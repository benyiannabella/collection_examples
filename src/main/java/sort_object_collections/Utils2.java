package sort_object_collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Utils2 {

    public void readFile(){
        ArrayList<Song> songs = new ArrayList<>();
        File file = new File("./target/classes/songs.txt");
        String song;
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
            while ((song=bufferedReader.readLine())!=null){
                createList(song, songs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArtistComparator comparator = new ArtistComparator();
        System.out.println("_______Sort by Artist using Comparator_________________");
        Collections.sort(songs, comparator);
        printSongs(songs);
        System.out.println("__________________Sort By Title with Comparable_____________");
        Collections.sort(songs);
        printSongs(songs);
        System.out.println("______________Using Set__________________");
        HashSet<Song> songSet = new HashSet<>();
        songSet.addAll(songs);
        printSongs(songSet);
    }

    public void createList(String songFile, ArrayList<Song> songs){
        String[] songDetails = songFile.split("/");
        Song song = new Song(songDetails[0],songDetails[1],songDetails[2],songDetails[3]);
        songs.add(song);
    }

    public void printSongs(Collection<Song> songs){
        songs.forEach(System.out :: println);
    }

}
