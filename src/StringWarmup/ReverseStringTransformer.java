package StringWarmup;

public class ReverseStringTransformer extends StringTransformer{
    public ReverseStringTransformer(String str) {
        super(str);
    }

//

    String transform() {
            char[] in = str.toCharArray();
            int begin=0;
            int end=in.length-1;
            char temp;
            while(end>begin){
                temp = in[begin];
                in[begin]=in[end];
                in[end] = temp;
                end--;
                begin++;
            }
            return new String(in);
        }

}
