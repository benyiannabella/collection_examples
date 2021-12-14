package sort_object_collections;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils2 {

    public ArrayList<Song> readFile(){
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
        Collections.sort(songs);
        printSongs(songs);
        return songs;
    }

    public void createList(String songFile, ArrayList<Song> songs){
        String[] songDetails = songFile.split("/");
        Song song = new Song(songDetails[0],songDetails[1],songDetails[2],songDetails[3]);
        songs.add(song);
    }

    public void printSongs(ArrayList<Song> songs){
        songs.forEach(System.out :: println);
    }

}
