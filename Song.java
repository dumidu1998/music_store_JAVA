class Song {

    private String name;
    private int time;
    private String genre;

    // with parameters constructor
    public Song(String name, int time, String genre) {
        this.name = name;
        this.time = time;
        this.genre = genre;
    }

    // copy constructor
    public Song(Song song) {
        this.name = song.getName();
        this.time = song.getTime();
        this.genre = song.getGenre();
    }

    // default constructor
    public Song() {
        this.name = "";
        this.time = 0;
        this.genre = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // toString method
    public String toString() {
        return "Song [name=" + genre + ", name=" + name + ", time=" + time + "]";
    }

    // equals method
    public boolean equals(Object inObject) {

        boolean isEqual = false;
        Song inSong = null;

        if (inObject instanceof Song) {
            inSong = (Song) inObject;
            if (name.equals(inSong.getName()))
                if (genre.equals(inSong.getGenre()))
                    if (time == inSong.getTime())
                        isEqual = true;
        }
        return isEqual;
    }

}