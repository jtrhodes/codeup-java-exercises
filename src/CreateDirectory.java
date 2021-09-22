import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    public static void main(String[] args) {
        Path path = Paths.get("src/test");
        try {
            Files.createDirectory(path);
        } catch(IOException xd) {
        xd.printStackTrace();
        }
    }
}
