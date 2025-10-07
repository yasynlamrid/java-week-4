package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<Integer> numbers with at least 8 integers.
 * 2. Use an Iterator to remove all even numbers.
 * 3. Print the list before and after removal.
 *
 */
public class Exercise2
{

    private List<Integer> numbers;
    private Iterator<Integer> it;

    public Exercise2(){

        numbers = new ArrayList<>(Arrays.asList(2,4,77,8,10,6,4,47,5,60,3));
        System.out.println("Before removal: " + numbers);

        it = numbers.iterator();
        removeAll(it);
        System.out.println(numbers);

    }


    public void removeAll(Iterator<Integer> it) {
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
    }


    public static void main(String[] arg){

        new Exercise2();

    }



}
