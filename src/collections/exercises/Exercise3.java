package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create two sets of strings:
 - setA = ["Java", "Python", "C++", "Go"]
 - setB = ["JavaScript", "Python", "Ruby", "Go"]
 2. Find and print:
 - Languages that exist in both sets
 - Languages unique to setA
 - Languages unique to setB
 */
public class Exercise3
{

    Set<String> setA = new HashSet<>(Arrays.asList("Java", "Python", "C++", "Go"));
    Set<String> setB  = new HashSet<>(Arrays.asList("JavaScript", "Python", "Ruby", "Go"));

    public  Exercise3(){

        System.out.println("Langages communs : " + existBoth(setA, setB));
        System.out.println("Langages uniques à setA : " + uniqueSet(setA, setB));
        System.out.println("Langages uniques à setB : " + uniqueSet(setB, setA));


    }

    public List<String> existBoth(Set<String> setA , Set<String> setB){

        List<String> str= new ArrayList<>();

        for(String setC : setA){

            if (setB.contains(setC)){

                str.add(setC);
            }
        }

        return str;
    }

    public List<String> uniqueSet(Set<String> setA , Set<String> setB){

        List<String> str= new ArrayList<>();

        for(String setC : setA){

            if (!setB.contains(setC)){

                str.add(setC);
            }
        }

        return str;
    }



    public static void main(String[] args)
    {

        new Exercise3();


    }

}
