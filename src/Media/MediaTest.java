package Media;

public class MediaTest {
    public static void main(String[] args) {
        Media musicCd = new CD();
        musicCd.listenTo();

        Media sportsMagazine = new Magazine();
        sportsMagazine.retrieveMedia();
    }
}
