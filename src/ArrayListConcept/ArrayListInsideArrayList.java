package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInsideArrayList {

    public static void main(String[] args) {

        //list with other collections:


        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(20,10,10));
        System.out.println(numbers.indexOf(10));


        ArrayList<String> languages = new ArrayList<String>(Arrays.asList("Java","Python","JavaScript","PHP"));
        System.out.println(languages);

        String arS = "asdhklbvasdkb asdfvasdkm";
        //char res[] = arS.toCharArray();
        String result[]= arS.split("");
        ArrayList<String> alaphabets = new ArrayList<String>(Arrays.asList(result));
        Collections.sort(alaphabets);
        System.out.println(alaphabets);

        System.out.print(alaphabets.get(1));

        for(int i=1, count =1;i<alaphabets.size();i++){

            if(alaphabets.get(i).equalsIgnoreCase(alaphabets.get(i-1))){
                count = count + 1;
                if(i== alaphabets.size()-1){
                    System.out.println("'s count: "+count);
                }
            }
            else{
                System.out.println("'s count: "+count);
                count = 1;
                System.out.print(alaphabets.get(i));
                if(i== alaphabets.size()-1){
                    System.out.println("'s count: "+count);
                }
            }
        }

    }
}
