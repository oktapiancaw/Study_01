package belajar;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class json {
    public static void main(String[] args) {
        JSONObject profile = new JSONObject();
        JSONArray hobbies = new JSONArray();

        hobbies.add("Gaming");
        hobbies.add(1);

        profile.put("name", "foo");
        profile.put("Hobbies", hobbies);
        System.out.println(profile);
    }
}
