package Media;

public class CD extends Media {
    @Override
    public void retrieveMedia() {
        super.retrieveMedia();
    }

    public void listenTo(){
        System.out.println("This audio is fantastic");
    }

    @Override
    void readingIt() {
        System.out.println("The dude next to me is writing down the lyrics does this count?");
    }
}
