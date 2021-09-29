package movies;

public class Comedy extends Movie{
    protected Boolean funny;

    public Comedy(String name, String director, Boolean funny) {
        super(name, director);
        this.funny = funny;
    }

    public Boolean isFunny() {
        return funny;
    }

    public void setFunny(Boolean funny) {
        this.funny = funny;
    }


}
