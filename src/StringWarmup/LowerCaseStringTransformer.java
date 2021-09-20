package StringWarmup;

import java.util.Locale;

public class LowerCaseStringTransformer extends StringTransformer {

    public LowerCaseStringTransformer(String str) {
        super(str);
    }

    String transform() {
        return str.toLowerCase(Locale.ROOT);
    }

}
