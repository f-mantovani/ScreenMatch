package screenmatch.Main;

import screenmatch.models.Movie;
import screenmatch.models.Series;
import screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1970);
        Movie anotherMovies = new Movie("Avatar", 2023);
        var newMovie = new Movie("Dogville", 2003);
        Series mySerie = new Series("Lost", 2000);

        myMovie.addReview(9);
        anotherMovies.addReview(4);
        newMovie.addReview(10);
        mySerie.addReview(5);



        ArrayList<Title> list = new ArrayList<>();
        list.add(newMovie);
        list.add(myMovie);
        list.add(anotherMovies);
        list.add(mySerie);
        System.out.printf("List size: %d movies \n", list.size());
        System.out.printf("First movie: %s \n", list.get(0).getName());
        for (Title item: list) {
            System.out.println(item);

            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.printf("Rating: %d \n", movie.getClassification());
            }
        }

//        list.forEach(System.out::println);


        List<String> nameList = new ArrayList<>();

        nameList.add("Jacqueline");
        nameList.add("Paulo");
        nameList.add("Adam Sandler");
        nameList.add("Felipe");

        System.out.println("\n");
        System.out.println(nameList);

        Collections.sort(nameList);
        System.out.println("\n");
        System.out.println("=======================================");
        System.out.println("After sorting");
        System.out.println("=======================================");
        System.out.println(nameList);

        System.out.println("\n");
        System.out.println("=======================================");
        System.out.println("After sorting");
        System.out.println("=======================================");
        Collections.sort(list);
        list.forEach(System.out::println);


        System.out.println("\n");
        System.out.println("=======================================");
        System.out.println("After sorting");
        System.out.println("=======================================");
        list.sort(Comparator.comparing(Title::getReleaseYear));
        list.forEach(System.out::println);
    }
}
