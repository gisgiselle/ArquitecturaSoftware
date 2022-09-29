import java.sql.SQLOutput;

public class MovieStar implements FamousPerson{

    private String name;
    private String movie;

    @Override
    public void showDetails() {
        System.out.println(name + " is a movie star in "+ movie);
    }

    @Override
    public void influencePeople() {
        System.out.println(name + " changes people style by" +
                " wearing something in the movie" +movie);
    }

    @Override
    public void createControversy() {
        System.out.println("Movie star "+name + " says something racist ");
    }

    public MovieStar(String name, String movie) {
        this.name = name;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

}
