package Challenges.EX41_60.S10_141_EX45;

public class Song {
    private String title;
    private double duration;
 
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
 
    public String getTitle() {
        return title;
    }
 
    @Override
    public String toString() {
        return String.format("%s: %.1f", title, duration);
    }
}