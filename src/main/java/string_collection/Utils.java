package string_collection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Utils {
    ArrayList<String> songList = new ArrayList<>();
    public ArrayList<String> readFile(){
        File songs = new File("./target/classes/songs.txt");
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(songs));
            while((line = bufferedReader.readLine()) != null){
                addSong(line, songList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(songList);
        printList(songList);
        return songList;
    }

    public void addSong(String line, ArrayList<String> songList){
        String [] songTitles = line.split("/");
        songList.add(songTitles[0]);
    }

    public void printList(ArrayList<String> list){
        for(String song : list){
            System.out.println(song);
        }
    }
}
