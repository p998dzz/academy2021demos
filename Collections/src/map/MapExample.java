package map;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args){
        Map<String, Integer> gradeAverages = new HashMap<>();

        gradeAverages.put("Biologija", 9);
        gradeAverages.put("Matematika", 7);
        gradeAverages.put("Matematika", 10);
        gradeAverages.put("Matematika", 9);
        gradeAverages.put("Fizika", 8);
        gradeAverages.put("Chemija", 10);
        gradeAverages.put("Dailė", 9);
        gradeAverages.put("Lietuvių kalba", 5);
        gradeAverages.put("Darbai", 2);

        System.out.println("Matematika "+ gradeAverages.get("Matematika"));
        System.out.println("Chemija "+ gradeAverages.get("Chemija"));

        System.out.println(System.lineSeparator());
        System.out.println("Viso vidurkių:");
        for(Map.Entry<String,Integer> entry : gradeAverages.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
