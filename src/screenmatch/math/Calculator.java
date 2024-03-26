package screenmatch.math;


import screenmatch.models.Movie;
import screenmatch.models.Title;

public class Calculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Title title) {
        totalTime += title.getDurationInMinutes();
    }
}
