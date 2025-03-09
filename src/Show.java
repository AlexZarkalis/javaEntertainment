import java.util.ArrayList;

public class Show {
    protected String showTitle;
    protected int showReleaseYear;
    protected ArrayList<String> showGenres;
    protected String showCountryOfOrigin;
    protected String showDirectorName;
    protected ArrayList<Person> showActors;
    protected int showId;

    public Show () {
    }
    public Show (String showTitle, int showReleaseYear, ArrayList<String> showGenres, String showCountryOfOrigin, String showDirectorName, ArrayList<Person> showActors, int showId) {
        this.showTitle = showTitle;
        this.showReleaseYear = showReleaseYear;
        this.showGenres = showGenres;
        this.showCountryOfOrigin = showCountryOfOrigin;
        this.showDirectorName = showDirectorName;
        this.showActors = showActors;
        this.showId = showId;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public int getShowReleaseYear() {
        return showReleaseYear;
    }

    public void setShowReleaseYear(int showReleaseYear) {
        this.showReleaseYear = showReleaseYear;
    }

    public ArrayList<String> getShowGenres() {
        return showGenres;
    }

    public void setShowGenres(ArrayList<String> showGenres) {
        this.showGenres = showGenres;
    }

    public String getShowCountryOfOrigin() {
        return showCountryOfOrigin;
    }

    public void setShowCountryOfOrigin(String showCountryOfOrigin) {
        this.showCountryOfOrigin = showCountryOfOrigin;
    }

    public String getShowDirectorName() {
        return showDirectorName;
    }

    public void setShowDirectorName(String showDirectorName) {
        this.showDirectorName = showDirectorName;
    }

    public ArrayList<Person> getShowActors() {
        return showActors;
    }

    public void setShowActors(ArrayList<Person> showActors) {
        this.showActors = showActors;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    @Override
    public String toString() {
        return  "Id: " + this.showId + ", Title: " + this.showTitle + ", Genre: " + this.showGenres + ", Type: Movie, " + "Director Name: " + this.showDirectorName ;
    }
}
