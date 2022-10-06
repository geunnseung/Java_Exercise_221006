package java_list_exercise2_221006;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> numbers= new HashSet<>();

        for( int i=0; i<50 ; i++) {
            int r =randomNumberGenerator.generate(25);
            numbers.add(r);

        }

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
