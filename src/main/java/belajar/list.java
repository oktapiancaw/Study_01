package belajar;

import java.util.ArrayList;
import java.util.List;

import belajar.data.Biodata;
import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.json.simple.JSONObject;
public class list {
    public static void main(String[] args) {
        Biodata biodata = new Biodata("Oktapian", 18, "Planet Bumi");
        Biodata biodata2 = new Biodata("Bambang", 20, "Planet Venus");
        Biodata biodata3 = new Biodata("Ucok", 16, "Planet Jupiter");

        biodata.addHobbies("Gaming");
        biodata.addHobbies("Coding");

        biodata2.addHobbies("Flying");
        biodata3.addHobbies("Diving");

        biodata.setNoHp("Pribadi", "081234567890");
        biodata2.setNoHp("Pribadi", "081223368170");
        biodata2.setNoHp("Pribadi", "081234567890"); // akan ditimpa

        List<Object> data = new ArrayList<>();
        data.add(biodata.toJSON());
        data.add(biodata2.toJSON());

        Pair<Object, Object> pair = Pair.fromCollection(data);
//        System.out.println("Sebelum ditambah");
//        System.out.println(data);
//        System.out.println(pair);
        data.add(biodata3.toJSON());
        pair.add(biodata3.toJSON());

        Triplet<Object, Object, Object> triplet = pair.add(biodata3.toJSON());

//        System.out.println("Setelah ditambah");
//        System.out.println(data);
//        System.out.println(pair);

//        System.out.println("TRIPLET");
//        System.out.println(triplet);
        for( Object item : data){
            System.out.println(item);
        }
    }
}
