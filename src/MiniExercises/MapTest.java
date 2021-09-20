package MiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapTest {
    private static List<String> keys = new ArrayList<>(Arrays.asList(
            "first key",
            "second key",
            "third key",
            "fourth key"
    ));

    private static List<String> values = new ArrayList<>(Arrays.asList(
            "first value",
            "second value",
            "third value",
            "fourth value"
    ));
    public static HashMap<String, String> createMap(List<String> list1, List<String> list2){
        HashMap<String, String> newMap = new HashMap<>();
        for(int i = 0; i < list1.size(); i++){
            newMap.put(list1.get(i), list2.get(i));
        }
        return newMap;
    }

    public static void main(String[] args) {
        System.out.println(createMap(keys, values));
    }
}
