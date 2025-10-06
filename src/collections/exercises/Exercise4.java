package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Set<Integer> randomNumbers and add 15 random integers between 1 and 20.
 2. Check if the set contains the number 10.
 3. Remove all numbers less than 5.
 4. Print the final set.
 */
public class Exercise4
{
    Set<Integer> randomNumbers = new HashSet<>();


    public Exercise4(){
        addToSet(randomNumbers);

        System.out.println(randomNumbers);

        if(randomNumbers.contains(10)){

            System.out.println("this list contain the number 10");
        }
        else {
            System.out.println("This list doesn't contain the number 10.");

        }

        selectNumber(randomNumbers);

    }

    public void selectNumber(Set<Integer> randomNumbers ){
        Set<Integer> toRemove = new HashSet<>();
        for( Integer randnum : randomNumbers){

            if(randnum < 5){

                toRemove.add(randnum);

            }
        }
        randomNumbers.removeAll(toRemove);
        System.out.println("Numbers less than 5 removed: " + toRemove);
        System.out.println("Final set: " + randomNumbers);


    }



    public void addToSet(Set<Integer> randomNumbers ){
        Random rand  = new Random();

        while (randomNumbers.size() <= 14 ) {
            randomNumbers.add( rand.nextInt(20)+1);
        }


    }


    public static void main(String[] arg){
        new Exercise4();

    }
}
