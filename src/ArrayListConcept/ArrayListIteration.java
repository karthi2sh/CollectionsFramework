package ArrayListConcept;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();

        studentList.add("Ram");
        studentList.add("Sam");
        studentList.add("Naveen");
        studentList.add("Akbar");

        //typical for loop
        for(int i=0; i< studentList.size();i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("-------------");
        //for each loop
        for(String s:studentList){
            System.out.println(s);
        }

        System.out.println("-------------");
        //JDK 8 -> streams with lambda:
        studentList.stream().forEach(ele-> System.out.println(ele));

        System.out.println("-------------");
        //iterator:
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
