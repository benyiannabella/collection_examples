package sort_object_collections;

import java.util.Objects;

public class Song implements Comparable<Song>{

    private String songTitle;
    private String artist;
    private String rating;
    private String bpm;

    public Song() {
    }

    public Song(String songTitle, String artist, String rating, String bpm) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return  "songTitle='" + songTitle + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpm='" + bpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songTitle, song.songTitle);
    }

    @Override
    public int hashCode() {
        return songTitle != null ? songTitle.hashCode() : 0;
    }

    @Override
    public int compareTo(Song o) {
        return Integer.compare(songTitle.compareTo(o.songTitle), 0);
    }
}
