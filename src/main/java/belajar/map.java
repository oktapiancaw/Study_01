package belajar;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//      PR : kelebihannya dariapda map lain

//        Map<Integer, Integer> map2 = new WeakHashMap();
//        System.gc();
        map.put("nama.pertama", "udin");
        map.put("nama.kedua", "sitinja");

        System.out.println(map);
    }
}
