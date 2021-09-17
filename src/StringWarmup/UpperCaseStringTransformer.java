package StringWarmup;

import java.util.Locale;

public class UpperCaseStringTransformer extends StringTransformer{

    public UpperCaseStringTransformer(String str) {
        super(str);
    }

    String transform() {
        return str.toUpperCase(Locale.ROOT);
    }

//    @Override
//    String transform() {
//        return null;
//    }
}
