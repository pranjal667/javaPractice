import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<String> list3  = new ArrayList<>();
        // ArrayList<Float> list3  = new ArrayList<>();
    
        //Add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements

        int element = list.get(0);
        System.out.println(element);

        //add elements in between

        list.add(1,1);
        System.out.println(list);

        //set element

        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of array

        int size = list.size();
        System.out.println(size);

        //loops

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting

        Collections.sort(list);
        System.out.print(list);

   }
}
