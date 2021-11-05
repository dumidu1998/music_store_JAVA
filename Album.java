import java.util.Arrays;

public class Album {
    private String artist;
    private String title;
    private int releaseYear;
    private Song[] songList;

    // default constructor
    public Album() {
        artist = "";
        title = "";
        releaseYear = 0;
        songList = new Song[0];
    }

    // copy constructor
    public Album(Album newAlbum) {
        artist = newAlbum.artist;
        title = newAlbum.title;
        releaseYear = newAlbum.releaseYear;
        songList = new Song[newAlbum.songList.length];
        for (int i = 0; i < songList.length; i++) {
            songList[i] = new Song(newAlbum.songList[i]);
        }
    }

    // constructor with parameters
    public Album(String artist, String title, int releaseYear, Song[] songList) {
        this.artist = artist;
        this.title = title;
        this.releaseYear = releaseYear;
        this.songList = new Song[songList.length];
        for (int i = 0; i < songList.length; i++) {
            this.songList[i] = new Song(songList[i]);
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Song[] getSongList() {
        return songList;
    }

    public void setSongList(Song[] songList) {
        this.songList = songList;
    }

    // toString method
    public String toString() {
        return "Album [artist=" + artist + ", releaseYear=" + releaseYear + ", songList=" + Arrays.toString(songList)
                + ", title=" + title + "]";
    }

    // equals method
    public boolean equals(Album other) {
        if (this.artist.equals(other.artist) && this.title.equals(other.title) && this.releaseYear == other.releaseYear
                && this.songList.length == other.songList.length) {
            for (int i = 0; i < this.songList.length; i++) {
                if (!this.songList[i].equals(other.songList[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
