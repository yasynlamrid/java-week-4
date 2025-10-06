package collections.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<String> words containing: "apple", "banana", "kiwi", "strawberry", "pear".
 * 2. Create a new List<String> longWords that only contains words from the first list with 5 or more letters.
 * 3. Print both lists.
 */
public class Exercise1 {

    private final List<String> words = new ArrayList<>();
    private final List<String> longWords = new ArrayList<>();

    public Exercise1() {
        words.addAll(Arrays.asList("apple", "banana", "kiwi", "strawberry", "pear"));
        System.out.println("All words: " + words);
        createLongWords();
        System.out.println("Long words (≥5 letters): " + longWords);
    }

    private void createLongWords() {
        for (String item : words) {
            if (item.length() >= 5) {
                longWords.add(item);
            }
        }
    }

    public static void main(String[] args) {
        new Exercise1();
    }
}
