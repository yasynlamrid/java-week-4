package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a List<String> words = ["apple", "banana", "apple", "orange", "banana", "apple"].
 2. Use a Map<String, Integer> to count how many times each word appears.
 3. Print the word counts (e.g., apple → 3, banana → 2, orange → 1).
 */
public class Exercise5
{

    public Exercise5()
    {

        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> wordsmap = run(words);


        for (Map.Entry<String, Integer> entry : wordsmap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() );
        }



    }
    public Map<String, Integer> run(List<String> words )
    {
        Map<String, Integer> mapCount = new HashMap<>();
        for (String word : words){
            if(mapCount.containsKey(word)){
                mapCount.put(word, mapCount.get(word) + 1);
            }else{
                mapCount.put(word,1);
            }


        }
        return  mapCount;

    }


    public static void main(String[] args){

        new Exercise5();


    }
}
