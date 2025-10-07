package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<Integer> grades with values (55, 70, 90, 45, 82, 100, 60).
 * 2. Use an Iterator to remove all grades below 60.
 * 3. Calculate the average of the remaining grades using a for-each loop.
 * 4. Print both the filtered list and the average grade.
 */
public class Exercise4 {

    private List<Integer> grades;

    public Exercise4() {
        grades = new ArrayList<>(Arrays.asList(55, 70, 90, 45, 82, 100, 60));
        System.out.println("Original grades: " + grades);
        removeGradesBelow60();
        System.out.println("Filtered grades: " + grades);
        System.out.println("Average: " + calculateAverage());
    }

    private void removeGradesBelow60() {
        Iterator<Integer> it = grades.iterator();
        while (it.hasNext()) {
            if (it.next() < 60) it.remove();
        }
    }

    private double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static void main(String[] args) {
        new Exercise4();
    }
}