package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //default class
        //Dynamic Array

        //default generics:
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add(100);
        ar.add("testing");
        ar.add('c');
        ar.add(12.36);
        ar.add(true);

        System.out.println(ar);
        System.out.println(ar.get(4));
        System.out.println(ar.size());
        System.out.println("LI = "+ 0);
        System.out.println("HI = " + (ar.size()-1));

        ar.add(500);
        ar.add(400);
        System.out.println(ar.size());

    }
}
