package java_list_exercise_221006;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); //tree set
        set1.add("백승근");
        set1.add("백승근");
        set1.add("승근");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);


        System.out.println(set1);
    }
}
