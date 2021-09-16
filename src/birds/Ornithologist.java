package birds;

import org.jetbrains.annotations.NotNull;

public class Ornithologist {

    public static void changeBirdName(String newBirdName, Bird birdToRename){
        String oldBirdName = birdToRename.getName();
        birdToRename.setName(newBirdName);
        System.out.println(oldBirdName + " has now been changed to" + newBirdName);
    }
}
