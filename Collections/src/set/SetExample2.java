package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {

    /**
     * Kas čia įvyko?
     * @param args
     */
    public static void main(String[] args){

        Set<Subject> mondaySubjects = new HashSet<>();

        mondaySubjects.add(new Subject("1","Matematika"));
        mondaySubjects.add(new Subject("1","Chemija"));
        mondaySubjects.add(new Subject("2","Dailė"));

        Subject testSubject1 = new Subject("1", "Matematika");
        Subject testSubject2 = new Subject("1", "Chemija");
        System.out.println("Ar pirmadienį yra Matematika? " + mondaySubjects.contains(testSubject1));
        System.out.println("Ar pirmadienį yra Chemija? " + mondaySubjects.contains(testSubject2));

        System.out.println(System.lineSeparator()+"Visi pirmadienio dalykai:");

        Iterator<Subject> iterator = mondaySubjects.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}
