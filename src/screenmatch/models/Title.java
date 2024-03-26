package screenmatch.models;

public class Title {
    final private String name;
    private int durationInMinutes;
    private int releaseYear;
    private boolean isInPlan;
    private double rating;
    private int reviewTotal;

    public Title (String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isInPlan() {
        return isInPlan;
    }

    public void setInPlan(boolean inPlan) {
        isInPlan = inPlan;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie: %s (%d)".formatted(this.getName(), this.getReleaseYear());
    }

    public int getReviewTotal() {
        return reviewTotal;
    }

    public void showInformation() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Release year: %d \n", getReleaseYear());
        System.out.printf("Average Score: %.2f \n", getAverage());
        System.out.printf("Number of reviews: %d \n", getReviewTotal());
    }

    public void addReview(double rate){
        rating += rate;
        reviewTotal += 1;
    }

    public double getAverage() {
        return rating / reviewTotal;
    }


}
