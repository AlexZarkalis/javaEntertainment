import java.util.ArrayList;

public class UserCredentials {
    private String username;
    private String email;
    private String password;
    private ArrayList<Show> reviewedShows = new ArrayList<>();
    private ArrayList<Integer> ratingShows = new ArrayList<>();
    private ArrayList<String> favoriteDirectors = new ArrayList<>();
    private ArrayList<String> favoriteActors = new ArrayList<>();

    public UserCredentials() {
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setReviewedShows(ArrayList<Show> reviewedShows) {
        this.reviewedShows = reviewedShows;
    }
    public ArrayList<Show> getReviewedShows() {
        return reviewedShows;
    }

    public void setRatingShows(ArrayList<Integer> ratingShows) {
        this.ratingShows = ratingShows;
    }

    public ArrayList<Integer> getRatingShows() {
        return ratingShows;
    }

    public void setFavoriteDirectors(ArrayList<String> favoriteDirectors) {
        this.favoriteDirectors = favoriteDirectors;
    }

    public ArrayList<String> getFavoriteDirectors() {
        return favoriteDirectors;
    }

    public void setFavoriteActors(ArrayList<String> favoriteActors) {
        this.favoriteActors = favoriteActors;
    }

    public ArrayList<String> getFavoriteActors() {
        return favoriteActors;
    }
}
