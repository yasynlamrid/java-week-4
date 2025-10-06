package collections.exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 TODO:
 1. Create two lists of integers:
 - list1: [1, 3, 5, 7, 9]
 - list2: [2, 3, 4, 5, 6]
 2. Combine both into a new list that contains all elements.
 3. Remove duplicates from the combined list.
 4. Sort the final list in ascending order.
 5. Print the final result.
 */
public class Exercise2
{
    List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
    List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);






    public Exercise2(){

        List<Integer> combineLists = Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());



        System.out.println(combineLists);
        List<Integer> removeedDuplicate = removeDuplicate(combineLists);
        System.out.println(removeedDuplicate);
        System.out.println(sortedList(removeedDuplicate));


    }

    public List<Integer> removeDuplicate (List<Integer> list){

        for (int i = 0; i < list.size() ; i++){

            Integer current = list.get(i);
            for (int j = i+1; j < list.size(); j++){
                if (current.equals(list.get(j))){

                    list.remove(j);
                    j--;


                }


            }

        }
        return list;

    }
    public List<Integer> sortedList (List<Integer> list){

        Collections.sort(list);


        return list;

    }



    public static void main(String[] arg){

        new Exercise2();

    }




}
