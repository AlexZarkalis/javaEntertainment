import java.util.ArrayList;

public class Series extends Show{
    private int numberOfSeasons;
    private String lastSeasonYear;
    private ArrayList<Integer> episodes;

    public Series () {
    }
    public Series (String showTitle, int showReleaseYear, ArrayList<String> showGenres, String showCountryOfOrigin, String showDirectorName, ArrayList<Person> showActors, int showId, int numberOfSeasons, String lastSeasonYear, ArrayList<Integer> episodes) {
        this.showTitle = showTitle;
        this.showReleaseYear = showReleaseYear;
        this.showGenres = showGenres;
        this.showCountryOfOrigin = showCountryOfOrigin;
        this.showDirectorName = showDirectorName;
        this.showActors = showActors;
        this.showId = showId;
        this.numberOfSeasons = numberOfSeasons;
        this.lastSeasonYear = lastSeasonYear;
        this.episodes = episodes;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getLastSeasonYear() {
        return lastSeasonYear;
    }

    public void setLastSeasonYear(String lastSeasonYear) {
        this.lastSeasonYear = lastSeasonYear;
    }

    public ArrayList<Integer> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Integer> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Id: " + this.showId + ", Title: " + this.showTitle + ", Genre: " + this.showGenres + ", Type: Series " + ", Director Name: " + this.showDirectorName;
    }
}
