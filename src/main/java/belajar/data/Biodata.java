package belajar.data;

import org.json.simple.JSONObject;

import java.util.*;

public class Biodata {
    private String name;
    private Integer age;
    private String Address;
    private List<String> hobbies;
    private List<String> favColor;
    private Map<String, String> noHp;

    public Biodata(String name, Integer age, String Address) {
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.hobbies = new ArrayList<>();
        this.favColor = new ArrayList<>();
        this.noHp = new HashMap<>();
    }

    public void addHobbies(String Hobby){
        hobbies.add(Hobby);
    }
    public void addColor(String color){
        favColor.add(color);
    }

    public Map<String, String> getNoHp() {
        return noHp;
    }

    public void setNoHp(String key, String no) {
        noHp.put(key, no);
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public List<String> getFavColor() {
        return favColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public JSONObject toJSON(){
        JSONObject jo = new JSONObject();
        jo.put("Nama", name);
        jo.put("Umur", age);
        jo.put("Alamat", Address);
        jo.put("Hobi", !hobbies.isEmpty() ? hobbies : "Tidak ada");
        jo.put("WarnaFavorit", !favColor.isEmpty() ? favColor : "Tidak ada");
        jo.put("No Hp", noHp);
        return jo;
    }
}
