package baseline;

import java.util.*;

public class Solution39 {
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        //create a hash map with the person class
        Map<Integer, Person> map = new Hashtable<>();


        //do this by manually typing in names
        //messed with the numbers to show that it works
        Person person6 = new Person("Jacquelyn", "Jackson", "DBA");
        Person person5 = new Person("Jake", "Jacobson", "Programmer");
        Person person4 = new Person("John", "Johnson", "Manager", "2016-12-31");
        Person person3 = new Person("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Person person2 = new Person("Sally", "Weber ", "Web Developer", "2015-12-18");
        Person person1 = new Person("Tou", "Xiong", " Software Engineer", "2016-10-05");
        //add all the people into the hash map
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);
        map.put(4, person4);
        map.put(5, person5);
        map.put(6, person6);
        // use features with maps to sort by last name
        ArrayList<String> names = new ArrayList<String>();
        names.add(person1.getLastName());
        names.add(person2.getLastName());
        names.add(person3.getLastName());
        names.add(person4.getLastName());
        names.add(person5.getLastName());
        names.add(person6.getLastName());
        //sorts the arrayList
        Collections.sort(names);
        //runs and checks each index
        System.out.printf("Name   \t                   Job \t            Seperation Date\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 7; j++) {
                //checks to see if the lastname is equal if so prints it out
                if (names.get(i).equals(map.get(j).getLastName())) {
                    if (map.get(j).getSeparationDate() == null) {
                        System.out.printf("%s %-20s %-25s\n", map.get(j).getFirstName(), map.get(j).getLastName(), map.get(j).getDepartment());

                    } else {
                        System.out.printf("%s %-20s %-25s %-10s \n", map.get(j).getFirstName(), map.get(j).getLastName(), map.get(j).getDepartment(), map.get(j).getSeparationDate());
                    }
                }

            }
        }

    }

}