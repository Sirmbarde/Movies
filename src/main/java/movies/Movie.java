package movies;

public class Movie {
    public int id;
    public String title;
    public String genre;
    public int yearOfRelease;

    public Movie(String title, String genre, int quantity) {

        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie (){};

    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

