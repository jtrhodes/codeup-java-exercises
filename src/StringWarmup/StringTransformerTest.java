package StringWarmup;

public class StringTransformerTest {
    public static void main(String[] args) {
        StringTransformer uppercase = new UpperCaseStringTransformer("this is the tale of captain jack sparrow");
        StringTransformer reverse = new ReverseStringTransformer("pirate so great of the seven seas");
        StringTransformer[] testing = new StringTransformer[2];
        testing[0] = uppercase;
        testing[1] = reverse;
        for(StringTransformer t : testing){
            System.out.println(t.transform());
        }
    }
}
