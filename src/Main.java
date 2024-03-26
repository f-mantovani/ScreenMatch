import screenmatch.math.Calculator;
import screenmatch.math.RecommendationFilter;
import screenmatch.models.Episode;
import screenmatch.models.Movie;
import screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1970);
        myMovie.setDurationInMinutes(180);

        myMovie.addReview(8);
        myMovie.addReview(3);
        myMovie.addReview(10);
        myMovie.showInformation();

        Series mySerie = new Series("Lost", 2000);
        mySerie.setSeasons(10);
        mySerie.setEpisodesPerSeason(24);
        mySerie.setMinutesPerEpisode(50);
        System.out.printf("Time to finish %s %d minutes", mySerie.getName() ,mySerie.getDurationInMinutes());

        Movie anotherMovies = new Movie("Avatar", 2023);
        anotherMovies.setDurationInMinutes(120);

        Calculator myCalc = new Calculator();
        myCalc.add(myMovie);
        myCalc.add(anotherMovies);
        myCalc.add(mySerie);
        System.out.printf("\nTotal time %d \n", myCalc.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(7);
        episode.setSerie(mySerie);
        episode.setTotalViews(120);
        filter.filter(episode);

        var newMovie = new Movie("Dogville", 2003);
        newMovie.setDurationInMinutes(200);
        newMovie.addReview(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(newMovie);
        movieList.add(myMovie);
        movieList.add(anotherMovies);
        System.out.printf("List size: %d movies \n", movieList.size());
        System.out.printf("First movie: %s \n", movieList.get(0).getName());
        System.out.println(movieList);
    }
}
