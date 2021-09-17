package StringWarmup;

abstract class StringTransformer {
    protected String str;

    public StringTransformer(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    abstract String transform();
}
