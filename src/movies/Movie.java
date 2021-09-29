package movies;

public class Movie  implements Entertains{
    private String name;
    private String director;

    public Movie(String name, String director) throws IllegalArgumentException {
        if (name == null || name.isBlank() || director == null || director.isBlank()){
            throw new IllegalArgumentException();
        }else {
            this.name = name;
            this.director = director;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String audienceReaction() {
        return "Ohhhhh " + this.name + "was so awesome!";
    }
}
