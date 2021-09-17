package Media;

abstract class Media {
    public void retrieveMedia(){
        System.out.println("You have found what your looking for");
    }
    abstract void listenTo();
    abstract void readingIt();
}
