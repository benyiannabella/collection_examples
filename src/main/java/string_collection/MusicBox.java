package string_collection;

import java.util.ArrayList;

public class MusicBox {

    ArrayList<String> songList = new ArrayList<>();

    public MusicBox(ArrayList<String> songList) {
        this.songList = songList;
    }

    public ArrayList<String> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<String> songList) {
        this.songList = songList;
    }
}
