package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args){
        Set<String> mondaySubjects = new HashSet<>();

        mondaySubjects.add("Biologija");
        mondaySubjects.add("Matematika");
        mondaySubjects.add("Matematika");
        mondaySubjects.add("Matematika");
        mondaySubjects.add("Fizika");
        mondaySubjects.add("Chemija");
        mondaySubjects.add("Dailė");

        System.out.println("Ar pirmadienį yra biologija? " + mondaySubjects.contains("Biologija"));
        System.out.println("Ar pirmadienį yra lietuvių kalba? " + mondaySubjects.contains("lietuvių kalba"));

        System.out.println(System.lineSeparator()+"Visi pirmadienio dalykai:");

        Iterator<String> iterator = mondaySubjects.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
