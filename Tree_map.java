package Day_two;

import java.util.TreeMap;
import java.util.Map;

public class Tree_map {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("B", 4);
        treeMap.put("D", 6);
        treeMap.put("A", 5);
        treeMap.put("C", 1);

        System.out.println(treeMap);
    
        TreeMap<Integer, String> TRUTH = new TreeMap<>();	
        TRUTH.put(6, "Ram");
        TRUTH.put(10, "Radha");
        TRUTH.put(17, "Krish");
        TRUTH.put(1, "Sita");
        System.out.println(TRUTH);
    }
}
