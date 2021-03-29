package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {



        ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Java","Python","JavaScript","PHP"));
        System.out.println(ar1);

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("Dev ops");

        ar1.addAll(ar2);
/*        ar1.addAll(3,ar2);
        System.out.println(ar1);
        ar1.clear();

        System.out.println(ar1);*/

        ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
        System.out.println(cloneList);

        System.out.println(ar1.contains("Python"));
        System.out.println(ar1.contains("C"));

        System.out.println(ar1.indexOf("Testing")>6);

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("John","Paul","Jack","Lisa","John","Sam","John"));

        System.out.println("----------");
        System.out.println(list1);

        System.out.println(list1.lastIndexOf("John"));

        list1.remove(1);
        System.out.println(list1);
        list1.remove("Lisa");
        System.out.println(list1);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,5,6,7,8,9,4));
        numbers.removeIf((num->num%2==0));
        System.out.println(numbers);

        //retainAll
        ArrayList<String> namesList = new ArrayList<String>
                                        (Arrays.asList("John","Paul","Jack","Lisa","Sam","John"));
        System.out.println(namesList);
        namesList.retainAll(Collections.singleton("John"));
        System.out.println(namesList);

        //subList
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,5,6,7,8,9,4,10,11,12,13,14));
        ArrayList<Integer> subList = new ArrayList<>(numbers1.subList(2,10));
        System.out.println(numbers1);
        System.out.println(subList);

        //toArray
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Naveen", "John", "Car"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));
        for(Object o:arr){
            System.out.println((String) o);
        }






    }
}
