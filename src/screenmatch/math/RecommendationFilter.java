package screenmatch.math;

public class RecommendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("It's in the favorites at the moment");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Well rated right now");
        } else {
            System.out.println("Add to your list to watch later");
        }
    }
}
