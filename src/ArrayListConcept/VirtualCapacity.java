package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>(20);
        System.out.println(ar.size()); // Physical Capacity = 0

        ar.add(100);
        System.out.println(ar.size()); //PC = 1

        ar.add(200);
        ar.add(300);
        ar.add(500);
        ar.add(400);

        System.out.println(ar.size()); //pc =5
    }
}
