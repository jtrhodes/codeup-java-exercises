package Media;

public class Magazine extends Media{
    @Override
    public void retrieveMedia() {
        super.retrieveMedia();
    }

    @Override
    void listenTo() {
        System.out.println("I dont like people reading things out loud");
    }

    public void readingIt(){
        System.out.println("I'm more of a book person");
    }
}
