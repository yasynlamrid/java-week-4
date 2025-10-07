package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<String> animals containing at least 5 animal names.
 * 2. Use a for-each loop to print each animal in uppercase letters.
 * 3. Add a message like: "Animal name: LION"
 * 4. Use an iterator to remove any animal names that contain the letter 'a'.
 * 5. Print the modified list using a for-each loop.
 */

public class Exercise1 {

    private List<String> animals;

    public Exercise1() {

        animals = new ArrayList<>(Arrays.asList("Dog", "Cat", "Tiger", "Lion", "Mouse"));


        displayAnimals(animals);

        System.out.println("====================================================");


        removeWithIterator();


        displayAnimals(animals);
    }


    private void removeWithIterator() {
        Iterator<String> it = animals.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.toLowerCase().contains("a")) {
                it.remove();
            }
        }
    }


    private void displayAnimals(List<String> animals) {
        for (String animal : animals) {
            System.out.println("Animal name: " + animal.toUpperCase());
        }
    }

    public static void main(String[] args) {
        new Exercise1();
    }
}
