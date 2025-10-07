package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a Set<String> names with several names (e.g. "Ali", "Sara", "Lina", "Amir", "Sami").
 * 2. Use an Iterator to remove all names that start with the letter 'A'.
 * 3. Print the set before and after removal.
 *
 */
public class Exercise3
{

    private Set<String> names;
    private Iterator<String> it;

    public Exercise3(){


        names = new HashSet<>(Arrays.asList("Ali", "Sara", "Lina", "Amir", "Sami"));
        System.out.println(names);
        it = names.iterator();
        removeWord(it);
        System.out.println(names);

    }

    public void removeWord(Iterator<String> it){

        while (it.hasNext()){
            String str = it.next();
            if(str.charAt(0) == 'A'){

                it.remove();
            }
        }
    }

    public static void main(String[] args){

        new Exercise3();
    }

}

