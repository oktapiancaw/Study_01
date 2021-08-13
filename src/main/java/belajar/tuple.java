package belajar;

import org.javatuples.Pair;

public class tuple {
    public static void main(String[] args) {
        Pair<String, String> pobj = new Pair<String, String>("", "");
        pobj.add("test", "test1");
        System.out.println(pobj.getValue(1));
        System.out.println("Emotions : "+ pobj);
    }
}
