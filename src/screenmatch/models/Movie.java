package screenmatch.models;

import screenmatch.math.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie (String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
